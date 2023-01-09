package chapterSix.selfAssessment.guessApp;

public class Player {
    private String playerName;
    public static int currentPlayer;
    private Status status;
    private double accountBalance = 1000.0;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setStatus(long guessedNumber) {
        if (guessedNumber == GuessGame.getLuckyNumber()) {
            GuessGame.players[currentPlayer].status = Status.WON;
        } else {
            GuessGame.players[currentPlayer].status = Status.CONTINUE;
        }
    }

    public Status getStatus() {
        return status;
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance && amount > 0) {
            accountBalance -= amount;
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            accountBalance+=amount;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
