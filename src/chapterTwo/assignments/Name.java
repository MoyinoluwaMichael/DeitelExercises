package chapterTwo.assignments;

import java.util.Scanner;

public class Name{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();

		System.out.printf("Welcome %s! \n", name);
	


	}


}