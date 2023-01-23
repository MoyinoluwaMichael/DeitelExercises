package tdd.chapterEight;

import static org.junit.jupiter.api.Assertions.*;

import chapterEight.classWork.bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class AccountTest {
        private Account paulineAccount;

        @BeforeEach
        public void setUpTest() {
            paulineAccount = new Account( "Paul", 1,"1234");
        }

        @Test
        public void depositTest() {
            paulineAccount.deposit(BigDecimal.valueOf(2_000));
            assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
        }

        @Test
        public void getBalanceWithCorrectPinTest() {
            paulineAccount.deposit(BigDecimal.valueOf(2_000));
            assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
        }

        @Test
        public void getBalanceWithWrongPinThrowsExceptionTest() {
            paulineAccount.deposit(BigDecimal.valueOf(2_000));
            assertThrows(IllegalArgumentException.class, () -> paulineAccount.getBalance("2214"));
        }

        @Test
        public void withdrawWithRightPinTest() {
            paulineAccount.deposit(BigDecimal.valueOf(1_200));
            paulineAccount.withdraw(BigDecimal.valueOf(200), "1234");
            assertEquals(BigDecimal.valueOf(1_000), paulineAccount.getBalance("1234"));
        }

        @Test
        public void getWithdrawWithWrongPinThrowsExceptionTest() {
            paulineAccount.deposit(BigDecimal.valueOf(1_200));
            paulineAccount.withdraw(BigDecimal.valueOf(200), "1234");
            assertThrows(IllegalArgumentException.class, () -> paulineAccount.getBalance("2214"));
        }
        @Test
        public void getInfoToString(){
            System.out.printf("%s",paulineAccount.toString());
        }

    }

