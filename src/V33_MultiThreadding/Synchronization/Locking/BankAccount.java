package V33_MultiThreadding.Synchronization.Locking;

public class BankAccount {
	private int balance = 100;
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" attempting to withdraw amount : "+amount);
		if(amount<=balance) {
			System.out.println(Thread.currentThread().getName()+" proceeding to withdraw amount : "+amount);
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName()+" Completed the withdraw and remaining balance is : "+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+" INSUFFICIENT AMOUNT!! and CURRENT BALANCE IS : "+balance);
		}
	}
}
