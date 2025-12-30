package V19_Encapsulation;

public class BankAccount {
	
	private long accountNumber;
	
	private double balance;
	
	public void Deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("The amount has been deposited : "+amount);
		}else {
			System.out.println("Invalid Deposit request!!");
		}
	}
	
	public void Withdraw(double amount) {
		if(amount<balance && balance != 0) {
			balance -= amount;
			System.out.println("The amount withdraw from your account : "+amount);
		}else {
			System.out.println("Insufficient balance!!");
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
