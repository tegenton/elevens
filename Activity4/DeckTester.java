/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Create and Shuffle Standard Deck ****");
		String[] standardRanks = new String[13];
		for (int i = 0; i < standardRanks.length; i++) {
			switch (i) {
				case 0:
					standardRanks[i] = "ace";
					break;
				case 10:
					standardRanks[i] = "jack";
					break;
				case 11:
					standardRanks[i] = "queen";
					break;
				case 12:
					standardRanks[i] = "king";
					break;
				default:
					standardRanks[i] = String.valueOf(i + 1);
			}
		}
		String[] standardSuits = {"hearts", "diamonds", "spades", "clubs"};
		int[] standardValues = java.util.stream.IntStream.rangeClosed(1,13).toArray();

		Deck standardDeck = new Deck(standardRanks, standardSuits, standardValues);
		System.out.println(standardDeck.toString());
	}
}
