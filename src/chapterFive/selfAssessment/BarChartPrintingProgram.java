package chapterFive.selfAssessment;

import java.nio.IntBuffer;
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder asterisks = new StringBuilder("");

        for (int count = 1; count <= 5; count++){
            System.out.print("Enter a number between 1 and 30: ");
            int userInput = input.nextInt();
            asterisks.append("*".repeat(userInput)).append("\n");
        }
        System.out.println(asterisks);
        String book = input.nextLine();




    }
}
