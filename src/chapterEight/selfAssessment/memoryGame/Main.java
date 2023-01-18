package chapterEight.selfAssessment.memoryGame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Memory.displayMenu());
        int menu = scanner.nextInt();
        while (menu < 1 || menu > 2) {
            System.out.println("Wrong input.");
            System.out.println(Memory.displayMenu());
            menu = scanner.nextInt();
        }
        switch (menu) {
            case 1 -> {
                do {
                    try {
                        MemoryGame.playGame();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } while (!Memory.gameIsWon());
            }
            case 2 -> {
                System.out.println(Memory.getHelp());
            }
        }
    }
}
