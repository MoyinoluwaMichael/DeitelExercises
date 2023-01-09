package chapterFive.classWork;

import java.util.Scanner;

public class NthTermAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = input.nextInt();
        double resultInDecimal = 0;
        int denominator = 1;
        int numerator = 0;
        for (int count = 1; count <= number; count++){
            double fraction = 1.0/count;
            resultInDecimal += fraction;
            denominator *= count;
        }
        for (int count = 1; count <= number; count++){
            int resultInFraction = denominator / count;
            numerator += resultInFraction;
        }
        int minimum = Math.min(numerator, denominator);
        for (int count = 2; count <= minimum; count++){
            if (numerator%count == 0 && denominator%count == 0){
                numerator /= count;
                denominator /= count;
                count = 1;
            }
        }


        System.out.printf("Your result in decimal is: %.3f\n", resultInDecimal);
        System.out.printf("Your result in fraction is: %d/%d", numerator, denominator);
    }
}
