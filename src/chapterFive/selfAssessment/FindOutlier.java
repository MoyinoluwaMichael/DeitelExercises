package chapterFive.selfAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutlier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of numbers");
        String userInput = input.nextLine();
        String splitedUserInput = Arrays.toString(userInput.split(","));
        int length = splitedUserInput.length();

//        userInput.split(",")

        System.out.println(splitedUserInput);
        System.out.println(length);



    }
}
