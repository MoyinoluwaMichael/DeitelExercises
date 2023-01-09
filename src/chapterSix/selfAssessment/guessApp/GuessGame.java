package chapterSix.selfAssessment.guessApp;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessGame {
    private static Scanner scanner = new Scanner(System.in);
    private static SecureRandom secureRandom = new SecureRandom();
    private static double wager;

    public static Player[] players;
    private static int newPlayerCount;
    private static int luckyNumber;


    public static int getLuckyNumber() {
        return luckyNumber;
    }

    private static void displayMessage(long guessedNumber) throws InterruptedException {
        players[Player.currentPlayer].setStatus(guessedNumber);
        switch (players[Player.currentPlayer].getStatus()) {
            case CONTINUE -> {
                if (guessedNumber > luckyNumber) {
                    System.out.print("Too high. Try again.");
                } else {
                    System.out.print("Too low. Try again");
                }
            }
            case WON -> {
                creditWinnerBankAccount(players[Player.currentPlayer], wager);
                processWinning();
            }
        }
    }

    private static void processWinning() throws InterruptedException {
        System.out.print("Dear " + players[Player.currentPlayer].getPlayerName() + "," +
                " Congratulations. You won!\nThe lucky number is " + getLuckyNumber());
        for (int count = 1; count <= 3; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        addSpace();
        getPlayersAccountBalance();
        System.out.print("Loading");
        for (int count = 1; count <= 6; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        addSpace();
    }

    public static void registerPlayer() throws InterruptedException {
        System.out.println("How many players want to play?");
        int numberOfPlayer = scanner.nextInt();
        players = new Player[numberOfPlayer];
        do {
            System.out.println("Enter Player " + (newPlayerCount + 1) + " Name: ");
            String playerName = scanner.next();
            players[newPlayerCount] = new Player(playerName);
            newPlayerCount++;
        }
        while (newPlayerCount < players.length);
        addSpace();
    }

    public static void playGame() throws InterruptedException {
        if (Player.currentPlayer == players.length) {Player.currentPlayer = 0;}
        addSpace();
        System.out.println(players[Player.currentPlayer].getPlayerName() + ", it's your turn. Guess a number between 1 and 1000");
        long guess = scanner.nextLong();
        while (guess > 1000 || guess < 1) {
            displayErrorMessage();
            addSpace();
            System.out.println(players[Player.currentPlayer].getPlayerName() + ", it's your turn. Guess a number between 1 and 1000");
            guess = scanner.nextLong();
        }
        displayMessage(guess);
        Player.currentPlayer++;
    }
    public static void generateLuckyNumber() {
        luckyNumber = 1 + secureRandom.nextInt(1000);
    }

    public static void displayMenu() {
        addSpace();
        System.out.print("""
                1. Play game
                2. Exit
                """);
    }

    public static void exitGame() throws InterruptedException {
        TimeUnit seconds = TimeUnit.SECONDS;
        System.out.print("Exiting Game!");
        for (int count = 1; count <= 3; count++) {
            seconds.sleep(1);
            System.out.print(".");
        }
        System.exit(0);
    }

    private static void addSpace() {
        System.out.println("""
                                
                                
                                
                                
                                
                                
                                
                                
                                
                """);
    }

    public static int displayReplayMenu() throws InterruptedException {
        System.out.println("""
                Would you love to play again?
                1. Yes
                2. No
                3. Exit game""");
        int response = scanner.nextInt();
        while (response < 1 || response > 3) {
            displayErrorMessage();
            System.out.println("""
                    Would you love to play again?
                    1. Yes
                    2. No
                    3. Exit game""");
            response = scanner.nextInt();
        }
        return response;
    }

    public static void resetNewPlayerCount() {
        newPlayerCount = 0;
    }

    private static void displayErrorMessage() throws InterruptedException {
        System.out.print("Wrong input. Try again.");
        for (int count = 1; count <= 2; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void setWager() throws InterruptedException {
        int ineligiblePlayerCount = 0;
        System.out.println("How much would you love to wager?");
        wager = scanner.nextInt();
        while (wager < 1){
            System.out.println("Wager is too low. Enter a wager from $1");
            System.out.println("How much would you love to wager?");
            wager = scanner.nextInt();
        }
        for (Player player : players) {
            if (wager > player.getAccountBalance()) {
                ineligiblePlayerCount++;
            }
        }
        if (ineligiblePlayerCount > 0) {
            for (Player player : players) {
                if (wager > player.getAccountBalance()) {
                    System.out.printf("%s has insufficient balance. Hence, you can't continue with this game. Your current balance is: $%.2f%n",
                            player.getPlayerName(), player.getAccountBalance());
                }
            }
            rewager(ineligiblePlayerCount);
        }
        for (Player player : players) {
            player.withdraw(wager);
        }
    }

    private static void getPlayersAccountBalance() {
        for (Player player : players) {
            System.out.printf("%s, your account balance is now: $%.2f%n", player.getPlayerName(), player.getAccountBalance());
        }
    }
    private static void rewager(int ineligiblePlayerCount) throws InterruptedException{
        System.out.printf("Seeing you have %d ineligible player, would you love to reconsider the amount you are wagering?%n1. Yes%n2. No%n",
                ineligiblePlayerCount);
        int rewagerMenu = scanner.nextInt();
        while (rewagerMenu < 1 || rewagerMenu > 2){
            displayErrorMessage();
            rewager(ineligiblePlayerCount);
        }
        switch (rewagerMenu){
            case 1 -> {setWager();}
            case 2 -> {exitGame();}
        }
    }
    private static void creditWinnerBankAccount(Player player, double wager){
        double amount = wager*players.length;
        player.deposit(amount);
    }
}
