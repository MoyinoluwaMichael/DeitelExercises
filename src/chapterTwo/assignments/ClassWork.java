package chapterTwo.assignments;

import java.util.Scanner;
public class ClassWork{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number between 0 and 1: ");
		int userInput = input.nextInt();

		if (userInput == 0){
			System.out.println("1");
		}
		else if (userInput == 1){
			System.out.println("0");
		}


	}



}