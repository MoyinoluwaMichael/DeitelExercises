package chapterSeven.selfAssessment.knightTour;

public class Knight {
    public static void main(String[] args) {
        ChessBoard knight = new ChessBoard();
        ChessBoard.displayCurrentPosition();
        while (true){
            knight.move();
        }
    }
}
