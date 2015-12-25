package poker;
import java.util.Enumeration;
// abstract class to provide framework for a method to rank hands obtained in poker 
import java.util.Hashtable;

abstract class WeightOfHand 
{
	
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
	
	public WeightOfHand()
	{
		for(int i = 0; i < hand.length; i++)
		{
			weights.put(hand[i], allHandWeights[i]);
		}
	}
	
	
	public String findHandType(int value){
		// with a given value finds corresponding key or handType
	
		Enumeration<int[]> elements = weights.elements();
		Enumeration<String> keys = weights.keys(); 
		String type = null; 
		
		while(keys.hasMoreElements()){
			
			if(type != null)
				break;
			
			int[] values = elements.nextElement();
			String current = keys.nextElement();
			// System.out.println(current);
			
			for(int i: values){
				
				if(i == value){
					type = current; 
					break;
				}
			}
		}
		
		return type; 
	}
	
	abstract int findWeight(String handType, int rank);  // can input weights
	
}