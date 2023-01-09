package chapterFive.deitelExercises;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values would you want to input: ");
        int numberOfInputs = input.nextInt();
        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        for (int count = 1; count <= numberOfInputs; count++){
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();
            if (userInput > highestNumber){
                highestNumber = userInput;
            } else if (userInput < lowestNumber) {
                lowestNumber = userInput;
            }
        }
        System.out.println("The minimum number so far is "+lowestNumber+"\nThe maximum number so far is "+highestNumber);

    }
}
