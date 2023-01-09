package chapterSix.selfAssessment;

public class Divisibleby5 {
    private static boolean isDivisible(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isDivisible(19));
    }
}
