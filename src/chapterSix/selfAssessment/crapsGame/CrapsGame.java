package chapterSix.selfAssessment.crapsGame;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class CrapsGame {
    SecureRandom secureRandom = new SecureRandom();


    private int point;
    private Status status;
    private int numberOfTimesThrown;
    private double bankBalance = 1000;
    private double wager;


    public double getWager() {
        return wager;
    }

    public void layAWage(double amount) {
        if (amount > 0 && amount <= bankBalance) {
            wager = amount;
            bankBalance -= wager;
            System.out.println("You've waged " + amount);
        } else {
            System.out.println("You have entered an invalid amount, please reenter wager.");
        }
    }

    public double getBankBalance() {
        System.out.print("Your balance is now ");
        return bankBalance;
    }

    public int getPoint() {
        return point;
    }

    public static String displayMenu() {
        return """
                1. Roll dice
                2. Exit
                                
                Select:""";
    }

    public static String displayErrorMessage() {
        return "Wrong input!\nPlease try again.\n";
    }

    public int rollDice() {
        numberOfTimesThrown++;
        int firstDie = 1 + secureRandom.nextInt(6);
        int secondDie = 1 + secureRandom.nextInt(6);
        int diceSum = firstDie + secondDie;
        System.out.print(firstDie + " + " + secondDie);
        setStatus(diceSum);
        return diceSum;
    }

    private void setStatus(int sum) {
        if (numberOfTimesThrown == 1) {
            switch (sum) {
                case 7, 11 -> {
                    status = Status.WON;
                    bankBalance += wager * 2;
                }
                case 2, 3, 12 -> {
                    status = Status.LOSE;
                }
                default -> {
                    status = Status.CONTINUE;
                    point = sum;
                }
            }
        } else {
            if (sum == point) {
                status = Status.WON;
                bankBalance += wager * 2;
            } else if (sum == 7) {
                status = Status.LOSE;
            } else {
                status = Status.CONTINUE;
            }
        }
    }

    public String displayStatusMessage() {
        if (numberOfTimesThrown == 1) {
            switch (status) {
                case CONTINUE -> {
                    return "You have " + point + " points\nRoll dice of same point to win.";
                }
                case WON -> {
                    return "Holla! You won!!!";
                }
                case LOSE -> {
                    if (bankBalance == 0) {
                        return "Sorry, you busted!";
                    }
                    return "Ouch! You lost!!!";
                }
            }
        } else {
            switch (status) {
                case CONTINUE -> {
                    System.out.println(displayChatter());
                    return "Roll again.";
                }
                case WON -> {
                    return "Holla! You won!!!";
                }
                case LOSE -> {
                    if (bankBalance == 0) {
                        return "Sorry, you busted!";
                    }
                    return "Ouch! You lost!!!";
                }
            }
        }
        return "You now have same points\nYou won!!!";
    }

    public static void exitGame() throws InterruptedException {
        System.out.print("Shutting down!");
        for (int count = 1; count <= 3; count++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.exit(0);
    }

    public static void gameOver() throws InterruptedException {
        System.out.print("Game over!");
        for (int count = 1; count <= 3; count++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.exit(0);
    }


    public Status getStatus() {
        return status;
    }
    public String displayChatter(){
        int random;
        String [] chatters = {
                "Oh, you're going for broke, huh?",
                "Aw c'mon, take a chance!",
                "You're up big. Now's the time to cash in your chips!"
        };
        return chatters[random = secureRandom.nextInt(3)];
    }
}
