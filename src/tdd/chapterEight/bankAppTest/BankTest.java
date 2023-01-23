package tdd.chapterEight.bankAppTest;

import static org.junit.jupiter.api.Assertions.*;

import chapterEight.classWork.bank.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BankTest {
    private Bank wemaBank;

    @BeforeEach
    public void startEachTestWith() {
        wemaBank = new Bank();
        wemaBank.createAccountFor("Pauline", "Obibia", "6758");
    }

    @Test
    public void accountCanBeCreatedTest() {
        wemaBank = new Bank();
        wemaBank.createAccountFor("Pauline", "Obibia", "6758");
        wemaBank.createAccountFor("seyi", "Obibia", "4322");
        wemaBank.createAccountFor("Chinwe", "Obibia", "6718");
        assertEquals(3, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreation() {
        String expected = """
                ======================
                Account Name: Pauline Obibia
                Account Number: 1
                Account Balance: 0
                ======================
                """;
        assertEquals(expected, wemaBank.findAccount(1).toString());
    }

    @Test
    public void balanceCanBeCheckedTest() {
        assertEquals("0", wemaBank.checkBalanceFor(1, "6758").toPlainString());
    }

    @Test
    public void depositIntoAccountTest() {
        wemaBank.depositInto(1, BigDecimal.valueOf(50));
        assertEquals("50", wemaBank.checkBalanceFor(1, "6758").toPlainString());
    }

    @Test
    public void withdrawFromAccountTest() {
        wemaBank.depositInto(1, BigDecimal.valueOf(50));
        wemaBank.withdrawFrom(1, BigDecimal.valueOf(20), "6758");
        assertEquals(BigDecimal.valueOf(30), wemaBank.checkBalanceFor(1, "6758"));
    }

    @Test
    public void transferTest() {
        wemaBank.createAccountFor("All", "Well", "7654");
        wemaBank.depositInto(1, BigDecimal.valueOf(5000));
        wemaBank.transfer(BigDecimal.valueOf(3000), 1, 2, "6758");
        assertEquals(BigDecimal.valueOf(3000), wemaBank.checkBalanceFor(2, "7654"));
    }


}
