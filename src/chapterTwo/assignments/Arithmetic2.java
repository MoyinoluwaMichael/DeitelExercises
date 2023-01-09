package chapterTwo.assignments;

import java.util.Scanner;

public class Arithmetic2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		int difference = firstNumber - secondNumber;
		int product = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;

		System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n",firstNumber,secondNumber,sum,firstNumber,secondNumber,difference,firstNumber,secondNumber,product);
		System.out.printf("%d / %d = %d%n%d mod %d = %d%n",firstNumber,secondNumber,division,firstNumber,secondNumber,remainder);







	}

}