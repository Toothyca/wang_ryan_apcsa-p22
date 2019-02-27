package activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		//create 3 decks, ranks, suits vals
		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"clubs", "spades", "hearts"};
		int[] vals1 = {11, 12, 13};
		
		Deck deck1 = new Deck(ranks1, suits1, vals1);
		
		String[] ranks2 = {"two", "one", "nine"};
		String[] suits2 = {"diamond", "hearts", "spades"};
		int[] vals2 = {2, 1, 9};
		
		Deck deck2 = new Deck(ranks2, suits2, vals2);
		
		String[] ranks3 = {"queen", "ace", "six"};
		String[] suits3 = {"clubs", "hearts", "diamonds"};
		int[] vals3 = {12, 14, 6};
		
		Deck deck3 = new Deck(ranks3, suits3, vals3);
		
		//print decks, size, deals
		int stationary = deck1.size();
		for (int j = 0; j < stationary; j++)
		{
			System.out.println(deck1.deal());
		}
		for (int i = 0; i < 4; i++)
		{
			System.out.println(deck2.deal() + "\n" + deck3.deal() + "\n");

		}
		System.out.println(deck1.size());
		System.out.println(deck2.size());
		System.out.println(deck3.size());

		
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());
		
		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);

	}
}