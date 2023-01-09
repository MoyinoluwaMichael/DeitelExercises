package chapterTwo.assignments;

import java.util.Scanner;

public class YearsInMinutes{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int hoursInMinutes = minutes/60;
		int daysInMinutes = hoursInMinutes/24;		
		int yearsInMinutes = daysInMinutes/365;
		int daysRemaining = daysInMinutes%365;

		System.out.printf("%d minutes is approximately %d years and %d days",minutes,yearsInMinutes,daysRemaining);


	}


}