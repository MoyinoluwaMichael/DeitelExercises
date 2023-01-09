package chapterTwo.assignments;/* (Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.] */

import java.util.Scanner;

public class Tripple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int firstNumber = input.nextInt();
		int firstNumberT = firstNumber*3;

		System.out.println("Enter second integer");
		int secondNumber = input.nextInt();
		int secondNumberD = secondNumber*2;
		int division = firstNumberT/secondNumberD;
		int remainder = firstNumberT%secondNumberD;

		System.out.printf("First number trippled = %d%n", firstNumberT);
		System.out.printf("Second number doubled = %d%n", secondNumberD);

		if (firstNumberT % secondNumberD == 0){
			System.out.printf("%d%c%d = %d rem %d%n", firstNumberT,'/',secondNumberD, division, remainder);
			System.out.printf("hence, %d is a multiple of %d", firstNumberT, secondNumberD);
	  	}
		
		if (firstNumberT % secondNumberD != 0){
			System.out.printf("%d%c%d = %d rem %d%n", firstNumberT,'/',secondNumberD, division, remainder);
			System.out.printf("hence, %d is not a multiple of %d", firstNumberT, secondNumberD);
	  	}

	}
}