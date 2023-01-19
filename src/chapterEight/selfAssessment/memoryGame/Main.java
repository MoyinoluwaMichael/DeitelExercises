package chapterEight.selfAssessment.memoryGame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String... args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        switch (Memory.displayMenu()) {
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
                int help = scanner.nextInt();
                if (help == 0) {
                    main();
                }
            }
        }
    }
}
