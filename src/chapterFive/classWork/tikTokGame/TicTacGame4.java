package chapterFive.classWork.tikTokGame;

public class TicTacGame4 {
    public static void main(String[] args) {

        for (int column = 1; column <= 3; column++) {
            for (int xInRow = column; xInRow % 2 == 1; xInRow++) {
                for (int ex = 1; ex <= 3; ex++) {
                    System.out.print(" X ");
                }
            }
            for (int oInRow = column; oInRow % 2 == 0; oInRow++) {
                for (int oh = 1; oh <= 3; oh++) {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }
}
