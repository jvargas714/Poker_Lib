package poker;

public class DeckSizeException extends Exception 
{
	/**
	 * Exception to indicate that deck was constructed not having 52 elements (CARDS)  
	 */
	private static final long serialVersionUID = 1L;

	public DeckSizeException(){}
	
	public DeckSizeException(String message)
	{
		super(message);
	}
}
