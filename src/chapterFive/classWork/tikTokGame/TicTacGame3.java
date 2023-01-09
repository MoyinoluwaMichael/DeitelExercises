package chapterFive.classWork.tikTokGame;

public class TicTacGame3 {
    public static void main(String[] args) {

        int firstOh = 1;
        int secondOh = 1;
        for (int column = 1; column <= 3; column++) {
            for (int oInRow = 1; oInRow <= firstOh; oInRow++) {
                System.out.print(" 0 ");
            }
            for (int xInRow = 1; xInRow <= 1; xInRow++) {
                System.out.print("|X|");
            }
            for (int oInRow = 1; oInRow <= firstOh; oInRow++) {
                System.out.print(" O ");
            }
            System.out.println();
        }
    }
}
