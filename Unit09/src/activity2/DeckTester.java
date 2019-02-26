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
		//print decks, size, deals
		
		System.out.println(deck1);
		System.out.println(deck1.size());
	}
}