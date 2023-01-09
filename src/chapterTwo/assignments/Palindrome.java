package chapterTwo.assignments;

import java.util.Scanner;
public class Palindrome{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three digit number");
		int userInput = input.nextInt();

		int digit1 = userInput/100;
		int digit2 = userInput%100/10;
		int digit3 = userInput%100%10;

		if ((digit1 == digit2 && digit1 == digit3) || (digit1 == digit3)){
			System.out.println("This number is a palindrome");
		}

		else{
			System.out.println("This number is not a palindrome");
		}




	}


}