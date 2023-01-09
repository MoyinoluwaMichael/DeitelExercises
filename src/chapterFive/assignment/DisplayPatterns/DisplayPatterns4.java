package chapterFive.assignment.DisplayPatterns;

public class DisplayPatterns4 {
    public static void main(String[] args) {

        int spaces = 0;

        for (int numbersInColumn = 6; numbersInColumn >= 1; numbersInColumn--){
            for (int spacesInRow = 1; spacesInRow <= spaces;spacesInRow++){
                System.out.print(" ");
            }
            for (int numbersInRow = 1; numbersInRow <= numbersInColumn; numbersInRow++){
                System.out.print(numbersInRow + " ");
            }
            System.out.println();
            spaces+=2;
        }
    }
}
