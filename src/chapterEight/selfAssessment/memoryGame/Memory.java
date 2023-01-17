package chapterEight.selfAssessment.memoryGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class Memory {
    private static final SecureRandom random = new SecureRandom();
    private static final String[] alphabets = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] numerics = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] deck = new String[5];
    private static final String [] chosenIndexes = new String[deck.length];

    public static String[] getDeck() {
        for (int i = 0; i < deck.length; i++) {
            int randomAlphaNumeric = random.nextInt(2);
            switch (randomAlphaNumeric) {
                case 0 -> {
                    int index = random.nextInt(alphabets.length);
                    deck[i] = alphabets[index];
                }
                case 1 -> {
                    int index = random.nextInt(numerics.length);
                    deck[i] = numerics[index];
                }
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Arrays.fill(chosenIndexes, "");
        String [] deckCopy = Arrays.copyOf(deck, deck.length);
        for (int i = 0; i < deckCopy.length; i++) {
            int index = random.nextInt(deck.length);
            if (!indexIsTaken(index)){
                chosenIndexes[i] = String.valueOf(index);
                deckCopy[i] = deck[index];
            }
            else {
                i -= 1;
            }
        }
        return deckCopy;
    }

    private static boolean indexIsTaken(int index) {
        for (String chosenIndex : chosenIndexes) {
            if (chosenIndex.equals(String.valueOf(index))) {
                return true;
            }
        }
        return false;
    }
}
