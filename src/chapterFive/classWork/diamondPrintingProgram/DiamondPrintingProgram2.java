package chapterFive.classWork.diamondPrintingProgram;

public class DiamondPrintingProgram2 {
    public static void main(String[] args) {

        String asterisks = "*";
        String space = "";

        for (int count = 1;count <= 9;count++){
            if (count <= 5){
                System.out.printf("%s%10s%n", space, asterisks);
                asterisks += "**";
                space += " ";
            }
            else {
                asterisks = "*";
                switch (count){
                    case 6 -> {asterisks += "******";space += " ";}
                    case 7 -> {asterisks += "****";space += " ";}
                    case 8 -> {asterisks += "**";space += " ";}
                    case 9 -> {space = "         ";}
                }
                System.out.printf("%s%s%n", space, asterisks);
            }
        }
    }
}
