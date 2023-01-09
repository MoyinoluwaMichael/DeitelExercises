package chapterFour.classWork;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        if (userInput > 10) {
            System.out.printf("%d is out of range", userInput);
        }
        else {if (userInput % 2 == 0) {
            System.out.printf("%d is an even number", userInput);
        }
            else{
                System.out.printf("%d is an odd number", userInput);
            }
        }






    }
}
