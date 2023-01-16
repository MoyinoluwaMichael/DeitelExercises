package chapterEight.selfAssessment.ticTacToe;

import java.util.Scanner;

import static chapterEight.selfAssessment.ticTacToe.Player.getCurrentPlayer;
import static chapterEight.selfAssessment.ticTacToe.TicTacToe.addNewLine;
import static chapterSeven.selfAssessment.knightTour2.ChessBoard.displayBoard;

public class Multiplayer {
    private static final Scanner scanner = new Scanner(System.in);

    public static void playMultiplayerGame()throws InterruptedException {
        registerMultiPlayers();
        do {
            resetMultiPlayerGame();
        } while (!TicTacToe.defaultIsSet());

        do {
            startGame();
        } while (!TicTacToe.isWon());
    }
    private static void registerMultiPlayers() {
        for (int i = 0; i < 2; i++) {
            System.out.printf("Enter player %d name %n", i + 1);
            String playerName = scanner.next();
            TicTacToe.registerPlayer(playerName);
        }
    }

    private static void resetMultiPlayerGame() {
        try {
            TicTacToe.setGameToDefault();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void startGame() throws InterruptedException {
        try {
            String playerName = TicTacToe.getPlayers()[getCurrentPlayer()].getName();
            System.out.printf("%s, enter a number to take a position %n", playerName);
            int moveNumber = scanner.nextInt();
            TicTacToe.playGame(moveNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateBoardSpace() {
        addNewLine();
        displayBoard();
        throw new IllegalArgumentException("Specified position already taken. Please try again.");

    }
}
