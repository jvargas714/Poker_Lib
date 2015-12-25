package poker_gui;

import poker.Card;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardNode extends ImageView{

	private String rank, suit;
	public static int cardNum = 0; 
	
	public CardNode(Card card){
		 super(new Image("imgs/"+card.getRank() + card.getSuit() + ".png"));
		 setVisible(false);
	}
	
	public CardNode(){
		// constructor for a flipped card 
		super(new Image("imgs/"+"flipped.png"));
		setVisible(false);
	}
	
	
}
