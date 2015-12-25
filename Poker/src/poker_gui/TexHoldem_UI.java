package poker_gui;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import poker.TexasHoldem;


/**
 * @author Jay
 * 
 * TODO: 
 * 	1. for dealing flop create a Group flopGp = new Group to animate them 
 * 
 *
 */
public class TexHoldem_UI extends TexasHoldem {

	private TableTop table;
	
	public TexHoldem_UI(int smallBlind, int bigBlind){
		super(smallBlind, bigBlind);
		table = new TableTop("tableTop.jpg");
		
	}
	
	public void dealHands(){
		/**game deals hands and animates cards being dealt
		 * Deals hands out in order from player 1 to 6
		 * use numPlayers 
		 */
		super.dealHands();
		
		// flips cards for p1
		CardNode p1Card1 = new CardNode(players.get(0).getHand().get(0));
		CardNode p1Card2 = new CardNode(players.get(0).getHand().get(1));		
		table.replacePlayerCardNode(0, 0, p1Card1);
		table.replacePlayerCardNode(0, 0, p1Card2);
		
		int cardNum = 0;
		//cards for other players will just be flipped cards
		for(int i = 0; i<2; i++){
			
			
			for(int j = 0; j<super.numPlayers; j++){
				
				// constants for iteration 
				final int playerIndex = j;
				final int cardIndex = cardNum;
				
				
				// create dummy card for animation 
				CardNode dummyCard = new CardNode();
				dummyCard.setVisible(true);
				
				// default location should be (0,0)
				dummyCard.setTranslateX(-table.TABLEWIDTH/2);
				dummyCard.setTranslateY(-table.TABLEHEIGHT/2);
				table.addElement(dummyCard);
				
				
				
				Timeline timeLine = new Timeline();
				timeLine.setCycleCount(1);
				
				System.out.println("table.locations.get(j)[0] ---> " + table.locations.get(j)[0] + "\n");
				KeyValue keyValX = new KeyValue(dummyCard.translateXProperty(), table.locations.get(j)[0]);
				KeyValue keyValY = new KeyValue(dummyCard.translateYProperty(), table.locations.get(j)[1]);
				
				
				
				Duration duration = Duration.millis(250); // 1 sec animation
				
				
				// when card reaches destination we can set card to being visible on the table 
				EventHandler onArrival = new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent event){
						table.removeElement(dummyCard);
						table.displayPlayerCard(playerIndex, cardIndex);
					}					
				};
				
				KeyFrame keyFrame = new KeyFrame(duration, onArrival, keyValX, keyValY);
				
				// adding keyframes to the timeline 
				timeLine.getKeyFrames().add(keyFrame);
				timeLine.play();
				
			}
			
			cardNum++;
		}
		
		
		
	}
	
	public void dealFlop(){
		
	}
}