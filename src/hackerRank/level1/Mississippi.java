package hackerRank.level1;

public class Mississippi {
    private static int findNumberOfOccurrences(String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++) count = word.charAt(i) == letter?count+1:count;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfOccurrences("Mississippi", 's'));
    }
}
