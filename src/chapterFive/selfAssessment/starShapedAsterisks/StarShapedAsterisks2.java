package chapterFive.selfAssessment.starShapedAsterisks;

public class StarShapedAsterisks2 {
    public static void main(String[] args) {

        int space = 25;

        for (int column = 1; column <= 9; column+=2){
            for (int spacesInRow = 1; spacesInRow < space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        space--;
        for (int column = 13; column <= 29; column+=8){
            for (int spacesInRow = 1; spacesInRow < space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space-=4;
        }
        space+=8;
        for (int column = 21; column >= 13; column-=8) {
            for (int spacesInRow = 1; spacesInRow < space; spacesInRow++) {
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space+=4;
        }
        space = 21;
        for (int column = 9; column >= 1; column-=2){
            for (int spacesInRow = 1; spacesInRow < space; spacesInRow++){
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= column; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
