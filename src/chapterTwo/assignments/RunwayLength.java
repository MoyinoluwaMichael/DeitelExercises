package chapterTwo.assignments;

import java.util.Scanner;

public class RunwayLength{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter speed in m/s: ");
		float speed = input.nextFloat();

		System.out.print("Enter acceleration in m/s: ");
		float acceleration = input.nextFloat();

		float length = (speed*speed)/(2*acceleration);

		System.out.printf("The minimum runway length for this airplane is %.3f%n",length);


	}



}