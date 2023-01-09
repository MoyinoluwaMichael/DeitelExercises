package chapterTwo.assignments;/* Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer
the user’s weight in kilograms and height in meters), then calculates and displays the user’s body mass index. 
Also, display the BMI categories and their values from the National Heart Lung
and Blood Institute 
Formula: weight in kilograms/(height in meters^2) */

import java.util.Scanner;
public class BmiCalculator{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your weight in kilograms");
		int weight = scanner.nextInt();
		
		System.out.println("Enter your height in meters");
		double height = scanner.nextDouble();

		double bmi = (weight * 703)/(height*height);

		System.out.printf("Your BMI = %.6f%n", bmi);
			




	}
}