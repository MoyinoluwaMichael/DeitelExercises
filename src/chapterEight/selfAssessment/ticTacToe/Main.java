package chapterEight.selfAssessment.ticTacToe;

import java.security.SecureRandom;
import java.util.Scanner;

import static chapterEight.selfAssessment.ticTacToe.Player.getCurrentPlayer;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        TicTacToe.setGameMode();
        GameMode mode = TicTacToe.getGameMode();
        switch (mode) {
            case MULTIPLAYER -> {
                for (int i = 0; i < 2; i++) {
                    System.out.printf("Enter player %d name %n", i + 1);
                    String playerName = scanner.next();
                    TicTacToe.registerPlayer(playerName);
                }
                do {
                    try {
                        TicTacToe.setGameToDefault();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } while (!TicTacToe.defaultIsSet());

                do {
                    try {
                        String playerName = TicTacToe.getPlayers()[getCurrentPlayer()].getName();
                        System.out.printf("%s, enter a number to take a position %n", playerName);
                        int moveNumber = scanner.nextInt();
                        TicTacToe.playGame(moveNumber);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } while (!TicTacToe.isWon());
            }
            case COMPUTER -> {
                System.out.println("Enter your name");
                String playerName = scanner.next();
                TicTacToe.registerPlayer(playerName);
                do {
                    try {
                        TicTacToe.setGameToDefault();
                    } catch (IllegalArgumentException ignored) {}
                } while (!TicTacToe.defaultIsSet());

                do {
                    try {
                        playerName = TicTacToe.getPlayers()[getCurrentPlayer()].getName();
                        if (!playerName.equalsIgnoreCase("Computer")){
                            System.out.printf("%s, enter a number to take a position %n", playerName);
                        }
                        switch (getCurrentPlayer()){
                            case 0 -> {
                                int move = 1+random.nextInt(9);
                                TicTacToe.playGame(move);}
                            case 1 -> {

                                TicTacToe.playGame(scanner.nextInt());
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        if (getCurrentPlayer() == 0){
                            System.out.print("");
                        }else {
                            System.out.println(e.getMessage());
                        }
                    }
                } while (!TicTacToe.isWon());
            }
        }
    }
}
