package chapterSix.classWork.account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        System.out.println(new AdvancedAccount("Moyin", "1234", "1111"));
    }
//        Scanner input = new Scanner(System.in);
//
//        AdvancedAccount customerAdvancedAccount1 = new AdvancedAccount("Moyinoluwa Michael", "0092206389", "2022");
//        AdvancedAccount customerAdvancedAccount2 = new AdvancedAccount("Awoyele Olakunle", "0800607908", "2311");
//        AdvancedAccount customerAdvancedAccount3 = new AdvancedAccount("Duyilemi Zainab", "0197907935", "1995");
//        AdvancedAccount customerAdvancedAccount4 = new AdvancedAccount("Adekangbe James", "0234806578", "1010");
//        AdvancedAccount customerAdvancedAccount5 = new AdvancedAccount("Ajanlekoko Damian", "0452752110", "2211");
//
//        customerAdvancedAccount1.deposit(100000);
//        System.out.println(customerAdvancedAccount1.getBalance());
//        System.out.println(customerAdvancedAccount2.getBalance());
//        System.out.println(customerAdvancedAccount3.getBalance());
//        System.out.println(customerAdvancedAccount4.getBalance());
//        System.out.println(customerAdvancedAccount5.getBalance());
//
//        System.out.println(AdvancedAccount.displayMenu());
//        int menu = input.nextInt();
//        while (menu < 1 || menu > 4){
//            System.out.println(AdvancedAccount.displayErrorMessage()+AdvancedAccount.displayMenu());
//            menu = input.nextInt();
//        }
//        switch (menu) {
//            case 1 -> {
//                customerAdvancedAccount1.getBalance();
//            }
//            case 2 -> {
//                System.out.print("Enter amount to deposit: ");
//                double amount = input.nextDouble();
//                customerAdvancedAccount1.deposit(amount);
//            }
//            case 3 -> {
//                System.out.print("Enter amount to withdraw: ");
//                double amount = input.nextDouble();
//                System.out.print("Enter pin: ");
//                String pin = input.next();
//                customerAdvancedAccount1.withdraw(amount, pin);
//            }
//            case 4 -> {
//                System.out.println("Enter recipient's account number: ");
//                String recipientAccountNumber = input.next();
//                System.out.print("Enter amount to transfer: ");
//                double transferAmount = input.nextDouble();
//                System.out.print("Enter pin: ");
//                String pin = input.next();
//                customerAdvancedAccount1.withdraw(transferAmount, pin);
//                System.out.println("Dear " + customerAdvancedAccount1.getAccountName() + ", you have successfully transferred " + transferAmount);
//                switch (recipientAccountNumber) {
//                    case "0800607908" -> {
//                        customerAdvancedAccount2.deposit(transferAmount);
//                    }
//                    case "0197907935" -> {
//                        customerAdvancedAccount3.deposit(transferAmount);
//                    }
//                    case "0234806578" -> {
//                        customerAdvancedAccount4.deposit(transferAmount);
//                    }
//                    case "0452752110" -> {
//                        customerAdvancedAccount5.deposit(transferAmount);
//                    }
//                }
//            }
//        }
//        System.out.println(customerAdvancedAccount1.getBalance());
//        System.out.println(customerAdvancedAccount2.getBalance());
//        System.out.println(customerAdvancedAccount3.getBalance());
//        System.out.println(customerAdvancedAccount4.getBalance());
//        System.out.println(customerAdvancedAccount5.getBalance());
//
//    }
}
