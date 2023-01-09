package chapterFive.assignment.DisplayPatterns;

public class DisplayPatterns3 {
    public static void main(String[] args) {

        int spaces = 10;
        int inverseNumber = 1;
        for (int numbersInColumn = 1; numbersInColumn <= 6; numbersInColumn++){
            for (int spacesInRow = 1; spacesInRow <= spaces; spacesInRow++){
                System.out.print(" ");
            }
            for (int numbersInRow = 1; numbersInRow <= numbersInColumn; numbersInRow++){
                System.out.print(inverseNumber + " ");
                inverseNumber--;
            }
            System.out.println();
            spaces-=2;
            inverseNumber+=numbersInColumn;
            inverseNumber++;
        }
    }
}
