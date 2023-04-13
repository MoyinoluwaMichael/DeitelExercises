package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hcf {

    private static int [] findHcf(int ...numbers){
        List<Integer> factors = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int each : numbers) if (each < min) min = each;
        for (int divisor = 2; divisor < min; divisor++) {
            int count = 0;
            for (int each : numbers) if (each % divisor == 0) count++;
            if (count == numbers.length){
                factors.add(divisor);
                for (int i = 0; i < numbers.length; i++) numbers[i] /= divisor;
                divisor--;
            }
        }
        int [] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) result[i] = factors.get(i);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findHcf(100, 1000)));
    }
}
