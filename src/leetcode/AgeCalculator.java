package leetcode;

import java.time.LocalDate;

public class AgeCalculator {
    private static int calculateAge(String dateOfBirth) {
        String[] dates = dateOfBirth.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        return LocalDate.now().getMonthValue() <= Integer.parseInt(dates[1]) && LocalDate.now().getDayOfMonth() < Integer.parseInt(dates[0]) ? LocalDate.now().getYear() - localDate.getYear() - 1 : LocalDate.now().getYear() - localDate.getYear();
    }

    public static void main(String[] args) {
        System.out.println(calculateAge("17/04/2000"));
    }
}
