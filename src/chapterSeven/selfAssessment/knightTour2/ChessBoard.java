package chapterSeven.selfAssessment.knightTour2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {
    private static final String[][] chessboard = new String[9][8];
    private static final Player[] players = new Player[2];
    private static final int[] rowMovements = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final int[] columnMovements = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static List<int[]> possibleMovements = new ArrayList<>();
    private static final String knightSymbol = "K";
    private static int currentPlayerIndex = 0;
    private static int winningMove;


    public static void displayMenu() {
        System.out.println("Welcome to Knight tour game");
    }

    public static void registerPlayer(int currentPlayer, String playerName) {
        players[currentPlayer] = new Player(playerName);
    }

    public static void setDefaultPlayersPosition() {
        int rowPosition = 0;
        int columnPosition = 3;
        for (int i = 0; i < 2; i++) {
            setPlayerPosition(i, rowPosition, columnPosition);
            rowPosition += chessboard.length - 1;
            columnPosition += 1;
        }
    }

    private static void setPlayerPosition(int currentPlayer, int rowPosition, int columnPosition) {
        players[currentPlayer].setCurrentRowPosition(rowPosition);
        players[currentPlayer].setCurrentColumnPosition(columnPosition);
    }

    public static void displayBoard() {
        setBoard();
        displayChessBoard();
    }

    private static void setBoard() {
        clearBoard();
        placeKnights();
        decorate();
    }

    private static void clearBoard() {
        for (String[] rows : chessboard) {
            Arrays.fill(rows, "  ");
        }
    }

    private static void placeKnights() {
        for (int i = 0; i < players.length; i++) {
            chessboard[players[i].getCurrentRowPosition()][players[i].getCurrentColumnPosition()] = knightSymbol + (i + 1);
        }
    }

    private static void decorate() {
        int currentRow = players[currentPlayerIndex].getCurrentRowPosition();
        int currentColumn = players[currentPlayerIndex].getCurrentColumnPosition();
        int possibleMoveCount = 1;
        possibleMovements = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int newCurrentRow = currentRow + rowMovements[i];
            int newCurrentColumn = currentColumn + columnMovements[i];
            if (newCurrentRow < chessboard.length && newCurrentRow >= 0 && newCurrentColumn < chessboard[0].length && newCurrentColumn >= 0) {
                if (!chessboard[newCurrentRow][newCurrentColumn].equalsIgnoreCase("  ")) {
                    winningMove = possibleMoveCount;
                } else {
                    chessboard[newCurrentRow][newCurrentColumn] = " " + possibleMoveCount;
                }
                possibleMovements.add(new int[]{newCurrentRow, newCurrentColumn});
                possibleMoveCount++;
            }
        }
    }

    private static void displayChessBoard() {
        for (String[] rows : chessboard) {
            System.out.println(Arrays.toString(rows));
        }
    }

    public static void play(int playerMove) {
        validate(playerMove);
        setPlayerPosition(currentPlayerIndex, possibleMovements.get(playerMove - 1)[0], possibleMovements.get(playerMove - 1)[1]);
        if (playerMove == winningMove) {
            players[currentPlayerIndex].setStatus(Status.WON);
            players[currentPlayerIndex + 1].setStatus(Status.LOSE);
            displayWinningBoard();
        } else {
            currentPlayerIndex++;
            currentPlayerIndex = currentPlayerIndex > 1 ? 0 : 1;
            displayBoard();
        }
    }

    private static void validate(int playerMove) {
        if (playerMove >= possibleMovements.size()){
            throw new IllegalArgumentException("Wrong input. Move number must be within the range of the " +
                    "specified possible movement numbers displayed in the board.");
        }
    }

    private static void displayWinningBoard() {
        String[] winningMessage = {"Congrats", players[currentPlayerIndex].getName(), "YOU WON!"};
        clearBoard();
        if ((players[currentPlayerIndex].getCurrentRowPosition() >= 0 && players[currentPlayerIndex].getCurrentRowPosition() <= 2) ||
                (players[currentPlayerIndex].getCurrentRowPosition() > 5 && players[currentPlayerIndex].getCurrentRowPosition() < 9)) {
            prepareWinningMessageInTheMiddleOfTheBoard(winningMessage);
        } else {
            prepareWinningMessageAtTheTopOfTheBoard(winningMessage);
        }
        displayChessBoard();
    }

    private static void prepareWinningMessageAtTheTopOfTheBoard(String[] winningMessage) {
        int messageCount = 0;
        for (int i = 0; i < 3; i++) {
            int writeCount = 0;
            for (int j = 0; j < winningMessage[messageCount].length(); j++) {
                chessboard[i][writeCount] = " " + winningMessage[messageCount].charAt(j);
                writeCount++;
            }
            messageCount++;
        }
    }

    private static void prepareWinningMessageInTheMiddleOfTheBoard(String[] winningMessage) {
        int messageCount = 0;
        for (int i = 3; i < 6; i++) {
            int writeCount = 0;
            for (int j = 0; j < winningMessage[messageCount].length(); j++) {
                chessboard[i][writeCount] = String.valueOf(winningMessage[messageCount].charAt(j));
                writeCount++;
            }
            messageCount++;
        }
    }

    public static String getCurrentPlayerName() {
        return players[currentPlayerIndex].getName();
    }

    public static boolean playerHasWon() {
        return players[currentPlayerIndex].getStatus() == Status.WON;
    }
}
