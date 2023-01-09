package chapterThree.selfAssessment.computerizationOfHealthRecords;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your Gender: ");
        String userGender = input.nextLine();
        System.out.print("Enter your Day of Birth(dd): ");
        int dobInDay = input.nextInt();
        System.out.print("Enter your Month of Birth(mm): ");
        int dobInMonth = input.nextInt();
        System.out.print("Enter your Year of Birth(yy): ");
        int dobInYear = input.nextInt();
        System.out.print("Enter your height in inches: ");
        double userHeight = input.nextDouble();
        System.out.println("Enter your weight in pounds: ");
        double userWeight = input.nextDouble();

        HealthProfile patient1 = new HealthProfile(firstName, lastName, userGender, dobInDay, dobInMonth, dobInYear, userHeight, userWeight);
        String name = patient1.getName();
        String gender = patient1.getGender();
        String dateOfBirth = patient1.getDateOfBirth();
        double height = patient1.getHeight();
        double weight = patient1.getWeight();
        int age = patient1.getAge();
        double bmi = patient1.getBmi();
        String bmiStatus = patient1.getBmiStatus();
        int maximumHeartRate = patient1.getMaximumHeartRate();
        String targetHeartRateRange = patient1.getTargetHeartRateRange();

        System.out.printf("""
                HEALTH PROFILE
                Name: %s
                Gender: %s
                Date of Birth: %s
                Height: %.2f inches
                Weight: %.2f pounds
                Age: %d
                BMI: %.2f (%s)
                Maximum heart rate: %d
                Target heart rate range: %s
                """,name, gender, dateOfBirth, height, weight, age, bmi, bmiStatus, maximumHeartRate, targetHeartRateRange);
    }
}
