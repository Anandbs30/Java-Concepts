package V29_Exceptions.Exception_Handling.Custome_Exception_Class;

public class Bank_Account {
	private double balance;
	
	public Bank_Account(double amount) {
		this.balance = amount;
	}
	
	public void withdraw(double amount) throws Exception {
		if(amount > balance) {
			throw new Custom_Insufficient_Exception();
		}else {
			balance -= amount;
		}
	}
}
