package chapterSix.selfAssessment.guessApp;

import java.util.Scanner;

public class GuessTheNumberApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int response;

        do {
            GuessGame.resetNewPlayerCount();
            GuessGame.registerPlayer();

            do {
                GuessGame.generateLuckyNumber();

                GuessGame.displayMenu();
                int menu = scanner.nextInt();
                while (menu < 1 || menu > 2) {
                    GuessGame.displayMenu();
                    menu = scanner.nextInt();
                }
                if (menu == 1) {
                    GuessGame.setWager();
                    do {
                        GuessGame.playGame();
                    } while (GuessGame.players[Player.currentPlayer - 1].getStatus() == Status.CONTINUE);
                } else {
                    GuessGame.exitGame();
                }
                response = GuessGame.displayReplayMenu();
                if (response == 3){
                    GuessGame.exitGame();
                }
            } while (response == 1);
        } while (response == 2);


    }

}
