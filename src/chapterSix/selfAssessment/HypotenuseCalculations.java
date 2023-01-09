package chapterSix.selfAssessment;

public class HypotenuseCalculations {
    private static double calculateHypotenuse(double firstSide, double secondSide){
        return Math.sqrt(Math.pow(firstSide,2)+Math.pow(secondSide,2));
    }
    public static void main(String[] args) {

        System.out.println(calculateHypotenuse(8,15));
        System.out.println(Math.hypot(8,15));

    }
}
