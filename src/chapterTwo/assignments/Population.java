package chapterTwo.assignments;/* (World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these values, 
then displays the estimated world population after one, two, three, four, and five years.  */


import java.util.Scanner;
public class Population{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter year between 2022 and 2030: ");
		int userInput = input.nextInt();

		long year2022 = 8000000000L;

		double growthRateValue = 0.01;
	
		double growthRate23 = growthRateValue * (double)year2022;
		long year2023 = (long)growthRate23 + (long)year2022;
		
		double growthRate24 = growthRateValue * (double)year2023;
		long year2024 = (long)growthRate24 + year2023;

		double growthRate25 = growthRateValue * (double)year2024;
		long year2025 = (long)growthRate25 + year2024;

		double growthRate26 = growthRateValue * (double)year2025;
		long year2026 = (long)growthRate26 + year2025;

		double growthRate27 = growthRateValue * (double)year2026;
		long year2027= (long)growthRate27 + year2026;

		double growthRate28 = growthRateValue * (double)year2027;
		long year2028= (long)growthRate28 + year2027;

		double growthRate29 = growthRateValue * (double)year2028;
		long year2029= (long)growthRate29 + year2028;

		double growthRate30 = growthRateValue * (double)year2029;
		long year2030= (long)growthRate30 + year2029;


		if (userInput == 2022) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2022);
		}
		if (userInput == 2023) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2023);
		}		
		if (userInput == 2024) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2024);
		}
		if (userInput == 2025) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2025);
		}
		if (userInput == 2026) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2026);
		}
		if (userInput == 2027) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2027);
		}
		if (userInput == 2028) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2028);
		}
		if (userInput == 2029) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2029);
		}
		if (userInput == 2030) {
			System.out.printf("Estimated World Population as at %d = %d%n", userInput,year2030);
		}



	}



}