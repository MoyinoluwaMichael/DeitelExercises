package chapterTwo.assignments;/* (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared). */

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter your first integer");
		int x = input.nextInt();

		System.out.println("Enter your second integer");
		int y = input.nextInt();

		int xSquare = x*x;
		System.out.printf("The square of %d = %d%n", x, xSquare);

		int ySquare = y*y;
		System.out.printf("The square of %d = %d%n", y, ySquare);

		int sumSquare = xSquare+ySquare;
		System.out.printf("The sum of the squares = %d%n", sumSquare);

		int diffSquare = xSquare-ySquare;
		System.out.printf("The difference of the squares = %d%n", diffSquare);



	}
}