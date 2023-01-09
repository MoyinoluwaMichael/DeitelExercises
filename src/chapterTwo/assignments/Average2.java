package chapterTwo.assignments;

import java.util.Scanner;

public class Average2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();

		double average = (firstNumber+secondNumber+thirdNumber)/3.0;

		System.out.printf("The average of the numbers is %.3f%n",average);






	}


}