package chapterNine.installmentCalculator;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal");
        BigDecimal principal = scanner.nextBigDecimal();
        System.out.println("Enter tenure in months");
        int tenure = scanner.nextInt();

        Loan [] loans = {
                new HomeLoan(principal, tenure),
                new VehicleLoan(principal, tenure),
                new PersonalLoan(principal, tenure)
        };
        for (Loan loan: loans) {
            System.out.println(loan);
            System.out.print("Loading");
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
