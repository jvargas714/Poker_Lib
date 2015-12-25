package poker;
import poker.TexasHoldem;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TexasHoldem tx = new TexasHoldem(25, 50);
		tx.enterGame("gg");
		tx.enterGame("dd");
		tx.enterGame("qq");
		
		System.out.println(tx);
		
		tx.removeRangeOfPlayers( 3, tx.getNumPlayers() );
		
		System.out.println(tx);
		System.out.println("number of players " + tx.getNumPlayers());


	}

}
