package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();		
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		Account account = new Account(number, holder);
		
		System.out.print("Is there a initial deposit (y/n)?");
		char choice = sc.next().charAt(0);
		
		double amount;
		if(choice == 'y') {
			System.out.print("Enter inicial deposit value: ");
			amount = sc.nextDouble();
			account.deposit(amount);
			System.out.println();
			System.out.println("Account data:");
			System.out.print("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $ " + account.getBalance());
			System.out.println();
		}else {
			System.out.println();
			System.out.println("Account data:");
			System.out.print("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $ " + account.getBalance());
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.updated(amount);
		System.out.println("Updated account data:");
		System.out.print("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $ " + account.getBalance());
		
		System.out.println();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.print("Updated account data: ");
		System.out.println();
		System.out.print("Account " + account.getNumber() + ", Holder: " + account.getHolder() + ", Balance: $ " + account.getBalance());
		
		sc.close();
	}

}
