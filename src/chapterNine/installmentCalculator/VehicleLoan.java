package chapterNine.installmentCalculator;

import java.math.BigDecimal;

public class VehicleLoan extends Loan{
    private double interestRate;


    public VehicleLoan(BigDecimal principal, int tenure){
        super(principal, tenure);
        interestRate = 5;
    }

}
