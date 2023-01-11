package chapterSeven.selfAssessment.knightTour;

public class KnightTour {
    public static void main(String[] args) {
        ChessBoard knight = new ChessBoard();
        ChessBoard.displayCurrentPosition();
        while (true){
            knight.move();
        }
    }
}
