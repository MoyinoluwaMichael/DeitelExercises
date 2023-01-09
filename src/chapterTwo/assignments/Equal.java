package chapterTwo.assignments;

import java.util.Scanner;

public class Equal{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter your second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter your third number: ");
		int thirdNumber = input.nextInt();

		System.out.print("Enter your fourth number: ");
		int fourthNumber = input.nextInt();

		if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber) {
			System.out.println("Numbers are equal");
		}
		else if (firstNumber != secondNumber && firstNumber != thirdNumber && firstNumber != fourthNumber) {
			System.out.println("Numbers are not equal");
		}
		else if (firstNumber != secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber) {
			System.out.println("Numbers are not equal");
		}
		else if (firstNumber != secondNumber && firstNumber != thirdNumber && firstNumber == fourthNumber) {
			System.out.println("Numbers are not equal");
		}

		else if (firstNumber == secondNumber && firstNumber != thirdNumber && firstNumber != fourthNumber) {
			System.out.println("Numbers are not equal");
		}
		else if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber != fourthNumber) {
			System.out.println("Numbers are not equal");
		}
		else if (firstNumber == secondNumber && firstNumber != thirdNumber && firstNumber == fourthNumber) {
			System.out.println("Numbers are not equal");
		}
		else if (firstNumber != secondNumber && firstNumber == thirdNumber && firstNumber != fourthNumber) {
			System.out.println("Numbers are not equal");
		}



	}



}