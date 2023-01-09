package chapterTwo.assignments;/* (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….] */

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int num1;
	int num2;
	int num3;
	int sum;
	int product;
	int average;	

	System.out.println("Enter first integer: ");
	num1 = input.nextInt();

	System.out.println("Enter second integer: ");
	num2 = input.nextInt();
	
	System.out.println("Enter third integer: ");
	num3 = input.nextInt();
	
	sum = num1+num2+num3;
	System.out.printf("The sum of the numbers = %d%n", sum);
	
	product = num1*num2*num3;
	System.out.printf("The product of the numbers = %d%n", product);

	average = sum/2;
	System.out.printf("The average = %d%n", average);

	

	if (num1>num2 && num1>num3);
	System.out.printf("The greatest number is %d%n", num1);

	if (num2>num1 && num2>num3);
	System.out.printf("The greatest number is %d%n", num2);

	if (num3>num2 && num3>num1);
	System.out.printf("The greatest number is %d%n", num3);

	if (num1<num2 && num1<num3);
	System.out.printf("The smallest number is %d%n", num1);

	if (num2<num1 && num2<num3);
	System.out.printf("The smallest number is %d%n", num2);

	if (num3<num1 && num3<num2);
	System.out.printf("The smallest number is %d%n", num3);



	}


}