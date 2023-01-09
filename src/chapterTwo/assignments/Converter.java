package chapterTwo.assignments;

import java.util.Scanner;

public class Converter{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		float userInput = input.nextFloat();
		
		float resultInKilogram = userInput * 0.454F;

		System.out.printf("%.3f pounds = %.3f kilograms %n",userInput,resultInKilogram);
	

	}


}