package chapterFive.selfAssessment.starShapedAsterisks;

public class StarShapedAsterisks {
    public static void main(String[] args) {

        int space = 16;
        for (int column = 1; column <= 9; column+=2){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++) {
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        space--;
        for (int column = 13; column <= 21; column+=8){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space-=4;
        }
        space = 10;
        for (int column = 13; column <= 13; column++){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
        }
        space=9;
        int space2=3;
        for (int column = 6; column >= 2; column-=2){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
            for (int spacesInRow2 = 1; spacesInRow2 <= space2; spacesInRow2++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            space2+=6;
        }
        space=6;
        space2=19;
        for (int column = 1; column == 1; column++){
            for (int spacesInRow = 1; spacesInRow <= space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
            for (int spacesInRow2 = 1; spacesInRow2 <= space2; spacesInRow2++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <=column; asterisks++){
                System.out.print("*");
            }
        }
    }
}
