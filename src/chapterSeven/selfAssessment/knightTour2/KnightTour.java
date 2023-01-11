package chapterSeven.selfAssessment.knightTour2;

import java.util.Scanner;


public class KnightTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChessBoard.displayMenu();
        for (int currentPlayer = 0; currentPlayer < 2; currentPlayer++) {
            System.out.println("Enter Player " + (currentPlayer + 1) + " name");
            ChessBoard.registerPlayer(currentPlayer, scanner.next());
        }
        ChessBoard.setDefaultPlayersPosition();
        ChessBoard.displayBoard();
        do {
            System.out.println(ChessBoard.getCurrentPlayerName() + ", it's your turn to make a move. Enter a move number");
            ChessBoard.play(scanner.nextInt());
        }
        while (!ChessBoard.playerHasWon());
    }
}
