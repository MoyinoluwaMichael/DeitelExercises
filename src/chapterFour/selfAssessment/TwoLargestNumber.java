package chapterFour.selfAssessment;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largestNumber = Double.NEGATIVE_INFINITY;
        double secondLargestNumber = Double.NEGATIVE_INFINITY;
        double smallestNumber = Double.POSITIVE_INFINITY;

        for (int count = 0;count < 5;count += 1){
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();

            if (userInput > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = userInput;
            }
            if (userInput < largestNumber && userInput > secondLargestNumber){
                secondLargestNumber = userInput;
            }
            if (userInput < smallestNumber){
                smallestNumber = userInput;
            }
        }
        if (largestNumber == smallestNumber && smallestNumber == secondLargestNumber){
            System.out.println("Guy, all numbers are same.");
        }
        if (secondLargestNumber == smallestNumber){
            System.out.println("The largest number is " + largestNumber);
            System.out.println("Guy, other numbers are same.");
        }
        else {
            System.out.println("The largest number is " + largestNumber);
            System.out.println("The second largest number is " + secondLargestNumber);
            System.out.println("The smallest number is " + smallestNumber);
        }









    }
}
