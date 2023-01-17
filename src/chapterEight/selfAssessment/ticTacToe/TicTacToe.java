package chapterEight.selfAssessment.ticTacToe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static chapterEight.selfAssessment.ticTacToe.Player.*;

public class TicTacToe {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Player[] players = new Player[2];
    private static final String[][] board = new String[3][3];
    private static boolean gameIsWon;
    private static boolean defaultHasSet;
    private static GameMode mode;


    public static void setGameMode() {
        System.out.println("""
                TIC-TAC-TOE GAME
                Game Mode
                1. Multiplayer
                2. Play With Computer
                Select mode:
                """);
        int gameMode = scanner.nextInt();
        switch (gameMode) {
            case 1 -> mode = GameMode.MULTIPLAYER;
            case 2 -> {
                mode = GameMode.COMPUTER;
                System.out.println("Computer mode activated");
                players[getCurrentPlayer()] = new Player("Computer");
            }
        }
    }

    public static GameMode getGameMode() {
        return mode;
    }

    public static void registerPlayer(String playerName) {
        String firstLetter = String.valueOf(playerName.charAt(0));
        playerName = playerName.replaceFirst(firstLetter, firstLetter.toUpperCase());
        players[getCurrentPlayer()] = new Player(playerName);
    }

    public static void setGameToDefault() {
        setBoardToDefault();
        System.out.println("Who would love to play first? Enter player number (1 or 2)");
        int firstPlayerIndex = scanner.nextInt();
        setFirstPlayer(firstPlayerIndex);
        makeFirstPlayerToBe(firstPlayerIndex - 1);
        defaultHasSet = true;
        addNewLine();
        displayBoard();
    }

    public static boolean defaultIsSet() {
        return defaultHasSet;
    }

    private static void setFirstPlayer(int firstPlayerIndex) {
        if (firstPlayerIndex < 1 || firstPlayerIndex > 2) {
            addNewLine();
            displayBoard();
            throw new IllegalArgumentException("Wrong input. Player number is either 1 or 2");
        }
    }

    private static void setBoardToDefault() {
        for (String[] row : board) {
            Arrays.fill(row, BoardContent.EMPTY.getContent());
        }
    }

    private static void setBoard() {
        int row = players[getCurrentPlayer()].getCurrentRow();
        int column = players[getCurrentPlayer()].getCurrentColumn();
        board[row][column] = players[getCurrentPlayer()].getSymbol();
    }

    private static void displayBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void playGame(int moveNumber) throws InterruptedException {
        validate(moveNumber);
        players[getCurrentPlayer()].setPlayerPosition(moveNumber);
        setBoard();
        if (mode == GameMode.COMPUTER) {
            if (getCurrentPlayer() == 0) {
                delay("Computer is about playing");
            }
            System.out.println();
        }
        addNewLine();
        displayBoard();
        confirmThatPlayerHasWon();
        adjustCurrentPlayerCount();
        checkTie();
    }

    private static void validate(int positionNumber) {
        if (positionNumber < 0 || positionNumber > 9) {
            switch (mode) {
                case COMPUTER -> {
                    if (getCurrentPlayer() == 0) {
                        throw new IllegalArgumentException();
                    } else {
                        addNewLine();
                        displayBoard();
                        throw new IllegalArgumentException("Number must be between 1 and 9");
                    }
                }
                case MULTIPLAYER -> {
                    addNewLine();
                    displayBoard();
                    throw new IllegalArgumentException("Number must be between 1 and 9");
                }
            }
        }
        confirmBoardSpace(positionNumber);
    }

    private static void confirmBoardSpace(int positionNumber) {
        int row = (positionNumber - 1) / 3;
        int column = (positionNumber - 1) % 3;
        validateEmptySpace(row, column);
    }

    private static void validateEmptySpace(int row, int column) {
        if (!board[row][column].equals(" ")) {
            switch (mode) {
                case COMPUTER -> {
                    ComputerMode.validateBoardSpace();
                }
                case MULTIPLAYER -> {
                    Multiplayer.validateBoardSpace();
                }
            }
        }
    }

    private static void confirmThatPlayerHasWon() {
        String position = players[getCurrentPlayer()].getPosition();
        if (players[getCurrentPlayer()].playerHasWonOverTime(position)) {
            gameIsWon = true;
            printWinningMessage();
            System.exit(1);
        }
    }

    private static void printWinningMessage() {
        if (mode == GameMode.COMPUTER) {
            if (getCurrentPlayer() == 0) {
                System.out.println("Computer won. Game over!");
            } else {
                System.out.printf("Congratulations %s, you won!", players[getCurrentPlayer()].getName());
            }
        } else {
            System.out.printf("Congratulations %s, you won!", players[getCurrentPlayer()].getName());
        }
    }

    public static boolean isWon() {
        return gameIsWon;
    }

    static void addNewLine() {
        System.out.println("""
                                
                                
                                
                                
                                
                                
                                
                """);
    }

    private static void checkTie() {
        int columnOccupiedCount = 0;
        for (String[] row : board) {
            for (String column : row) {
                if (!column.equals(" ")) {
                    columnOccupiedCount++;
                }
            }
        }
        if (columnOccupiedCount == 9) {
            gameIsWon = true;
            System.out.println("The game is draw. Game over!");
        }
    }

    public static Player[] getPlayers() {
        return players;
    }

    public static void delay(String message) throws InterruptedException {
        System.out.print(message);
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
