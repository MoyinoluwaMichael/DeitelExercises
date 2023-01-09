package chapterSeven.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    private int number(){return 0;}
    private static int[] twoSum(int[] numbers, int number) {
        int[] twoNumbers = new int[2];
        int length = numbers.length;
        for (int count = 0; count < length; count++) {
            for (int count2 = count + 1; count2 < length; count2++) {
                if (numbers[count] + numbers[count2] == number) {
                    twoNumbers[0] = count;
                    twoNumbers[1] = count2;
                    break;
                }
            }
            if (twoNumbers[1] > 0) break;
        }
        return twoNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by comma(,): ");

        String userInputInList = input.nextLine();

        String [] listOfNumbersAsString = userInputInList.split(",");
        int [] listOfNumbersAsInt = new int [listOfNumbersAsString.length];

        for (int i = 0; i < listOfNumbersAsString.length; i++) {
            listOfNumbersAsInt[i]=Integer.parseInt(listOfNumbersAsString[i]);
        }
        System.out.print("Enter target: ");
        int number = input.nextInt();

        System.out.println(Arrays.toString(twoSum(listOfNumbersAsInt, number)));
    }
}
