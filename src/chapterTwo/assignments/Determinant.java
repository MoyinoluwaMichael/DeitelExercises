package chapterTwo.assignments;/* (Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. */

import java.util.Scanner;
public class Determinant {
	
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter first integer");
		int firstNumber = input.nextInt();
		int highestNumber = firstNumber;
		int lowestNumber = firstNumber;

		System.out.println("Enter second integer");
		int secondNumber = input.nextInt();
		if (secondNumber>highestNumber) {
	  	highestNumber = secondNumber;
	  }
		if (secondNumber<lowestNumber) {
	  	lowestNumber = secondNumber;
	  }

		System.out.println("Enter third integer");
		int thirdNumber = input.nextInt();
		if (thirdNumber>highestNumber) {
	  	highestNumber = thirdNumber;
	  }
		if (thirdNumber<lowestNumber) {
	  	lowestNumber = thirdNumber;
	  }

		System.out.println("Enter fourth integer");
		int fourthNumber = input.nextInt();
		if (fourthNumber>highestNumber) {
	  	highestNumber = fourthNumber;
	  }
		if (fourthNumber<lowestNumber) {
	  	lowestNumber = fourthNumber;
	  }

		System.out.println("Enter fifth integer");
		int fifthNumber = input.nextInt();
		if (fifthNumber>highestNumber) {
	  	highestNumber = fifthNumber;
	  }
		if (fifthNumber<lowestNumber) {
	  	lowestNumber = fifthNumber;
	  }

		System.out.printf("The largest number = %d while the smallest number = %d", highestNumber, lowestNumber);

	}
}