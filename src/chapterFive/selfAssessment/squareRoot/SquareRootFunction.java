package chapterFive.selfAssessment.squareRoot;

public class SquareRootFunction {

    private static  int  balance = 10;
    private int amount = 50;

    public static double squareRootOf(double number){
        double squareRoot = 0.0;
        double count = 1.0;
        while (count < number/2){
            double result = count*count;
            if (result == number){
                squareRoot = count;
            }
            count += 0.1;
        }
        return squareRoot;
    }

    public static int getBalance() {
        return balance;
    }
    public static void setBalance(int amount){
        balance+=amount;
    }
    public void setAmount(int quantity){
        amount += quantity;
    }

}
