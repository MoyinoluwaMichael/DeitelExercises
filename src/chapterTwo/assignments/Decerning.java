package chapterTwo.assignments;/* (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input. */

import java.util.Scanner;
public class Decerning{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter your first number: ");
		long firstNumber = scanner.nextInt();
		int negativeNumber = 0;
		int positiveNumber = 0;
		int zerosInput = 0;

		if (firstNumber <= -1) {
		negativeNumber = negativeNumber + 1;
		}
		if (firstNumber >= 1) {
		positiveNumber = positiveNumber + 1;
		}
		if (firstNumber == 0) {
		zerosInput = zerosInput + 1;
		}

		System.out.printf("Enter your second number: ");
		long secondNumber = scanner.nextInt();
		if (secondNumber <= -1) {
		negativeNumber = negativeNumber + 1;
		}
		if (secondNumber >= 1) {
		positiveNumber = positiveNumber + 1;
		}
		if (secondNumber == 0) {
		zerosInput = zerosInput + 1;
		}

		System.out.printf("Enter your third number: ");
		long thirdNumber = scanner.nextInt();
		if (thirdNumber <= -1) {
		negativeNumber = negativeNumber + 1;
		}
		if (thirdNumber >= 1) {
		positiveNumber = positiveNumber + 1;
		}
		if (thirdNumber == 0) {
		zerosInput = zerosInput + 1;
		}

		System.out.printf("Enter your fourth number: ");
		long fourthNumber = scanner.nextInt();
		if (fourthNumber <= -1) {
		negativeNumber = negativeNumber + 1;
		}
		if (fourthNumber >= 1) {
		positiveNumber = positiveNumber + 1;
		}
		if (fourthNumber == 0) {
		zerosInput = zerosInput + 1;
		}

		System.out.printf("Enter your fifth number: ");
		long fifthNumber = scanner.nextInt();
		if (fifthNumber <= -1) {
		negativeNumber = negativeNumber + 1;
		}
		if (fifthNumber >= 1) {
		positiveNumber = positiveNumber + 1;
		}
		if (fifthNumber == 0) {
		zerosInput = zerosInput + 1;
		}

		
		System.out.println("Basis the numbers inputed, there are:");
		System.out.printf("%d%s%n", negativeNumber, " negative number(s)");
 		System.out.printf("%d%s%n", positiveNumber, " positive number(s)");
 		System.out.printf("%d%s%n", zerosInput, " zero input(s)");

		

	}
}