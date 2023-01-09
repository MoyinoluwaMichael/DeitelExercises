package chapterFour.assignment;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int userInput = input.nextInt();
        int factor = 0;

        for (int number = 1; number <= userInput; number++){
            if (userInput % number == 0){
                factor += 1;
            }
        }
        System.out.printf("%d has %d factors", userInput, factor);





    }
}
