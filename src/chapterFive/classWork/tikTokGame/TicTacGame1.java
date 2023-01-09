package chapterFive.classWork.tikTokGame;

public class TicTacGame1 {
    public static void main(String[] args) {

        int oh = 0;
        int secondOh = 2;
        for (int column = 1; column <= 3; column++) {
            for (int oInRow = 1; oInRow <= oh; oInRow++) {
                System.out.print(" O ");
            }
            for (int xInRow = 1; xInRow <= 1; xInRow++) {
                System.out.print(" X ");
            }
            for (int oInRow = 1; oInRow <= secondOh; oInRow++) {
                System.out.print(" O ");
            }
            oh++;
            secondOh--;
            System.out.println();
        }
    }
}
