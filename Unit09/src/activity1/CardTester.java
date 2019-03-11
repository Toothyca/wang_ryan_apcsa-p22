package activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card jack = new Card("jack", "clubs", 10);
		Card queen = new Card("queen", "spades", 11);
		Card king = new Card("king", "hearts", 12);
		Card otherjack = new Card("jack", "diamonds", 10);
		
		System.out.println(jack.suit() + " " + jack.rank() + " " + jack.pointValue() + " " + jack.matches(otherjack) + " " + jack);
		System.out.println(queen.suit() + " " + queen.rank() + " " + queen.pointValue() + " " + queen.matches(queen) + " " + queen);
		System.out.println(king.suit() + " " + king.rank() + " " + king.pointValue() + " " + king.matches(king) + " " + king);
	}
}
