package leetcode;

public class Sqrt {
    private static int sqrt(int number) {
        double result = 0;
        if (number == 1) return number;
        for (double count = 0; count < number; count++) {
            result = count * count;
            if (result == number) {
                return (int) count;
            } else if (result > number) {
                return (int) (count - 1);
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(Integer.MAX_VALUE));
    }
}
