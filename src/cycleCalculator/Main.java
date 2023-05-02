package cycleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first day date of your last period cycle in this format(dd/mm/yyyy): ");
        String startDate = scanner.next();
        System.out.println("Enter your period length: ");
        int periodLength = scanner.nextInt();
        System.out.println("Enter your cycle interval: ");
        int cycleInterval = scanner.nextInt();

        CycleCalculator periodCycleCalculator = new CycleCalculator(startDate, periodLength, cycleInterval);
        int count = 1;
        for (Cycle cycle : periodCycleCalculator.calculateCyclesOverThePeriodOf(12)) {
            System.out.printf("""
                    CYCLE %d
                    %s
                    """, count, cycle);
            count++;
        }

    }
}
