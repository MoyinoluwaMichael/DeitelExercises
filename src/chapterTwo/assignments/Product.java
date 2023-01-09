package chapterTwo.assignments;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        int product = firstNumber * secondNumber * thirdNumber;

        System.out.printf("The product of the numbers is: %d%n",product);
    }

}