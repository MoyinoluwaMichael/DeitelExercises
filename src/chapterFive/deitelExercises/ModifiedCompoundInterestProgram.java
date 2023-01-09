package chapterFive.deitelExercises;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {

        double principal = 1000;
        double rate = 5;

        for (int year = 1; year <= 6; year++){
            double interest = rate/100;
            double interestRate = interest*principal;
            double amount = principal+interestRate;
            System.out.printf("%2d%10.2f%n", year, amount);
            principal = amount;
            rate++;

        }
    }
}
