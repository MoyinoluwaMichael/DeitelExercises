package hackerRank.level2;

import java.util.Arrays;

public class FindFirstUnique {
    private static int findFirstUnique(int[] arr) {
        for (int num : arr) {
            int count = 0;
            for (int num2 : arr) {
                if (num == num2) count++;
            }
            if (count == 1) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findFirstUnique(new int[]{4, 5, 1, 2, 0, 4}));
    }
}
