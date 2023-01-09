package chapterThree.selfAssessment.heartRateCalculator;

import javax.management.StringValueExp;
import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Man newMan = new Man();

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        newMan.setFirstName(firstName);
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        newMan.setLastName(lastName);
        String userName = newMan.getName();

        System.out.printf("Dear %s, kindly enter your date of birth as required below\n", userName);
        System.out.print("Date of birth in day: ");
        int dobInDay = scanner.nextInt();
        newMan.setDateOfBirthInDay(dobInDay);
        System.out.print("Date of birth in month: ");
        int dobInMonth = scanner.nextInt();
        newMan.setDateOfBirthInMonth(dobInMonth);
        System.out.print("Date of birth in year: ");
        int dobInYear = scanner.nextInt();
        newMan.setDateOfBirthInYear(dobInYear);
        int userAge = newMan.getAge();

        System.out.println("Computing your age...");

        System.out.printf("Dear %s, you are %d years old\nYour maximum heart rate is %dbpm%nYour target heart rate is between the range of %.0fbpm and " +
                        "%.0fbpm", userName, userAge, newMan.calculateMaximumHeartRate(), newMan.calculateMinimumTargetHeartRate(),
                newMan.calculateMaximumTargetHeartRate());







    }




}
