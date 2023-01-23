package chapterEight.classWork.bank;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
        ArrayList<Account> accounts = new ArrayList<>();

        public void createAccountFor(String firstName, String lastName, String pin) {
            int accountNumber = accounts.size() + 1;
            Account newAccount = new Account(firstName + " " + lastName, accountNumber, pin);
            accounts.add(newAccount);
        }

        public int getNumberOfCustomers() {
            return accounts.size();
        }
        public Account findAccount(int accountNumber){
            return accounts.get(accountNumber-1);
        }
        public BigDecimal checkBalanceFor(int accountNumber, String pin){
            Account account = findAccount(accountNumber);
            return account.getBalance(pin);
        }

        public void depositInto(int accountNumber, BigDecimal amount) {
            Account account = findAccount(accountNumber);
            account.deposit(amount);
        }
        public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
            Account account = findAccount(accountNumber);
            account.withdraw(amount, pin);
        }
        public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin){
            findAccount(senderAccountNumber).withdraw(amount,senderPin);
            findAccount(receiverAccountNumber).deposit(amount);
        }

    }

