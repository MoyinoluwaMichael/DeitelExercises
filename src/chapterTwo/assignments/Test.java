package chapterTwo.assignments;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int a;
	int b;
	int c;
	
	System.out.println("Enter first integer: ");
	a = input.nextInt();

	System.out.println("Enter second integer: ");
	b = input.nextInt();	

	c = a*b;
	System.out.printf("%s%d%s%d%s%d%n", "The product of ", a, " and ", b, " is ",	 c);

	if (a == b) {
	System.out.printf("%d%s%d%n", a, " is equal to ", b);
		}

	if (a != b) {
	System.out.printf("%d%s%d%n", a, " is not equal to ", b);
		}

	if (a >= b) {
	System.out.printf("%d%s%d%n", a, " is greater than ", b);
		}

	if (a <= b) {
	System.out.printf("%d%s%d%n", a, " is lesser than ", b);
		}


	}

}