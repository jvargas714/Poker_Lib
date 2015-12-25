package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.System;

public class Deck
{
	ArrayList<Card> deck = new ArrayList<Card>(52);
	
	public Deck()
	{
		try{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				Card card = new Card(j, i);
				deck.add(card);  // fills deck one card at a time
			}
		}
		
		if (deck.size() != 52){
		throw new DeckSizeException("Error: Deck.size() != 52");
		}
			}
		catch (DeckSizeException ex)
		{ex.printStackTrace();}
		
		System.out.println("Deck sucessfully created!");
	}
	
		
	void shuffleDeck()
	{
		// seed and shuffle deck 
		long seed = System.nanoTime();
		Collections.shuffle(deck, new Random(seed));
		System.out.println("Deck Shuffled....." + " seed #: " + seed + "\n");
		
	}
	
	
	public Card showCard(int index)
	{
		return deck.get(index); 
	}
	
		
	public void resetDeck()
	{	//empty and refill and shuffle deck object 
		deck.clear();
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				Card card = new Card(j, i);
				deck.add(card);  // fills deck one card at a time
			}
		}
		
		shuffleDeck();		
	}
	
	public Card dealCard(){
		/*
		 * Deals card and removes it from the top of the deck
		 */		
		Card card = this.deck.get(0);
		deck.remove(0);		
		return card; 
	}
	
		
	public int numCardsLeft()
	{
		return deck.size();
	}
		
}