package chapterTwo.assignments;

import java.util.Scanner;
	
public class FeetToMeters{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		float feet = input.nextFloat();
		
		float meters = feet * 0.305F;

		System.out.printf("%f feet is %f meters",feet,meters);

	}



}