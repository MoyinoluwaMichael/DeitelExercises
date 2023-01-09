package chapterFive.assignment.DisplayPatterns;

public class DisplayPatterns2 {
    public static void main(String[] args) {

        for (int numbersInColumn = 6; numbersInColumn >= 1; numbersInColumn--){
            for (int numbersInRow = 1; numbersInRow <= numbersInColumn; numbersInRow++){
                System.out.print(numbersInRow + " ");
            }
            System.out.println();
        }
    }
}
