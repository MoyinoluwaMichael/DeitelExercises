package chapterFour.assignment;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double largestNumber = Double.NEGATIVE_INFINITY;
        double smallestNumber = Double.POSITIVE_INFINITY;
        boolean iterate = true;
        int userInput = 0;

        while (iterate) {
            System.out.print("Enter a number, enter stop to exit: ");
            String userInputInString = input.nextLine();
            if (userInputInString.equalsIgnoreCase("stop")) {
                iterate = false;
            }
            else {if (!userInputInString.equalsIgnoreCase("stop")){
                userInput = Integer.parseInt(userInputInString);
                if (userInput > largestNumber) {
                    largestNumber = userInput;
                }
                if (userInput < smallestNumber) {
                    smallestNumber = userInput;
                }
                }
            }
        }
        System.out.printf("The largest number is %.0f%nThe smallest number is %.0f", largestNumber, smallestNumber);
    }

}
