package chapterSix.selfAssessment;

public class TestforLeapYear {
    private static boolean checkLeapYear(int year){
        return year%4==0;
    }
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2000));
    }
}
