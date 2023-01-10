package chapterSeven.selfAssessment.knightTour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String [][] chessboard = new String[8][8];
    private static ArrayList<int[]> positions = new ArrayList<>();
    private static int currentRow = 4;
    private static final int [] possibleRowMoves = {-1,-2,-2,-1,1,2,2,1};
    private static int currentColumn = 3;
    private static final int [] possibleColumnMoves = {-2,-1,1,2,2,1,-1,-2};
    private static final String knight = "K";

    public static void displayCurrentPosition(){
        setBoard();
        for (String [] row: chessboard) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void setBoard(){
        positions.add(new int [] {4,3});
        for (String[]row: chessboard) {
            Arrays.fill(row, " ");
        }
        chessboard[currentRow][currentColumn] = knight;
        int count = 1;
        int possibleRowMove;
        int possibleColumnMove;
        for (int i = 0; i < 8; i++) {
            possibleRowMove = currentRow +(possibleRowMoves[i]);
            possibleColumnMove = currentColumn + (possibleColumnMoves[i]);
            if (possibleRowMove >= 0 && possibleRowMove <8&&possibleColumnMove >= 0 && possibleColumnMove <8){
                chessboard[possibleRowMove][possibleColumnMove] = String.valueOf(count);
                positions.add(new int[]{possibleRowMove, possibleColumnMove});
                count++;
            }
        }
    }
    public void move(){
        System.out.println("Enter movement number");
        int position = scanner.nextInt();
        while (position < 0 || position > positions.size()){
            System.out.println("Enter movement number");
            position = scanner.nextInt();
        }
        currentRow = positions.get(position)[0];
        currentColumn = positions.get(position)[1];
        positions = new ArrayList<>();
        displayCurrentPosition();
    }
}
