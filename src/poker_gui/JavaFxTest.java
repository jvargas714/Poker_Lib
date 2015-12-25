package poker_gui;
 
import javafx.application.Application;
import poker.*;
import javafx.stage.Stage;
 
public class JavaFxTest extends Application {
    public static void main(String[] args) {
        launch(args);        				
    }
    
    @Override
    public void start(Stage primaryStage){
    	
    	TableTop table = new TableTop("tableTop.jpg");
    	
    	
    	
        for(int i = 0 ; i<5; i++){
        	table.commCards.getChildren().add(new CardNode(new Card()));
        }
                    
    }
}