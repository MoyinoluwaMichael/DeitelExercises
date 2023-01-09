package chapterFive.assignment;

public class TrianglePrintingProgram1 {
    public static void main(String[] args) {

        for (int column = 1; column <= 10; column++){
            for (int asterisksInRow = 1; asterisksInRow <= column; asterisksInRow++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int column = 10; column >= 1; column--){
            for (int asterisksInRow = 1; asterisksInRow <= column; asterisksInRow++){
                System.out.print("*");
            }
            System.out.println();
        }
        int space = 0;
        for (int column = 10; column >= 1; column--){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisksInRow = 1; asterisksInRow <= column; asterisksInRow++){
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
        space = 9;
        for (int column = 1; column <= 10; column++){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisksInRow = 1; asterisksInRow <= column; asterisksInRow++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}
