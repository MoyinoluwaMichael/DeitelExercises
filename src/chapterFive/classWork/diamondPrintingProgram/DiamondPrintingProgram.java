package chapterFive.classWork.diamondPrintingProgram;

public class DiamondPrintingProgram {
    public static void main(String[] args) {

        StringBuilder asterisks = new StringBuilder("*");
        StringBuilder asterisksSpace = new StringBuilder("");

        for (int count = 1; count <= 9; count++){
            if (count >= 6){
                asterisks.delete(0, 2);
                asterisksSpace.delete(1, 2);
                if (count == 9){
                    asterisksSpace.delete(0, 2);
                }
                System.out.printf(asterisksSpace + "%10s%n", asterisks);
            }
            else {
                System.out.printf(asterisksSpace + "%10s%n", asterisks);
                if (count < 5){
                    asterisks.append("**");
                    asterisksSpace.append(" ");
                }
            }
        }
    }
}
