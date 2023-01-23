package chapterEight.classWork.TortoiseAndTheHareRace;

import javax.swing.*;
import java.util.Arrays;

public class RaceTrack {
    private final String[][] lanes;
    private final String TORTOISE = "T";
    private int tortoisePosition;
    private int harePosition;
    private final String HARE = "H";

    private final String blankSpace = " ";
    private final int TORTOISE_LANE = 0;

    private final int HARE_LANE = 1;


    public RaceTrack() {
        int numberOfLanes = 2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];
        for (String[] lane : lanes) {
            Arrays.fill(lane, blankSpace);
        }
        lanes[TORTOISE_LANE][tortoisePosition] = TORTOISE;
        lanes[HARE_LANE][harePosition] = HARE;
        displayTrack();
        display("""
                BANG !!!!!
                AND THEY'RE OFF !!!!!
                """);
    }

    public String[][] getLanes() {
        return lanes;
    }

    public String getTortoise() {
        return TORTOISE;
    }

    public int getTortoiseLane() {
        return TORTOISE_LANE;
    }

    public int getHareLane() {
        return HARE_LANE;
    }

    public String getHare() {
        return HARE;
    }

    public void move(int number) {
        addLines();
        moveTortoise(number);
        moveHare(number);
        checkBite();
        isTie();
        isWon();
        displayTrack();
        displayBiteMessage();
        displayWinningMessage();
    }

    private int setAnimalPosition(int move, int animalPosition) {
        if (animalPosition + move < 0) return 0;
        else if (animalPosition + move > 69) return 69;
        else return animalPosition + move;
    }

    private void moveHare(int number) {
        String[] lane = lanes[HARE_LANE];
        if (number >= 1 && number <= 2) makeSleepMove(lane);
        else if (number >= 3 && number <= 4) makeBigHopMove(lane);
        else if (number == 5) makeBigSlipMove(lane);
        else if (number >= 6 && number <= 8) makeSmallHopMove(lane);
        else makeSmallSlipMove(lane);
    }

    private void makeSmallSlipMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.SMALL_SLIP, harePosition);
        lane[harePosition] = HARE;
    }

    private void makeSmallHopMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.SMALL_HOP, harePosition);
        lane[harePosition] = HARE;
    }

    private void makeSleepMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.SLEEP, harePosition);
        lane[harePosition] = HARE;
    }

    private void makeBigSlipMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.BIG_SLIP, harePosition);
        lane[harePosition] = HARE;
    }

    private void makeBigHopMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.BIG_HOP, harePosition);
        lane[harePosition] = HARE;
    }

    private void moveTortoise(int number) {
        String[] lane = lanes[TORTOISE_LANE];
        if (number >= 1 && number <= 5) makeFastPlodMove(lane);
        else if (number >= 6 && number <= 7) makeSlipMove(lane);
        else if (number >= 8 && number <= 10) makeSlowPlodMove(lane);
    }

    private void makeSlowPlodMove(String[] lane) {
        lane[tortoisePosition] = blankSpace;
        tortoisePosition = setAnimalPosition(RaceMove.SLOW_PLOD, tortoisePosition);
        lane[tortoisePosition] = TORTOISE;
    }

    private void makeFastPlodMove(String[] lane) {
        lane[tortoisePosition] = blankSpace;
        tortoisePosition = setAnimalPosition(RaceMove.FAST_PLOD, tortoisePosition);
        lane[tortoisePosition] = TORTOISE;
    }

    private void makeSlipMove(String[] lane) {
        lane[tortoisePosition] = blankSpace;
        tortoisePosition = setAnimalPosition(RaceMove.SLIP, tortoisePosition);
        lane[tortoisePosition] = TORTOISE;
    }


    public void setTortoisePosition(int tortoisePosition) {
        this.tortoisePosition = tortoisePosition;
    }

    public void setHarePosition(int harePosition) {
        this.harePosition = harePosition;
    }

    public String getBlankSpace() {
        return blankSpace;
    }

    public int getTortoisePosition() {
        return tortoisePosition;
    }

    public void displayTrack() {
        for (var lane : lanes) {
            display(Arrays.toString(lane));
        }
    }

    private void checkBite() {
        if (tortoisePosition < 69 && harePosition < 69) {
            if (tortoisePosition == harePosition) {
                lanes[getHareLane()][harePosition] = "OUCH";
                lanes[getTortoiseLane()][tortoisePosition] =  "  T ";
            }
        }
    }

    public boolean isTie() {
        if (tortoisePosition == 69 && harePosition == 69) {
            return true;
        }
        return false;
    }

    public boolean isWon() {
        if (tortoisePosition == 69 || harePosition == 69) {
            return true;
        }
        return false;
    }

    private void displayBiteMessage() {
        if (isBitten()) {
            display("Yeee! Ijapa bu mi nimu je");
        }
    }

    private void displayWinningMessage() {
        if (tortoisePosition == 69 && harePosition < 69) {
            display("Tortoise Won the race!");
        } else if (harePosition == 69 && tortoisePosition < 69) {
            display("Hare Won the race!");
        } else if (isTie()) {
            display("The game is a tie!");
        }
    }

    private boolean isBitten() {
        if (tortoisePosition < 69 && harePosition < 69) {
            if (tortoisePosition == harePosition) {
                return true;
            }
        }
        return false;
    }

    private void addLines() {
        display("""
                                
                                
                                
                                
                                
                                
                                
                                
                """);
    }
    private void display(String message){
       System.out.println(message);
    }
}
