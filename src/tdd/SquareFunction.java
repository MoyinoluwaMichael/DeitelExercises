package tdd;

public class SquareFunction {
    public static double squareOf(double number, double power) {
        double result = 1;
        for (int count = 1; count <= power; count++){
            result *= number;
        }
        if (power < 0) {
            power *= -1;
            for (int count = 1; count <= power; count++){
                result *= number;
            }
            result = 1/result;
        }
        return result;
    }


}
