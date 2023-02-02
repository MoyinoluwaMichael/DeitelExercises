package chapterNine.installmentCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Loan {
    private double interestRate;
    private BigDecimal principal;
    private int tenure;
    private BigDecimal monthlyInstallmentPayable;

    public Loan(BigDecimal principal, int tenure) {
        this.principal = principal;
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        calculateMonthlyInstallment(tenure);
        String naira = NumberFormat.getCurrencyInstance().toString();
        return String.format("""
                =====================================
                Loan Type: %s
                Principal: %s%s
                Tenure: %s
                Interest Rate: %s%s
                Monthly Installment Payable: %s%s
                =====================================
                """, getClass().getName(), naira, principal.toPlainString(), tenure, interestRate, "%", naira, monthlyInstallmentPayable.toPlainString());
    }

    void calculateMonthlyInstallment(int tenure) {
        BigDecimal interest = principal.multiply(BigDecimal.valueOf(interestRate).multiply(BigDecimal.valueOf(tenure))).divide(BigDecimal.valueOf(100));
        monthlyInstallmentPayable = principal.add(interest).divide(BigDecimal.valueOf(tenure), RoundingMode.FLOOR);
    }
}
