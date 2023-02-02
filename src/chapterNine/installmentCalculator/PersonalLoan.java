package chapterNine.installmentCalculator;

import java.math.BigDecimal;

public class PersonalLoan extends Loan{

    private double interestRate;

    public PersonalLoan(BigDecimal principal, int tenure){
        super(principal, tenure);
        interestRate = 4;
    }
}
