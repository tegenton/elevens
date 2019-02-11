/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	   String[] ranks = {"1", "2"};
	   String[] suits = {"red", "blue"};
	   int[] pointValues = {1, 2};
	   Deck b = new Deck(ranks, suits, pointValues);
	   System.out.println(b.toString());

	   Deck c = new Deck(new String[]{}, new String[]{}, new int[]{});
	   System.out.println(c.isEmpty());

	   Deck d = new Deck(suits, ranks, pointValues);
	   System.out.println(d.toString());


	}
}
