package chapterFour.assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int numberOfFactors = 0;

        for (int factor = 1;factor <= userInput;factor++){
            if (userInput % factor == 0){
                numberOfFactors += 1;
            }
        }
        if (numberOfFactors == 2){
            System.out.printf("%d is a prime number.", userInput);
        }
        else {
            System.out.printf("%d is not a prime number.", userInput);
        }
    }
}
