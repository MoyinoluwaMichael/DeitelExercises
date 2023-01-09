package chapterTwo.assignments;

import java.util.Scanner;

public class Compare {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int number1;
int number2;
int result;

System.out.println("Enter first integer");
number1 = input.nextInt();

System.out.println("Enter second integer");
number2 = input.nextInt();

result = number1*number2;
System.out.println(result);

if (number1 == number2) {
System.out.printf("%d == %d%n", number1, number2);
}

if (number1 != number2) {
System.out.printf("%d != %d%n", number1, number2);
}

if (number1 < number2) {
System.out.printf("%d < %d%n", number1, number2);
}

if (number1 > number2) {
System.out.printf("%d > %d%n", number1, number2);
}

if (number1 <= number2) {
System.out.printf("%d <= %d%n", number1, number2);
}

if (number1 >= number2) {
System.out.printf("%d >= %d%n", number1, number2);
}

}

}
