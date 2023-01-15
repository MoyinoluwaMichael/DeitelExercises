package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int [] result;
        String digitsInString = "";
        for (int digit : digits) {
            digitsInString += digit;
        }
        String list = String.format("%.0f", Double.parseDouble(digitsInString)+ 1);
        result = new int [list.length()];
        for (int count = 0; count < list.length(); count++){
            result[count] = Integer.parseInt(String.valueOf(list.charAt(count)));
            System.out.println(result[count]);
        }
        return (result);
    }

    public static void main(String[] args) {
        int[] numbers = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }
}
