package chapterEight.selfAssessment.memoryGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class Memory {
    private static final SecureRandom random = new SecureRandom();
    private static final String[] alphabets = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] numerics = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static String[] deck = new String[5];
    private static final String [] chosenIndexes = new String[5];
    private static final String[] hiddenDeck = new String[]{"X", "X", "X", "X", "X"};
    private static String randomCard;
    private static boolean isWon;
    private static final String help = "Try to remember the position of each card while they are " +
            "       swiping and guess which card is the designated one.";
    public static String displayMenu(){
        return """
                MEMORY GAME
                1. Play Game
                2. Help""";
    }
    public static String[] generateDeck() {
        String [] chosenAlphabetIndexes = new String[5];
        Arrays.fill(chosenAlphabetIndexes, "");
        String [] chosenNumericsIndexes = new String[5];
        Arrays.fill(chosenNumericsIndexes, "");
        for (int i = 0; i < deck.length; i++) {
            int randomAlphaNumeric = random.nextInt(2);
            switch (randomAlphaNumeric) {
                case 0 -> {
                    int index = random.nextInt(alphabets.length);
                    if (indexIsTaken(index, chosenAlphabetIndexes)){
                        i -= 1;
                    }
                    else {
                        chosenAlphabetIndexes[i] = String.valueOf(index);
                        deck[i] = alphabets[index];
                    }
                }
                case 1 -> {
                    int index = random.nextInt(numerics.length);
                    if (indexIsTaken(index, chosenNumericsIndexes)){
                        i -= 1;
                    }
                    else {
                        chosenNumericsIndexes[i] = String.valueOf(index);
                        deck[i] = numerics[index];
                    }
                }
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deckOfCards) {
        Arrays.fill(chosenIndexes, "");
        String [] deckCopy = Arrays.copyOf(deckOfCards, deckOfCards.length);
        for (int i = 0; i < deckOfCards.length; i++) {
            int index = random.nextInt(deckOfCards.length);
            if (!indexIsTaken(index, chosenIndexes)){
                chosenIndexes[i] = String.valueOf(index);
                deckCopy[i] = deckOfCards[index];
            }
            else {
                i -= 1;
            }
        }
        deck = deckCopy;
        return deckCopy;
    }

    private static boolean indexIsTaken(int index, String [] list) {
        for (String chosenIndex : list) {
            if (chosenIndex.equals(String.valueOf(index))) {
                return true;
            }
        }
        return false;
    }

    public static String[] getHiddenDeck() {
        return hiddenDeck;
    }

    public static String getRandomCard() {
        randomCard = deck[random.nextInt(5)];
        return randomCard;
    }

    public static String confirmResponse(int userInput) {
        int index = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].equalsIgnoreCase(randomCard)){
                index = i;
            }
        }
        if (index == userInput-1){
            isWon = true;
            return winningMessage();
        }
        else {
            isWon = false;
            return incorrectMessage();
        }
    }

    private static String winningMessage() {
        return String.format("""
                    Correct!
                    %s
                     1, 2, 3, 4, 5
                    """, Arrays.toString(Memory.getDeck()));
    }private static String incorrectMessage() {
        return String.format("""
                    Incorrect!
                    %s
                     1, 2, 3, 4, 5
                     %s is located at %d
                    """, Arrays.toString(Memory.getDeck()), randomCard, getRandomCardIndex()+1);
    }

    public static boolean gameIsWon() {
        return isWon;
    }
    public static String [] getDeck(){
        return deck;
    }
    public static String getHelp(){
        return help;
    }
    private static int getRandomCardIndex(){
        for (int i = 0; i < deck.length; i++) {
            if (randomCard.equals(deck[i])){
                return i;
            }
        }
        return 0;
    }
}
