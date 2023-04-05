package leetcode;

import java.util.Arrays;

public class Lcm {
    public static int[] getLcm(int number) {
        int[] result = new int[0];
        for (int i = 2; i <= number; i++) if (number % i == 0) {
            number /= i;
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = i;
            i = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLcm(16)));
    }
}
