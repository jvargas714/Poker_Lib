package poker_gui;

import java.util.ArrayList;
import java.util.function.Consumer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
/*
 * Creates a table Top as the top level Stage 
 * 
 */

public class TableTop extends Stage {
	
	protected final int TABLEWIDTH = 1507;
	protected final int TABLEHEIGHT = 787;
	private StackPane backGround;
	private FlowPane p1Container, p2Container, p3Container, p4Container, 
												p5Container, p6Container;
	protected ArrayList<FlowPane> containers; 
	// protected static Double[] p1Loc, p2Loc, p3Loc, p4Loc, p5Loc, p6Loc; // in the format {x,y}
	protected ArrayList<CardNode> flippedCards = new ArrayList<CardNode>(10);	
	public FlowPane commCards;
	protected ArrayList<Double[]> locations; 
	
	
	public TableTop(String img){
		setTitle("Texas HoldEm!!!");
		Image tableTop = new Image("imgs/" + img);
		
		backGround = new StackPane();
				
		Scene playingArea = new Scene(backGround, TABLEWIDTH, TABLEHEIGHT);
		
		setScene(playingArea);
		playingArea.setRoot(backGround);
				
		// fill node with another node --> ImageView with jpg of table
		backGround.getChildren().add(new ImageView(tableTop));
		sizeToScene();
		setResizable(false);
		
		p1Container = new FlowPane();
		p2Container = new FlowPane();
		p3Container = new FlowPane();
		p4Container = new FlowPane();
		p5Container = new FlowPane();
		p6Container = new FlowPane();
		commCards = new FlowPane();
			
		
		backGround.getChildren().addAll(p1Container, p2Container, p3Container,
				p4Container, p5Container, p6Container, commCards);
		p1Container.setAlignment(Pos.BOTTOM_CENTER);
		p2Container.setAlignment(Pos.BOTTOM_RIGHT);
		p3Container.setAlignment(Pos.TOP_RIGHT);
		p4Container.setAlignment(Pos.TOP_CENTER);
		p5Container.setAlignment(Pos.TOP_LEFT);
		p6Container.setAlignment(Pos.BOTTOM_LEFT);
		commCards.setAlignment(Pos.CENTER);
		
		
		containers = new ArrayList<FlowPane>(6);
		containers.add(p1Container);
		containers.add(p2Container);
		containers.add(p3Container);
		containers.add(p4Container);
		containers.add(p5Container);
		containers.add(p6Container);
		
		setContainerPadding(20);
		
		//setUp flipped card sprites (default not visible)
		for(FlowPane container : containers){
			container.getChildren().add(new CardNode());
			container.getChildren().add(new CardNode());
		}
		
		locations= new ArrayList<Double[]>();
		
		locations.add(new Double[] {0.0, (double)TABLEHEIGHT/2});
		
		locations.add(new Double[] {(double)TABLEWIDTH/2, (double)TABLEHEIGHT/2});
		
		locations.add(new Double[] {(double)TABLEWIDTH/2, (double)(-TABLEHEIGHT/2 + 100)});
		
		locations.add(new Double[] {0.0, (double)(-TABLEHEIGHT/2 + 100)});
		
		locations.add(new Double[] {-(double)TABLEWIDTH/2, (double)(-TABLEHEIGHT/2 + 100)});
		
		locations.add(new Double[] {-(double)TABLEWIDTH/2, (double)(TABLEHEIGHT/2)});
			
		
		// set proper transforms for card positioning

		p2Container.getChildren().get(0).setRotate(-45);
		p2Container.getChildren().get(1).setRotate(-45);
		p2Container.getChildren().get(1).setTranslateX(-20);    	
		p2Container.getChildren().get(1).setTranslateY(-50);
		
		p3Container.getChildren().get(0).setRotate(45);
		p3Container.getChildren().get(1).setRotate(45);
		p3Container.getChildren().get(1).setTranslateX(-20);    	
		p3Container.getChildren().get(1).setTranslateY(50);
		
		p5Container.getChildren().get(0).setRotate(-45);
		p5Container.getChildren().get(1).setRotate(-45);
		p5Container.getChildren().get(0).setTranslateX(20);    	
		p5Container.getChildren().get(0).setTranslateY(50);
		
		p6Container.getChildren().get(0).setRotate(45);
		p6Container.getChildren().get(1).setRotate(45);
		p6Container.getChildren().get(0).setTranslateX(20);
		p6Container.getChildren().get(0).setTranslateY(-50);
			
		show();
	}
	
	private void setContainerPadding(double pixels){
		containers.forEach(new Consumer<FlowPane>(){
			@Override
			public void accept(FlowPane container) {
				container.setPadding(new Insets(10));				
			}			
		});
	}
	
	public void displayPlayerCard(int playerIndex, int CardInd){
		containers.get(playerIndex).getChildren().get(CardInd).setVisible(true);
	}
	
	public void addElement(Node el){
		backGround.getChildren().add(el);
		System.out.println("Debug: element added to backGround, new size: " + backGround.getChildren().size());

	}
	
	public void removeElement(Node el){
		backGround.getChildren().remove(el);
		System.out.println("Debug: element removed from backGround, new size: " + backGround.getChildren().size());

	}
	
	public void replacePlayerCardNode(int playerIndex, int nodeIndex, Node replacement){
		containers.get(playerIndex).getChildren().remove(nodeIndex);
		containers.get(playerIndex).getChildren().add(replacement);
	}
	
}