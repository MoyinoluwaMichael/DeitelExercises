package chapterEight.classWork.bank;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class AtMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static final Bank gtbank = new Bank();

    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                =====================
                Welcome to GTB Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5. Check Balance
                6 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exitApplication();
            default -> gotoMainMenu();
        }
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String pin = (input("Enter your pin"));
        gtbank.createAccountFor(firstName, lastName, pin);
        gotoMainMenu();
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        gtbank.depositInto(accountNumber, amount);
        display("Deposited Successfully");
        gotoMainMenu();
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your pin");
        try {
            gtbank.depositInto(accountNumber, amount);
        } catch (IllegalArgumentException ex) {
            display(ex.getMessage());
            withdraw();
        }
        gotoMainMenu();
    }

    private static void transfer() {
        int senderAccountNumber = Integer.parseInt(input("Enter your account number"));
        int receiverAccountNumber = Integer.parseInt(input("Enter your receiver number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your pin");
        try {
            gtbank.withdrawFrom(senderAccountNumber, amount, pin);
            gtbank.depositInto(receiverAccountNumber, amount);
        } catch (IllegalArgumentException ex) {
            display(ex.getMessage());
            transfer();
        }
        gotoMainMenu();
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        String pin = input("Enter your pin");
        String accountBalance = String.format("""
                Your account balance is %s
                """, gtbank.checkBalanceFor(accountNumber, pin));
        display(accountBalance);
        gotoMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        display(prompt);
//        return scanner.nextLine();
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
//        System.out.println(message);
    }

    private static void exitApplication() {
        display("Thank you for using our app");
        System.exit(1);
    }


}
