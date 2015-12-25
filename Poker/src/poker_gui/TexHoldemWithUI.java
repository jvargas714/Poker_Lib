package poker_gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class TexHoldemWithUI extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage arg0){
		TexHoldem_UI game = new TexHoldem_UI(50, 100);
		game.enterGame("asshole", 1200);
		game.enterGame("Jack0Robinson", 18000);
		game.enterGame("McTool", 12000);
		game.enterGame("Dave", 1200);
		game.dealHands();
		
	}

}
