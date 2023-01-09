package chapterFour.assignment;

import java.util.Scanner;

public class switchCaseStatementTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Goal Keeper");
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Defender");
            case 6:
            case 7:
            case 8:
                System.out.println("Midfielder");
            case 9:
            case 10:
            case 11:
                System.out.println("Attacker");
            default: System.out.println("You know sabi ball.");
        }


    }
}
