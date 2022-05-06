package chapter07.classroomExample.Ex04;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBY;
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBY) {
		super(balance);
		this.protectedBY = protectedBY;
	}
	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			protectedBY.balance -= (amount - balance);
			balance -= balance;
		} else {
			this.balance -= amount;		
		}
		return true;
		
		/*if (amount > balance) {
			protectedBy.withdraw(amount - balance);
			balance = 0;
		} else {
			super.withdraw(amount);
		}
		return true;
		*/
	}
}

