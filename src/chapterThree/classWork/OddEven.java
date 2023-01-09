package chapterThree.classWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int evenOrOdd = userInput%2;

        if (evenOrOdd == 0){
            System.out.printf("%d is an even number!",userInput);
        }
        else {
            System.out.printf("%d is an odd number!",userInput);;
        }
    }
}
