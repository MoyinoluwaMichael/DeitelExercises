package chapterEight.classWork.bank;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts = new ArrayList<>();
    private int accountNumberCount;

    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = ++accountNumberCount;
        Account newAccount = new Account(firstName + " " + lastName, accountNumber, pin);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) return account;
        }
        throw new IllegalArgumentException("Account does not exist");
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
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

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        findAccount(senderAccountNumber).withdraw(amount, senderPin);
        findAccount(receiverAccountNumber).deposit(amount);
    }

    public void closeAccountFor(int accountNumber, String pin) {
        findAccount(accountNumber).validate(pin);
        for (int accountIndex = 0; accountIndex < accounts.size(); accountIndex++) {
            if (accounts.get(accountIndex).getAccountNumber() == accountNumber) accounts.remove(accountIndex);
        }
    }
}

