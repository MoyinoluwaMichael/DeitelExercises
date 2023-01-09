package chapterSix.selfAssessment;

public class GreatestCommonDivisor {
    private static int gcd(int firstNumber, int secondNumber) {
        int highestFactor = 0;
        for (int count = 1; count <= Math.min(firstNumber, secondNumber); count++) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                if (count > highestFactor) {
                    highestFactor = count;
                }
            }
        }
        return highestFactor;
    }

    public static void main(String[] args) {

        System.out.println(gcd(4, 7));
    }
}
