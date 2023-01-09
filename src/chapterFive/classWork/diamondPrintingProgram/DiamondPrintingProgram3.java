package chapterFive.classWork.diamondPrintingProgram;

import java.util.Scanner;

public class DiamondPrintingProgram3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 19: ");
        int userInput = input.nextInt();

        int space = (userInput-1)/2;

        for (int column = 1; column <= userInput; column+=2){
            for (int row = 1; row <= space; row++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
        space = 1;
        for (int column = userInput-2; column >= 1; column -= 2){
            for (int row = 1; row <= space; row++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}
