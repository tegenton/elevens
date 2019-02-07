/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    Card aceOfSpades = new Card("Ace", "Spades", 99);
	    Card aceOfDiamonds = new Card("Ace", "Diamonds", 5);
	    Card secondAce = new Card("Ace", "Diamonds", 5);
	    System.out.println("This is the " + aceOfSpades.toString());
	    System.out.println(aceOfDiamonds.suit() + " and " + aceOfSpades.suit() + " returns " + aceOfDiamonds.matches(aceOfSpades));
	    System.out.println(aceOfDiamonds.matches(secondAce));
	}
}
