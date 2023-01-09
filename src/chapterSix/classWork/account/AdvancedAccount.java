package chapterSix.classWork.account;

import java.util.Scanner;

public class AdvancedAccount {
    Scanner input = new Scanner(System.in);
    private String accountName;
    private String accountNumber;
    private String accountPin;
    private double balance;



    public AdvancedAccount(String accountName, String accountNumber, String accountPin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountPin = accountPin;
    }
    public static String displayErrorMessage(){
        String error = """
                Wrong input, please try again.
                """;
        return error;
    }
    public static String displayMenu(){
        String menu = """
                1. Check balance
                2. Deposit
                3. Withdraw
                4. Transfer
                """;
        return menu;
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0)
            balance = balance + amount;
    }

    public double getBalance() {
        System.out.print("Dear "+ accountName+", your balance is ");
        return balance;
    }
    public void withdraw(double amount, String pin) {
        if (amount > 0 && amount <= balance && pin.equals(accountPin)) {
            balance = balance - amount;
        }
    }
}
