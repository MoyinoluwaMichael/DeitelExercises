package chapterFive.selfAssessment.squareRoot;

import java.security.SecureRandom;
import java.util.Scanner;

public class SquareRootFunctionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(SquareRootFunction.squareRootOf(81.0));

        System.out.println(SquareRootFunction.getBalance());

        int balance = SquareRootFunction.getBalance();
        int result = Math.max(2, 5);

        String word = "Hello "+result+7+" there ";
        System.out.println(word + result + 7+" Bye");
        int y= 5;
        String check = "y+2 = "+y+2;
        System.out.println(check);

        SecureRandom random = new SecureRandom();
        int guess = -6+random.nextInt(2);
        System.out.println(guess);

//        int userInput = input.nextInt();
//        if (userInput == guess){
//            System.out.println("Great!");
//        }
//        else {
//            System.out.println("Not too good4");
//        }





    }
}

