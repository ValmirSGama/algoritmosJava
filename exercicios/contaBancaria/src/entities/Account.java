package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void updated(double updated) {
		this.balance += updated;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw - 5;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
}
