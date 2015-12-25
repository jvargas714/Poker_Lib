package poker;

import java.util.*;


public class PokerMain {
	private static final String[] hand = {
		"high", "pair", "twoPair", "trips", "straight",
		"flush", "fullHouse", "fourOfAKind", "straightFlush", "royalFlush"};
	
	public static final int[] high = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	public static final int[] pair = {22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34}; 
	public static final int[] twoPair = {42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54};
	public static final int[] trips = {62, 63, 64,  65, 66, 67,  68, 69, 70,  71, 72, 73, 74};
	public static final int[] straight = {82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94};	// highest ranking card 
	public static final int[] flush = {102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114};  // highest ranking card 
	public static final int[] fullHouse = {122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134}; // highest three wins tie 
	public static final int[] fourOfAKind = {142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154};
	public static final int[] straightFlush = {162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174}; // highest rank of flush
	public static final int[] royalFlush = {1000};
	public static final int[][] allHandWeights = {high, pair, twoPair, trips, straight, flush, fullHouse, fourOfAKind,
													straightFlush, royalFlush};
	
	public static Hashtable<String, int[]> weights = new Hashtable<String, int[]>();
	
	
		
	public static void main(String[] args) 
	{ 
	
		for(int i = 0; i < hand.length; i++)
		{						
				weights.put(hand[i], allHandWeights[i]);
		}
		
		System.out.println(weights.get("straight")[3]);
		
		
		
		/*
		boolean randDome = false; 
		Random rand = new Random();
		int ranks[] = new int[5];
		int suits[] = new int[5];
		
		if(randDome){
			for(int i = 0; i < 5; i++){
				ranks[i] = rand.nextInt(13);
				suits[i] = rand.nextInt(4);
			}
		}
		else{
			ranks[0] = 8;
			ranks[1] = 9;
			ranks[2] = 10;
			ranks[3] = 12;
			ranks[4] = 11;
			suits[0] = 2;
			suits[1] = 2;
			suits[2] = 2;
			suits[3] = 2;
			suits[4] = 2;
		}
		
		System.out.println("Ranks being dealt out!");
		for(int x : ranks){
			System.out.print(x + " ");
		}System.out.println("\n");
		
		for(int x : suits){
			System.out.print(Card.suit[x] + " ");
		}System.out.println("\n \n");
								
		System.out.println("\n \n \n \n ------------------------Test Game--------------------- \n \n \n \n ");
		TexasHoldem testGame = new TexasHoldem();
		testGame.dealCard("Jay", new Card(ranks[0], suits[0]));
		testGame.dealCard("Jay", new Card(ranks[1], suits[1]));
		testGame.dealCard("Jay", new Card(ranks[2], suits[2]));
		testGame.dealCard("Jay", new Card(ranks[3], suits[3]));
		testGame.dealCard("Jay", new Card(ranks[4], suits[4]));
		
		Card[] twoPair = testGame.getTwoPair("Jay");
		Card[] trips = testGame.getTrips("Jay");
		Card[] fourOfAKind = testGame.getFourOfAKind("Jay");
		Card[] pair = testGame.getPair("Jay");
		Card[] straight = testGame.getStraight("Jay");
		Card[] flush = testGame.getFlush("Jay");
		Card[] fullHouse = testGame.getFullHouse("Jay");
		Card[] strghtFlush = testGame.getStraightFlush("Jay");
		Card[] royalFlush = testGame.getRoyalFlush("Jay");
		
		if(pair != null){
			for(Card cd : pair){
				System.out.println(cd.idCard());
			}
		}
			
		else if(trips != null){
			int cnt = 0;
			for(Card cd : trips){
				cnt++;
				System.out.println("Card#: " + cnt + " Card: " + cd.idCard());
			}
		}
		
		else if(twoPair != null){
			for(Card cd :twoPair){
				System.out.println(" Card: " + cd.idCard());
			}	
		}
		
		else if(fourOfAKind != null){
			for(Card cd :fourOfAKind){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else if(straight != null){
			for(Card cd:straight){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else if(flush != null){
			for(Card cd: flush){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else if(fullHouse != null){
			for(Card cd: fullHouse){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else if(strghtFlush != null){
			for(Card cd: strghtFlush){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else if(royalFlush != null){
			for(Card cd: royalFlush){
				System.out.println(" Card: " + cd.idCard());
			}
		}
		
		else	
			System.out.println("\n Jay Has nothing!!!!\n \n \n ");
			// System.out.println("stgt flush test: " + testGame.hasStraightFlush("Jay"));
	  */
	}

}
