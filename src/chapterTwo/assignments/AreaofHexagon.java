package chapterTwo.assignments;

import java.util.Scanner;
public class AreaofHexagon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of a side: ");
		double side = input.nextDouble();
		
		double area = (6*(side*side))/(4*0.5776);

		System.out.printf("The area of the hexagon is: %.6f%n",area);
		
		



	}

}