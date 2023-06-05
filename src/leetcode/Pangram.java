package leetcode;

public class Pangram {
    static final String [] ALPHABETS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};
    public static void main(String[] args) {
        System.out.println(isPangram("The five boxing wizards jump quickly."));
    }
    public static boolean isPangram(String sentence){
        int count = 0;
        for (String letter : ALPHABETS) {
            if (sentence.contains(letter) || sentence.contains(letter.toUpperCase())) count++;
            if (count == 24) return true;
        }
        return false;
    }
}
