package chapterSix.selfAssessment;

import java.util.Scanner;

public class DisplayingaSquareofAnyCharacter {
    private static void squareOfAnyCharacter(int side, char character){
        for (int column = 1; column <= side; column++){
            for (int row = 1; row <= side; row++){
                System.out.print(" "+character+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character/symbol: ");
        char character = input.next().charAt(0);

        squareOfAnyCharacter(5, character);

    }
}
