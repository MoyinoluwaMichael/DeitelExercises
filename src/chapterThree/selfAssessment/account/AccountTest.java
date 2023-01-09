package chapterThree.selfAssessment.account;

import java.util.Scanner;
public class AccountTest{

	public static void main(String[] args){


		Scanner input = new Scanner(System.in);
		Account customer = new Account("Welcome, wonderful customer!", 0.0);

		String customerName = input.nextLine();
		customer.setName(customerName);

		System.out.println("Set your pin first: ");
		String customerPin = input.nextLine();
		customer.setPin(customerPin);

		System.out.printf("%nWelcome, %s%n",customer.getName());

		System.out.println("How much would you like to deposit?");
		double depositAmount = input.nextDouble();
		customer.deposit(depositAmount);

		System.out.printf("%nWelcome, %s%nYour current balance is now: %.3f%n",customer.getName(),customer.getBalance());


		System.out.println("How much would you like to withdraw?");
		double withdrawAmount = input.nextDouble();

		System.out.println("Enter your pin");
		String pin = input.nextLine();

		if (pin.equals(customerPin)){
			if (withdrawAmount < customer.getBalance()){
				customer.withdraw(withdrawAmount);
				System.out.printf("%nWelcome back, %s%nYour current balance is now: %.3f%n",customer.getName(),customer.getBalance());
			}
			else {System.out.printf("Insufficient balance!");
			}
		}
		else {System.out.printf("Incorrect pin!");
		}


	}

	public static void displayAccount(Account deborahAccount){
		System.out.printf("%s%.2f",deborahAccount.getName(),deborahAccount.getBalance());
	}



}