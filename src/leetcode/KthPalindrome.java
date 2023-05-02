package leetcode;

public class KthPalindrome {
    public static long[] kthPalindrome(int[] queries, int intLength){
        for (int i = 0; i < queries.length; i++) {
            queries[i] = ((int) Math.pow(10, intLength-1)+1)+1;
        }
        return null;
    }
}
