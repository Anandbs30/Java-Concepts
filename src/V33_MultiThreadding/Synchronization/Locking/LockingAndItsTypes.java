package V33_MultiThreadding.Synchronization.Locking;
/*
 Why we use the Locking?
 Ans : Whenever we use the synchronized keyword then this will allow only one thread but we don't know which one and how much time to overcome this issue we 
 	   use the Locking here we can define.
Locking : where synchronized keyword is applied where that means particularly it allows only one thread at a time and until thats execution is not completes
it will not allow any other thread into that block or method this process where it not allow another thread to interact that is know as Locking 
	** These are two types : 
		1). Intrinsic : This is present into the every object built in but we can't see. Whenever we use the Synchronized keyword then automatically we use
						them.
		2). Explicit(Manual Locks) : These are more advanced locks we can control by using the locks class from java.util.concurrent.locks
									 we can explicitly say or set that the when it needs to be locked and unlocked, giving us more control over how and 
									 when peoples are write in the notebook.
					Note : Whenever we use the Explicit lock then we don't need to add synchronized keyword.
*/
public class LockingAndItsTypes {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Runnable ra = new Runnable() {
				
				@Override
				public void run() {
					ba.withdraw(30);
				}
			};
			Thread a = new Thread(ra, "Anand");
			Thread b = new Thread(ra, "Kavu");
			a.start();
			b.start();
//			Thread c = new Thread(ra, "Mangal");
//			Thread d = new Thread(ra, "Basagouda");
//			c.start();
//			d.start();
	}

}
