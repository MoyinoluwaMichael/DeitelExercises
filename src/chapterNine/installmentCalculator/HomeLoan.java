package chapterNine.installmentCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class HomeLoan extends Loan{
    private double interestRate;

    public HomeLoan(BigDecimal principal, int tenure){
        super(principal, tenure);
        interestRate = 7;
    }

//    @Override
//    public String toString(){
//        calculateMonthlyInstallment(tenure);
//        String naira = NumberFormat.getCurrencyInstance().toString();
//        return String.format("""
//                =====================================
//                Loan Type: %s
//                Principal: %s%s
//                Tenure: %s
//                Interest Rate: %s%s
//                Monthly Installment Payable: %s%s
//                =====================================
//                """, getClass().getName(), naira, principal.toPlainString(), tenure, interestRate, "%", naira, monthlyInstallmentPayable.toPlainString());
//    }
}
