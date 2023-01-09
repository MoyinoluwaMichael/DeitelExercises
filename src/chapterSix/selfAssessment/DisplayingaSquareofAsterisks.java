package chapterSix.selfAssessment;

public class DisplayingaSquareofAsterisks {
    private static void squareOfAsterisks(int side){
        for (int column = 1; column <= side; column++){
            for (int row = 1; row <= side; row++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squareOfAsterisks(10);
    }
}
