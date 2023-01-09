package chapterFive.selfAssessment;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Test {
    private int number = 5;

    public static void main(String[] args) {
        int spacing = 18;
        int asterisk2 = 1;

//
//        for (int column = 1; column <= 10; column++){
//            for (int ast1 = 1; ast1 <= column; ast1++){
//                System.out.print("*");
//            }
//            for (int space1 = spacing; space1 >= column; space1--){
//                System.out.print("0");
//            }
//            for (int ast1 = 1; ast1 <= asterisk2; ast1++){
//                System.out.print("*");
//            }
//            System.out.println();
//            spacing--;
//            asterisk2+=2;
//        }
        SecureRandom secureRandom = new SecureRandom();
        int[] test = new int[5];
        int total = 0;

        System.out.printf("%s%10s%n", "Index", "Value");

        for (int i = 1; i <= 100; i++) {
            ++test[secureRandom.nextInt(5)];
        }
        for (int i: test) {
            total += i;
            System.out.printf("%s%10d%n","-",i);
        }
        System.out.println("Total value is: " + total);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();



    }
}
