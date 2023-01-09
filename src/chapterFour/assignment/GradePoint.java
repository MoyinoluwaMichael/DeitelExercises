package chapterFour.assignment;

import java.util.Scanner;

public class GradePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        String positionSuperScript = "";

        for (int count = 1;count <= 30; count++){
            if (count == 11 || count == 12){
                positionSuperScript = "th";
            }
            else if (count == 1 || count % 10 == 1) {
                positionSuperScript = "st";
            } else if (count == 2 || count % 10 == 2) {
                positionSuperScript = "nd";
            } else if (count == 3 || count % 10 == 3) {
                positionSuperScript = "rd";
            } else {
                positionSuperScript = "th";
            }
            System.out.print("Enter " + count + positionSuperScript + " Grade: ");
            int grade = input.nextInt();
            sum += grade;
        }
        int average = sum/10;
        System.out.printf("%s%d", "The class's average grade is ", average);


    }
}
