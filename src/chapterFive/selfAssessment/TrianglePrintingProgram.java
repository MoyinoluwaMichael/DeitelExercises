package chapterFive.selfAssessment;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        String asterisks = "*";
        int line1 = 2;
        int line2 = 14;
        int line3 = 25;
        int line4 = 29;
        int line5 = 40;
        int line6 = 52;

        for (int count = 1; count <= 10; count++){
            for (int count2 = 1; count2 <= 53; count2++){
                if ((count2 >= line1 && count2 <= line2) || (count2 >= line3 && count2 <= line4) || (count2 >= line5 && count2 <= line6)){
                    System.out.print(" ");
                }
                else {
                    System.out.print(asterisks);
                }
            }
            line1++;
            line3--;
            line4++;
            line6--;
            System.out.println();
        }
    }
}

