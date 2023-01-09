package chapterSix.selfAssessment;

public class PerfectNumbers {
    private static boolean isPerfect(int number) {
        int total = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                total += count;
            }
        }
        return total == number;
    }

    private static void displayPerfectNumber(int number) {
        for (int count = 1; count < number; count++) {
            if (isPerfect(count)) {
                System.out.println(count + " is a perfect number");
            }
        }
    }

    public static void main(String[] args) {

        displayPerfectNumber(1000);
    }
}
