package chapterTwo.assignments;

import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number between 0 and 1000: ");
		int integer = input.nextInt();
		int firstDigit = integer/1000;
		int secondDigit = integer%1000/100;
		int thirdDigit = integer%1000%100/10;
		int fourthDigit= integer%1000%100%10;
		int sum = firstDigit+secondDigit+thirdDigit+fourthDigit;

		System.out.printf("The sum of the digits is %d%n",sum);

	}


}