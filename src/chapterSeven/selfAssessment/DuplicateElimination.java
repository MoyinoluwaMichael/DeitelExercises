package chapterSeven.selfAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.print("Enter a list of 10 numbers separated by coma: ");
        String list = scanner.nextLine();
        String [] newList = list.split(",");
        for (String each : newList) {
            numbers.add(Integer.parseInt(each));
        }
        for (int row = 0; row < numbers.size(); row++){
            for (int column = row+1; column < numbers.size(); column++){
                if (numbers.get(row) == numbers.get(column)){
                    numbers.remove(column);
                }
            }
        }
        for (int each:numbers) {
            System.out.print(numbers);
            System.out.print(", ");
        }
    }
}
