package chapterFour.selfAssessment;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to be invested: ");
        double principal = scanner.nextInt();
        System.out.print("How long would you want to invest?: ");
        int year = scanner.nextInt();
        System.out.printf("%s%20s%n", "Year", "Savings");

        for (int count = 1; count <= year; count++) {
            double rate = 0.05;
            double interest = principal * rate;
            principal += interest;
            System.out.printf("%2d%21.2f%n", count, principal);


        }
    }
}

