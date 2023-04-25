package cycleCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first day date of your last period cycle in this format(dd/mm/yyyy): ");
        String startDate = scanner.next();
        System.out.println("Enter your period length: ");
        int periodLength = scanner.nextInt();
        System.out.println("Enter your cycle interval: ");
        int cycleInterval = scanner.nextInt();

        Calculator periodCalculator = new Calculator(startDate, periodLength, cycleInterval);

        for (Cycle cycle : periodCalculator.calculateCyclesOverThePeriodOf(12)) {
            System.out.println(cycle);
            System.out.println();
        }

    }
}
