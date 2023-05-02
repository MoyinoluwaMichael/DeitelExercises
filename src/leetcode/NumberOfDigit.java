package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfDigit {
    public static int getNumberOfDigit(String[] arr){
        List<Character> numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        int count = 0;
        for (var word : arr) {
            for (int i = 0; i < word.length(); i++) {
                if (numbers.contains(word.charAt(i))) count++;
            }
        }
        return count;
    }

}
