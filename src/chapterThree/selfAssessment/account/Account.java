package chapterThree.selfAssessment.account;

public class Account{

	private String name;
	private double balance;
	private String pin;

	public Account(String defaultName, double defaultBalance){
		name = defaultName;
		if (defaultBalance > 0.0){
			balance = defaultBalance;
		}
	}

	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void deposit(double depositAmount){
		if (depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}
	public void setPin(String pinNumber){
		pin = pinNumber;
	}
	public void withdraw(double withdrawMoney){
		if (withdrawMoney > 0.0 && withdrawMoney < balance){
			balance = balance - withdrawMoney;
		}
	}
	public double getBalance(){
		return balance;
	}
	@Override
	public String toString(){
		return String.format("""
				Account name: 	 %s
				Account balance: %.2f
				Account pin: 	 %s
				""", name, balance, pin);
	}






}