package chapterTwo.assignments;

import java.util.Scanner;

public class Comparison2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		int maximumNumber = firstNumber;
		int minimumNumber = firstNumber;

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		if (secondNumber > firstNumber) {
			maximumNumber = secondNumber;
		}
		else if(secondNumber < firstNumber) {
			minimumNumber = secondNumber;
		}
	
		int sum = firstNumber + secondNumber;
		int difference = 0;
		int product = firstNumber * secondNumber;
		double average = ((double)firstNumber + (double)secondNumber)/2;
		int distance = 0;

		if (firstNumber > secondNumber){
			difference = firstNumber - secondNumber;
		}
		else if (firstNumber < secondNumber){
			difference = secondNumber - firstNumber;
		}

		if (firstNumber > secondNumber){
			distance = firstNumber - secondNumber;
		}
		else if (firstNumber < secondNumber){
			distance = secondNumber - firstNumber;
		}

		System.out.printf("The sum of the numbers = %d%nThe difference of the numbers = %d%nThe product of the numbers = %d%n", sum,difference,product);
		System.out.printf("The average of the numbers = %.3f%nThe distance of the numbers = %d%n",average,distance);
		System.out.printf("The maximum number = %d%nThe minimum number = %d%n",maximumNumber,minimumNumber);



	}



}