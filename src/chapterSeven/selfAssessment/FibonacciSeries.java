package chapterSeven.selfAssessment;

public class FibonacciSeries {
    private static void fibonacci(int lengthOfNumber){
        int [] fibonacciSeries = new int[lengthOfNumber];
        for (int i = 0; i < lengthOfNumber; i++) {
            String comma = i != lengthOfNumber - 1?", ": "";
            if (i > 1) {
                int nextInt = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                fibonacciSeries[i] = nextInt;
                System.out.print(nextInt+comma);
            }
            else {
                fibonacciSeries[i] = i;
                System.out.print(i+comma);
            }
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
