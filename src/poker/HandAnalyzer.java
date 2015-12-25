package poker;

public interface HandAnalyzer 
{
	
	boolean hasPair(String name);
	
	boolean hasTwoPair(String name);
	
	boolean hasTrips(String name);
	
	boolean hasFourOfAKind(String name);
	
	boolean hasStraight(String name);
	
	boolean hasFlush(String name);
	
	boolean hasFullHouse(String name);
	
	boolean hasStraightFlush(String name);
	
	boolean hasRoyalFlush(String name);
	
	Card[] getPair(String name);
	
	Card[] getTwoPair(String name);
	
	Card[] getTrips(String name);
	
	Card[] getFourOfAKind(String name); 
	
	Card[] getStraight(String name);
	
	Card[] getFlush(String name); 
	
	Card[] getFullHouse(String name);
	
	Card[] getStraightFlush(String name);
	
	Card[] getRoyalFlush(String name);
		
}