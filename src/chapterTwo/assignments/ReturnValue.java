package chapterTwo.assignments;

import java.util.Scanner;

public class ReturnValue{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int firstNumber = input.nextInt();
		int largerNumber = firstNumber;
		int smallerNumber = firstNumber;

		System.out.print("Input the second number: ");
		int secondNumber = input.nextInt();
		if (secondNumber > firstNumber){
			largerNumber = secondNumber;
		}
		else if (secondNumber < firstNumber){
			smallerNumber = secondNumber;
		}

		if (firstNumber == secondNumber){
			largerNumber = 0;
			smallerNumber = 0;
			System.out.print("0");
		}

		int remainder1 = firstNumber%6;
		int remainder2 = secondNumber%6;

		if (remainder1 != remainder2 && firstNumber != secondNumber){
			System.out.printf("%d",largerNumber);
		}
		
		if (remainder1 == remainder2 && firstNumber != secondNumber){
			System.out.printf("%d",smallerNumber);
		}


	}



}