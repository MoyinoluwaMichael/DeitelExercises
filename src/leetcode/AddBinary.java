package leetcode;
//Given two binary strings a and b, return their sum as a binary string.

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AddBinary {
    public static String addBinary(String firstBinaryNumber, String secondBinaryNumber) {
        if (firstBinaryNumber.equals("0") && secondBinaryNumber.equals("0")) {
            return "0";
        }
        int firstBinaryNumberLength = firstBinaryNumber.length();
        int secondBinaryNumberLength = secondBinaryNumber.length();
        int[] result;
        int maxLength;
        int[] firstBinary;
        int[] secondBinary;
        if (firstBinaryNumberLength == secondBinaryNumberLength) {
            maxLength = firstBinaryNumberLength;
            maxLength += 1;
            result = new int[maxLength];
        } else {
            maxLength = Math.max(firstBinaryNumberLength, secondBinaryNumberLength);
            maxLength += 1;
            result = new int[maxLength];
        }
        firstBinary = new int[maxLength];
        secondBinary = new int[maxLength];
        for (int count = maxLength - 1; count >= 0; count--) {
            if (firstBinaryNumberLength > 0) {
                firstBinary[count] = Integer.parseInt(String.valueOf(firstBinaryNumber.charAt(firstBinaryNumberLength - 1)));
                firstBinaryNumberLength--;
            }
            if (secondBinaryNumberLength > 0) {
                secondBinary[count] = Integer.parseInt(String.valueOf(secondBinaryNumber.charAt(secondBinaryNumberLength - 1)));
                secondBinaryNumberLength--;
            }
        }
        StringBuilder resultInString = new StringBuilder();
        int remainder = 0;
        for (int count = maxLength - 1; count >= 0; count--) {
            int sum = 0;
            int moduleSum = (firstBinary[count] + secondBinary[count] + remainder) % 2;
            int divisionSum = (firstBinary[count] + secondBinary[count] + remainder) / 2;
            if (divisionSum == 0 && moduleSum == 1) {
                sum = 1;
                remainder = 0;
            } else if (divisionSum == 1 && moduleSum == 0) {
                sum = 0;
                remainder = 1;
            } else if (divisionSum == 1 && moduleSum == 1) {
                remainder = 1;
                sum = 1;
            } else {
                remainder = 0;
                sum = 0;
            }

            result[count] = sum;
        }
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) break;
            count++;
        }
        for (int i = count; i < result.length; i++) {
            resultInString.append(result[i]);
        }
        return resultInString.toString();
    }

    public static void main(String[] args) {

        System.out.println(addBinary("1011110001101101010101010101010101010101101010", "110101100101010101101010101100101011001"));
    }

}
