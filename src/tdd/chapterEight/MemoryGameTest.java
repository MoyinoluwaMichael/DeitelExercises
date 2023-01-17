package tdd.chapterEight;

import chapterEight.selfAssessment.memoryGame.Memory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MemoryGameTest {

    Memory memory = new Memory();

    @Test
    public void testThatTheGameExist() {
        Memory memory = new Memory();
        assertNotNull(memory);
    }

    @Test
    public void testThatTheGameDisplaysArrayOfBothIntegersAndAlphabetsOfFiveLength() {
//      Given that there is a memory game
//      When I play the game
        String[] deck = Memory.getDeck();
//      check that it randomly displays a list of both integers and alphabets of five length
        int length = deck.length;

        System.out.println(Arrays.toString(deck));
        for (int i = 0; i < length; i++) {
            assertNotNull(deck[i]);
        }
    }

    @Test
    public void testThatTheContentsOfTheDeckAreShuffled() {
//       Given I have a deck of cards containing M at index 4
        String[] deck = new String[]{"A", "2", "T", "6", "M"};
        int firstIndex = Arrays.binarySearch(deck, "M");
        System.out.println("Before shuffling -> " + Arrays.toString(deck));
//       When I shuffle the deck
        deck = Memory.shuffleDeck(deck);
//        Check that M is no more at index 4
        int secondIndex = Arrays.binarySearch(deck, "M");
        System.out.println("Second index -> " + Arrays.toString(deck));

        assertNotEquals(firstIndex, secondIndex);
    }

    @Test
    public void testThatTheContentOfTheDeckCanBeHiddenAfterShuffling() {
//       Given I have a deck of cards containing M at index 4
        String[] deck = new String[]{"G", "7", "K", "2", "Z"};
//       When I shuffle the deck
        deck = Memory.shuffleDeck(deck);
//       Check that the contents of of the deck are hidden i.e, becomes X

    }
}
