package chapterFive.classWork;

public class PythagoreanTriples {
    public static void main(String[] args) {

        for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int side3 = side2+1; side3 <= 500; side3++) {
                    if ((hypotenuse * hypotenuse) == (side2 * side2) + (side3 * side3)) {
                        System.out.printf("%d, %d, %d%n", side3, side2, hypotenuse);
                        System.out.printf("%d + %d = %d%n", side3 * side3, side2 * side2, hypotenuse * hypotenuse);
                        System.out.printf("%d = %d%n", side3 * side3 + side2 * side2, hypotenuse * hypotenuse);
                        System.out.println();

                    }
                }
            }
        }


    }
}
