package chapterFive.deitelExercises;

public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {

        int space1 = 12;
        int space2 = 3;
        for (int column = 1; column <= 10; column++){
            for (int asterisksInRow1 = 1; asterisksInRow1 <= column; asterisksInRow1++){
                System.out.print("*");
            }
            for (int space = 1; space <= space1; space++){
                System.out.print(" ");
            }
            for (int secondAsterisksInRow = 10; secondAsterisksInRow >= column; secondAsterisksInRow--){
                System.out.print("*");
            }
            for (int space = 1; space <= space2; space++){
                System.out.print(" ");
            }
            for (int thirdAsterisksInRow = 10; thirdAsterisksInRow >= column; thirdAsterisksInRow--){
                System.out.print("*");
            }
            for (int space = 1; space <= space1; space++){
                System.out.print(" ");
            }
            for (int asterisksInRow1 = 1; asterisksInRow1 <= column; asterisksInRow1++){
                System.out.print("*");
            }
            space1--;
            space2+=2;
            System.out.println();
        }
    }
}
