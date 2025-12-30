package V19_Encapsulation;

import java.util.Scanner;

public class Main_BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		System.out.println(ba.getBalance());
		System.out.println("Enter amount to Deposit into the account : ");
		double amt = sc.nextDouble();
		ba.Deposit(amt);
		
		System.out.println("Enter amount to Withdraw from the account : ");
		double wit = sc.nextDouble();
		ba.Withdraw(wit);
		
		System.out.println("The current balance is : "+ba.getBalance());
		
	}
}
