package chapterFive.classWork.tikTokGame;

public class TicTacGame2 {
    public static void main(String[] args) {

        int firstEx = 2;
        int secondEx = 0;
        for (int column = 1; column <= 3; column++){
            for (int xInRow = 1; xInRow <= firstEx; xInRow++){
                System.out.print(" X ");
            }
            for (int oInRow = 1; oInRow <= 1; oInRow++){
                System.out.print(" O ");
            }
            for (int xInRow = 1; xInRow <= secondEx; xInRow++){
                System.out.print(" X ");
            }
            firstEx--;
            secondEx++;
            System.out.println();
        }
    }
}
