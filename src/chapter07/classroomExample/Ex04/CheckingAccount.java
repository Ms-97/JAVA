package chapter07.classroomExample.Ex04;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBY;
	
	public CheckingAccount(int balance) {
		super(balance);
		this.balance = balance;
	}
	public CheckingAccount(int balance, SavingsAccount protectedBY) {
		super(balance);
		this.balance = balance;
		this.protectedBY = protectedBY;
	}
	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			protectedBY.balance -= (amount - balance);
			balance -= balance;
			return true;
		} else {
			
			return false;
		}
	}
}
