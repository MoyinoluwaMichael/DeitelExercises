package chapterTwo.assignments;

import java.util.Scanner;

public class PositiveNegative{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer");
		int firstInteger = input.nextInt();

		int positive = 0;
		int negative = 0;
		int zero = 0;

		if (firstInteger > 0){
			positive = positive + 1;
		}
		if (firstInteger < 0){
			negative = negative + 1;
		}
		if (firstInteger == 0){
			zero = zero + 1;
		}

		System.out.println("Enter your second integer");
		int secondInteger = input.nextInt();
		if (secondInteger > 0){
			positive = positive + 1;
		}
		if (secondInteger < 0){
			negative = negative + 1;
		}
		if (secondInteger == 0){
			zero = zero + 1;
		}

		System.out.println("Enter your third integer");
		int thirdInteger = input.nextInt();
		if (thirdInteger > 0){
			positive = positive + 1;
		}
		if (thirdInteger < 0){
			negative = negative + 1;
		}
		if (thirdInteger == 0){
			zero = zero + 1;
		}

		System.out.println("Enter your fourth integer");
		int fourthInteger = input.nextInt();
		if (fourthInteger > 0){
			positive = positive + 1;
		}
		if (fourthInteger < 0){
			negative = negative + 1;
		}
		if (fourthInteger == 0){
			zero = zero + 1;
		}

		System.out.println("Enter your fifth integer");
		int fifthInteger = input.nextInt	();
		if (fifthInteger > 0){
			positive = positive + 1;
		}
		if (fifthInteger < 0){
			negative = negative + 1;
		}
		if (fifthInteger == 0){
			zero = zero + 1;
		}
		
			System.out.println("Analyzing your inputs, there are:");
			System.out.printf("%d positive number(s) %n%d negative number(s) %n%d zero input(s)", positive,negative,zero);




	}



}