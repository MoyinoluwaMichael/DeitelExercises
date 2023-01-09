package chapterTwo.assignments;

import java.util.Scanner;

public class Acceleration{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial velocity in m/s: \n");
		double initialVelocity = input.nextDouble();

		System.out.print("Enter the final velocity in m/s: \n");
		double finalVelocity = input.nextDouble();
		
		System.out.print("Enter the time in sec.: \n");
		double time = input.nextDouble();

		double averageAcceleration = (finalVelocity - initialVelocity) / time;

		System.out.printf("The average acceleration = %.3fm/s %n",averageAcceleration);
	
	
	}


}