package chapterTwo.assignments;/* (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits separated from one another by three spaces each. */


import java.util.Scanner;
public class SeparatingIntegers{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	int number;
      int digits1;
      int digits2;
      int digits3;
      int digits4;
      int digits5;
	

      System.out.print("Enter a number");
      number = scanner.nextInt();

      digits1 = number / 10000;
      digits2 = number % 10000 / 1000;
      digits3 = number % 10000 % 1000 / 100;
      digits4 = number % 10000 % 1000 % 100 / 10;
      digits5 = number % 10000 % 1000 % 100 % 10;

      System.out.printf("%d   %d   %d   %d   %d%n",digits1,digits2,digits3,digits4,digits5);

        
}
}