package chapterFive.assignment.DisplayPatterns;

public class DisplayPatterns1 {
    public static void main(String[] args) {

        for (int numberInColumn = 1; numberInColumn <= 6; numberInColumn++){
            for (int numberInRow = 1; numberInRow <= numberInColumn; numberInRow++){
                System.out.print(numberInRow+" ");
            }
            System.out.println();
        }
    }
}
