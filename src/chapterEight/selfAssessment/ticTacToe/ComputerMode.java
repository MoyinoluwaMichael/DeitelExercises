package chapterEight.selfAssessment.ticTacToe;

import java.security.SecureRandom;
import java.util.Scanner;

import static chapterEight.selfAssessment.ticTacToe.Player.getCurrentPlayer;
import static chapterEight.selfAssessment.ticTacToe.TicTacToe.addNewLine;
import static chapterSeven.selfAssessment.knightTour2.ChessBoard.displayBoard;

public class ComputerMode {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();


    public static void playWithComputer() throws InterruptedException{
        registerPlayerAgainstComputer();
        do {
            resetGame();
        } while (!TicTacToe.defaultIsSet());

        do {
            startGame();
        } while (!TicTacToe.isWon());
    }

    private static void registerPlayerAgainstComputer() {
        System.out.println("Enter your name");
        String playerName = scanner.next();
        TicTacToe.registerPlayer(playerName);
    }

    private static void resetGame() {
        try {
            TicTacToe.setGameToDefault();
        } catch (IllegalArgumentException ignored) {}
    }


    private static void startGame() throws InterruptedException {
        try {
            playAgainstComputer();
        } catch (IllegalArgumentException e) {
            if (getCurrentPlayer() == 0){
                System.out.print("");
            }else {
                System.out.println(e.getMessage());
            }
        }
    }
    private static void playAgainstComputer() throws InterruptedException {
        String playerName;
        playerName = TicTacToe.getPlayers()[getCurrentPlayer()].getName();
        if (!playerName.equalsIgnoreCase("Computer")){
            System.out.printf("%s, enter a number between 1 and 9 to take a position %n", playerName);
        }
        switch (getCurrentPlayer()){
            case 0 -> TicTacToe.playGame(1+random.nextInt(9));
            case 1 -> TicTacToe.playGame(scanner.nextInt());
        }
    }

    public static void validateBoardSpace() {
        if (getCurrentPlayer() == 0) {
            throw new IllegalArgumentException();
        } else {
            addNewLine();
            displayBoard();
            throw new IllegalArgumentException("Specified position already taken. Please try again.");
        }
    }
}
