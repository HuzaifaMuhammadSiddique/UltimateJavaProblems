public class PlayingWithCards {

    public static void main(String[] args) {

        int[] deck = new int[52];

        int[] newDeck = fillDeck(deck);

        printIntArray(deck);
        String[] symbolizedNewDeck = symbolizeDeck(newDeck);
        printStringArray(symbolizedNewDeck);

        System.out.println("\n ------------------------------------------------------------------");

        int[] shuffledDeck = shuffleDeck(deck, 520);
        printIntArray(deck);
        System.out.println(cardName(shuffledDeck[0]));
        System.out.println(symbolizeCard(shuffledDeck[0]));

        System.out.println("------------------------------------------------------------------");

        String[] symbolizedDeck = symbolizeDeck(shuffledDeck);
        printStringArray(symbolizedDeck);

        randomCardPicker(symbolizedDeck);
        System.out.println("---------------------------------------------------------------------");
//        randomCardsPicker(symbolizedDeck, 10);
    }

    public static void randomCardPicker(String[] deck) {
        int choice = generateRandomInt(0, 51);
        System.out.println(deck[choice]);
    }
/*
    public static void randomCardsPicker(String[] deck, int numberOfCards) {
        int[] cards = differentRandomNumberGenerator(1,52,numberOfCards);
        for (int index : cards){
            System.out.println(deck[index]);
        }

    }

    public static int[] differentRandomNumberGenerator(int min, int max, int times) {
        int[] generated = new int[times];

        int iterations = 0;
        int randomNumber;

        do {
            randomNumber = (int) (Math.random() * (max - min + 1)) + min;
            generated[iterations] = randomNumber;
            iterations++;
            
            
        } while (isPresent(generated, randomNumber) != true || iterations < times);
        
        
        
        return generated;
    }

    static boolean isPresent(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true; // Item found
            }
        }
        return false; // Item not found
    }

*/



    public static String[] symbolizeDeck(int[] deck) {
        String[] finalDeck = new String[deck.length];

        for (int i = 0; i < deck.length; i++) {
            finalDeck[i] = symbolizeCard(deck[i]);
        }

        return finalDeck;

    }

    public static void printStringArray(String[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("]");
    }

    public static String symbolizeCard(int number) {
        String name = "";
        String spades = "♠";  //0
        String hearts = "♥";  //1
        String clubs = "♣";   //2
        String diamonds = "♦"; //3
        int suitNumber = (number - 1) / 13;
        int cardNumber = (number - 1) % 13;

        switch (suitNumber) {
            case 0:
                name = name + spades;
                break;
            case 1:
                name = name + hearts;
                break;
            case 2:
                name = name + clubs;
                break;
            case 3:
                name = name + diamonds;
                break;
            default:
                return "";
        }
        switch (cardNumber) {
            case 0:
                name = name + "A";
                break;
            case 1:
                name = name + "2";
                break;
            case 2:
                name = name + "3";
                break;
            case 3:
                name = name + "4";
                break;
            case 4:
                name = name + "5";
                break;
            case 5:
                name = name + "6";
                break;
            case 6:
                name = name + "7";
                break;
            case 7:
                name = name + "8";
                break;
            case 8:
                name = name + "9";
                break;
            case 9:
                name = name + "10";
                break;
            case 10:
                name = name + "J";
                break;
            case 11:
                name = name + "Q";
                break;
            case 12:
                name = name + "K";
                break;
            default:
                return "";
        }

        switch (suitNumber) {
            case 0:
                name = name + spades;
                break;
            case 1:
                name = name + hearts;
                break;
            case 2:
                name = name + clubs;
                break;
            case 3:
                name = name + diamonds;
                break;
            default:
                return "";
        }

        return name;
    }

    public static String cardName(int number) {
        String name = "";
        int suitNumber = (number - 1) / 13;
        int cardNumber = (number - 1) % 13;

        switch (cardNumber) {
            case 0:
                name = name + "Ace of ";
                break;
            case 1:
                name = name + "Two of ";
                break;
            case 2:
                name = name + "Three of ";
                break;
            case 3:
                name = name + "Four of ";
                break;
            case 4:
                name = name + "Five of ";
                break;
            case 5:
                name = name + "Six of ";
                break;
            case 6:
                name = name + "Seven of ";
                break;
            case 7:
                name = name + "Eight of ";
                break;
            case 8:
                name = name + "Nine of ";
                break;
            case 9:
                name = name + "Ten of ";
                break;
            case 10:
                name = name + "Joker of ";
                break;
            case 11:
                name = name + "Queen of ";
                break;
            case 12:
                name = name + "King of ";
                break;
            default:
                return "";
        }

        switch (suitNumber) {
            case 0:
                name = name + "Spades";
                break;
            case 1:
                name = name + "Hearts";
                break;
            case 2:
                name = name + "Clubs";
                break;
            case 3:
                name = name + "Diamonds";
                break;
            default:
                return "";
        }

        return name;
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
