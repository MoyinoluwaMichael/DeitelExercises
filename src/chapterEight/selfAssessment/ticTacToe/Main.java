package chapterEight.selfAssessment.ticTacToe;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        TicTacToe.setGameMode();
        GameMode mode = TicTacToe.getGameMode();
        switch (mode) {
            case MULTIPLAYER -> Multiplayer.playMultiplayerGame();
            case COMPUTER -> ComputerMode.playWithComputer();
        }
    }
}
