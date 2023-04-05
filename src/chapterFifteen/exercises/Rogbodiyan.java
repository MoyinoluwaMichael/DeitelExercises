package chapterFifteen.exercises;

import java.util.Arrays;

public class Rogbodiyan {

    private static int[] getIndex(int[] numbers) {
        int [] copy = new int[numbers.length];
        int smallest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        int [] result = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers.length; j++)  if (i != j) sum += numbers[j];
            copy[i] = sum;
            if (copy[i] < smallest) {
                smallest = copy[i];
                result[0] = i;
            }
            if (copy[i] > highest){
                highest = copy[i];
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] number = {9, -5, 7, 67,-32,-12};
        System.out.println(Arrays.toString(getIndex(number)));
    }
}
