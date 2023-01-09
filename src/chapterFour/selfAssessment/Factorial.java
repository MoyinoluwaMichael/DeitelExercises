package chapterFour.selfAssessment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        System.out.print(userInput);
        int factorial = userInput;

        for (int numberBelow = userInput - 1;numberBelow >=1;numberBelow--){
            System.out.print(" * " + numberBelow);
            factorial *= numberBelow;
        }
        
        System.out.println("\nThe factorial of " + userInput + " is " + factorial);
    }
}
