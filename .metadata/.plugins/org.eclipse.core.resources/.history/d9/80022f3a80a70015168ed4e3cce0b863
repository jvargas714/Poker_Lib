package poker;
import java.util.Random;

public class Card implements Comparable<Card> {
	
	private String rk, st;
	protected int rankInd, suitInd;
	private static String [] suit = {"h", "d", "c", "s"};
	private static String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "a"};  // index: 0-12
	Random numGen = new Random();
	
	public Card(int rk, int st)
	{
		this.rk = rank[rk]; 
		this.st = suit[st];
		this.rankInd = rk; // rank index available 
		this.suitInd = st; // suit index available 
	}
	
	public Card()
	{
		int rankIndex = numGen.nextInt(13);
		int suitIndex = numGen.nextInt(4);
		this.rk = rank[rankIndex];
		this.st = suit[suitIndex];
		this.rankInd = rankIndex; // rank index available 
		this.suitInd = suitIndex;	// suit index available 
	}
	
	public String getRank(){
		return rk;
	}
	
	public int getRankInd(){
		return rankInd; 
	}
	
	public String getSuit(){
		return st;
	}
	
	@Override
	public String toString()
	{
		String card = rk + st;
		return card;
	}

	@Override
	public int compareTo(Card card) {
		/*
		 * A way to compare ranking of cards by implementing Comparable
		 */
		final int equal = 0;
		final int less = -1;
		final int greater = 1;
		
		// comparing rank of cards 
		if(this.getRankInd() > card.getRankInd()) return greater;
		if(this.getRankInd() < card.getRankInd()) return less;
		else return equal;
		}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		
		if(!(obj instanceof Card)) return false;
		
		Card card = (Card)obj;
		
		//both rank and suit have to be equal 
		return this.rankInd == card.rankInd && this.st == card.st;
	}
	
	@Override
	public int hashCode(){
		return this.rankInd * this.suitInd;
	}
	
}
