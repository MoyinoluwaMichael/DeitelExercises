package chapterTwo.assignments;

import java.util.Scanner;

public class Age{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome, what's your name?");
		String name = input.nextLine();

		System.out.println("How old are you?");
		int dob = input.nextInt();
		
		dob = 2022 - dob;

		System.out.printf("Dear %s, you were born in the year %d. \n", name,dob);




	}

}