package chapterFour.assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for (int count = 1;count <= 12;count++){
            int result = userInput * count;
            System.out.printf("%d times %d is %d%n", userInput, count, result);
        }








    }



}
