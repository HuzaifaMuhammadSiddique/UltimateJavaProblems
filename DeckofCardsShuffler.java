public class DeckofCardsShuffler {
    public static void main(String[] args) {
        int[] deck = new int[52];

        // Filling the deck with numbers from 1 to 52 (1 represents Ace of Spades and 52 represents King od Diamonds).    
        fillDeck(deck);

        // Printing the original(unshuffled) deck of cards.
        printIntArray(deck);

        // Printing a dotted line for better visuals.
        System.out.println("------------------------------------------------------------------");

        // Shuffles the deck hundred times (one shuffle swaps two cards)
        shuffleDeck(deck, 100);
      
        // Printing the final(shuffled) deck.
        printIntArray(deck);

    }

    public static int[] shuffleDeck(int[] array, int noOfShuffles) {
        for (int i = 0; i < noOfShuffles; i++) {
            int previousPlace = generateRandomInt(0, 51);
            int nextPlace = generateRandomInt(0, 51);

            int temp = array[nextPlace];
            array[nextPlace] = array[previousPlace];
            array[previousPlace] = temp;

        }

        return array;
    }

    public static int[] fillDeck(int[] array) {
        for (int i = 1; i <= 52; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void printIntArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("] \n");
    }

}
