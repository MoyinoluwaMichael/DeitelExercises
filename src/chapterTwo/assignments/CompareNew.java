package chapterTwo.assignments;/* (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….] */

import java.util.Scanner;
public class CompareNew{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int firstInteger = input.nextInt();
		int highestNumber = firstInteger;
		int lowestNumber = firstInteger;

		System.out.println("Enter second integer: ");
		int secondInteger = input.nextInt();
		if (secondInteger>highestNumber) {
		highestNumber=secondInteger;
	  }	
		if (secondInteger<lowestNumber) {
		lowestNumber=secondInteger;
	  }

		System.out.println("Enter third integer: ");
		int thirdInteger = input.nextInt();
		if (thirdInteger>highestNumber) {
		highestNumber=thirdInteger;
	  }
		if (thirdInteger<lowestNumber) {
		lowestNumber=thirdInteger;
	  }

		System.out.println("Enter fourth integer: ");
		int fourthInteger = input.nextInt();
		if (fourthInteger>highestNumber) {
		highestNumber=fourthInteger;
	  }
		if (fourthInteger<lowestNumber) {
		lowestNumber=fourthInteger;
	  }

		System.out.println("Enter fifth integer: ");
		int fifthInteger = input.nextInt();
		if (fifthInteger>highestNumber) {
		highestNumber=fifthInteger;
	  }
		if (fifthInteger<lowestNumber) {
		lowestNumber=fifthInteger;
	  }

		int sum = firstInteger+secondInteger+thirdInteger+fourthInteger+fifthInteger;
		int average = sum/2;
		int product = firstInteger*secondInteger*thirdInteger*fourthInteger*fifthInteger;

		System.out.printf("The sum of the numbers = %d%n", sum);
		System.out.printf("The product of the numbers = %d%n", product);
		System.out.printf("The average = %d%n", average);
		System.out.printf("The highest Number = %d%n", highestNumber);
		System.out.printf("The lowest Number = %d%n", lowestNumber);		


	}
}
