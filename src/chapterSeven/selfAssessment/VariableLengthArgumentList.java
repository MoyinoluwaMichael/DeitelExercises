package chapterSeven.selfAssessment;

import java.util.ArrayList;
import java.util.Scanner;

public class VariableLengthArgumentList {
    private static int average(int [] numbers){
        int total = 0;
        for (int each: numbers){
            total+=each;
        }
        return total/ numbers.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by a comma: ");
        String list = scanner.nextLine();
        String [] newList = list.split(",");

        int [] numbers = new int [newList.length];
        for (int count = 0; count < newList.length; count++){
            numbers[count] = Integer.parseInt(newList[count]);
        }
        System.out.println("The average of the numbers is: "+average(numbers));

    }
}
