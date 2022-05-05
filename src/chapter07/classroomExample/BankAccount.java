package chapter07.classroomExample;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	public boolean withdraw(int amount) {
		if(this.balance > amount) {
		this.balance -= amount;
		return true;
	}else {
		return false;
		}
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(balance < amount) {
			return true;
		}else {
			this.balance -= amount;
			otherAccount.balance += this.balance;
			return false;
			}
	}
}
