package chapterFive.deitelExercises;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeACount = 0;
        int gradeBCount = 0;
        int gradeCCount = 0;
        int gradeDCount = 0;

        for (int student = 1; student <= 5; student++){
            System.out.print("Enter student "+student+" name: ");
            String studentName = input.nextLine();
            System.out.print("Enter student "+student+" grade: ");
            String studentGrade = input.nextLine();
            switch (studentGrade){
                case "A" -> {gradeACount+=1;}
                case "B" -> {gradeBCount+=1;}
                case "C" -> {gradeCCount+=1;}
                case "D" -> {gradeDCount+=1;}
            }
        }
        System.out.println(gradeACount+" student(s) got a grade of A\n"+gradeBCount+" student(s) got a grade of B\n"+
                gradeCCount+" student(s) got a grade of C\n"+gradeDCount+" student(s) got a grade of D");
    }
}
