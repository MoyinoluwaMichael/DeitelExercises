package chapterEight.selfAssessment.memoryGame;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MemoryGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();
    private static final String [] shufflingMessage = new String[]{"Shuffling", "Key your eyes on the cards",
            "Don't lose focus", "E go soon shock you"};
    private static boolean inputIsValidated;


    public static void playGame() throws InterruptedException {
        String[] deck = Memory.generateDeck();
        addLines();
        System.out.println(Arrays.toString(deck));
        load("Starting game", 5);
        for (int i = 0; i < 4; i++) {
            deck = shuffle(deck);
        }
            do {
                addLines();
                hideDeck();
                int userInput = scanner.nextInt();
                validateInput(userInput);
                addLines();
                System.out.print(Memory.confirmResponse(userInput));
                if (!Memory.gameIsWon()){
                    load("Trying again", 5);
                }
            } while (!inputIsValidated);


    }

    private static void load(String message, int seconds) throws InterruptedException {
        System.out.print(message);
        for (int i = 0; i < seconds; i++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private static void validateInput(int userInput) {
        if (userInput < 1 || userInput > 5) {
            throw new IllegalArgumentException("Wrong Input. Number must be between 1 and 5");
        }
        inputIsValidated = true;
    }

    private static void hideDeck() {
        String randomCard = Memory.getRandomCard();
        System.out.println(Arrays.toString(Memory.getHiddenDeck()));
        System.out.println(" 1, 2, 3, 4, 5");
        System.out.println("Where is " + randomCard + " hidden?");
    }

    private static String[] shuffle(String[] deck) throws InterruptedException {
        deck = Memory.shuffleDeck(deck);
        addLines();
        System.out.println(Arrays.toString(deck));
        load(shufflingMessage[random.nextInt(4)], 1);
        TimeUnit.SECONDS.sleep(2);
        return deck;
    }
    private static void addLines(){
        System.out.println("""
                
                
                
                
                
                
                
                
                
                """);
    }
}
