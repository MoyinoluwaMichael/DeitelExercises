package leetcode;

import java.util.Arrays;
import java.util.List;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int counter = 0;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ')' && i != j) {
                        counter++;
                        if (counter == (count + 1) - count2) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if (s.charAt(i) == ')' && i > 0) {
                count2++;
            }
        }
        return count * 2;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }
}