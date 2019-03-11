package activity4;


/**
 * This is a class that tests the Deck class.
 */
public class DeckTesterArrayListVer {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		//create 3 decks, ranks, suits vals
		String[] ranks1 = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits1 = {"diamonds", "clubs", "spades", "hearts"};
		int[] vals1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		DeckArrayListVer deck1 = new DeckArrayListVer(ranks1, suits1, vals1);
		
		String[] ranks2 = {"jack", "queen", "king"};
		String[] suits2 = {"diamonds", "clubs", "spades", "hearts"};
		int[] vals2 = {11, 12, 13};
		
		DeckArrayListVer deck2 = new DeckArrayListVer(ranks2, suits2, vals2);
		
		//print decks, size, deals
		int constant = deck1.size();
		System.out.println(deck1.size());
		
		for (int i = 0; i < constant; i++)
		{
			deck1.deal();
		}
		System.out.println(deck1.isEmpty());
		System.out.println(deck1);
		
		deck1.shuffle();
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		deck2.shuffle();
		System.out.println(deck2);
		deck2.shuffle();
		System.out.println(deck2);
		deck2.shuffle();
		System.out.println(deck2);
	}
}