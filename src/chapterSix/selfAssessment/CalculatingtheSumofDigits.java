package chapterSix.selfAssessment;

public class CalculatingtheSumofDigits {
    private static int calculateSumOfDigits(int fourDigitNumber){
        int sum = (fourDigitNumber/1000)+(fourDigitNumber%1000/100)+(fourDigitNumber%1000%100/10)+
                (fourDigitNumber%1000%100%10);
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(calculateSumOfDigits(7631));
    }
}
