package chapterSix.selfAssessment;

public class FloorAndCeil {
    private static int myCeil(double num){
        return (int)num+1;
    }
    private static int myFloor(double num){
        return (int)num;
    }

    public static void main(String[] args) {
        System.out.println(myCeil(12.1));
        System.out.println(myFloor(12.1));
    }
}
