package poker;

public class Tester2 {

	public static void main(String[] args) {
		
		TexasHoldem game = new TexasHoldem(50, 100);
		// "H", "D", "C", "S";
		
		Card cd1 = new Card(5, 2);
		Card cd2 = new Card(12, 2);
		Card cd3 = new Card(3, 0);
		Card cd4 = new Card(0, 0);
		Card cd5 = new Card(12, 3);
		
		Card hole1 = new Card(3, 1);
		Card hole2 = new Card(12, 1);
		
		
		game.tableCards.add(cd1);
		game.tableCards.add(cd2);
		game.tableCards.add(cd3);
		game.tableCards.add(cd4);
		game.tableCards.add(cd5);
		
		
		for(Card cd: game.tableCards)
			System.out.println(cd);
		
		game.dealCard("Jay", hole1);
		game.dealCard("Jay", hole2);
		
		game.dealCard("Kelsey", hole2);
		game.dealCard("Kelsey", hole1);
		
		game.showHand("Jay");
		
		System.out.println("Weights: ");
		game.findHand("Jay");
		game.findHand("Kelsey");
		
		game.findWinner();
		
		
		
		
		
	}

}
