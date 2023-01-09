package chapterTwo.assignments;

import java.util.Scanner;

public class SameInteger{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number between 25 and 75");
		int firstNumber = input.nextInt();
		int firstDigit1 = firstNumber/10;
		int secondDigit1 = firstNumber%10;

		System.out.println("Input second number between 25 and 75");
		int secondNumber = input.nextInt();
		int firstDigit2 = secondNumber/10;
		int secondDigit2 = secondNumber%10;

		if (firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2 || secondDigit1 == firstDigit2 || secondDigit1 == secondDigit2) {
		System.out.println("Result: True!");
		}
		if (firstDigit1 != firstDigit2 && firstDigit1 != secondDigit2 && secondDigit1 != firstDigit2 && secondDigit1 != secondDigit2) {
		System.out.println("Result: False!");
		}





}	



}