package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x % 10 == 0 && x != 0)return false;
        int reversed = 0;
        while (x > reversed){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        return reversed == x || x == reversed / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0220));
    }
}