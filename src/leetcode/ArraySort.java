package leetcode;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraySort {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(5);
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("gdbgrt");
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("gdbgrthr\"t\"es");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);
        stringBuilder.reverse();


//        int [] numbers = {3,1,4,0};
//        System.out.println(Arrays.toString(sortArray(numbers)));
    }

    private static int[] sortArray(int[] numbers) {
        int [] lArr = new int[numbers.length/2];
        int [] rArr = new int[numbers.length - (numbers.length/2)];
        int count = 0;
        for (int i = 0; i < lArr.length; i++) {
            lArr[i] = numbers[count];
            count++;
        }
        for (int i = 0; i < rArr.length; i++) {
            rArr[i] = numbers[count];
            count++;
        }
        while (lArr.length > 1) sortArray(lArr);
        while (rArr.length > 1) sortArray(rArr);
        int counter = 0;
//        for (int i = 0; i < rArr.length; i++) {
//            if (rArr[i] < lArr[counter]){
//                numbers[]
//            }
//        }
        return null;
    }
}
