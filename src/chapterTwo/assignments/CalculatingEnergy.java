package chapterTwo.assignments;

import java.util.Scanner;

public class CalculatingEnergy{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		float water = input.nextFloat();

		System.out.print("Enter the initial temperature: ");
		float initialTemperature = input.nextFloat();

		System.out.print("Enter the final temperature: ");
		float finalTemperature = input.nextFloat();

		float energy = water*(finalTemperature - initialTemperature) * 4184F;

		System.out.printf("The energy needed is %.3f",energy);





	}


}