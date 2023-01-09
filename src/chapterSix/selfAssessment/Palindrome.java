package chapterSix.selfAssessment;

import java.util.Arrays;

public class Palindrome {
    private static boolean isPalindrome(int number){
        String newNumber = "";
        for (int count = String.valueOf(number).length() - 1; count > 0; count--){
            newNumber += (String.valueOf(String.valueOf(number).charAt(count)));
        }
        return newNumber.equals(String.valueOf(number));
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
