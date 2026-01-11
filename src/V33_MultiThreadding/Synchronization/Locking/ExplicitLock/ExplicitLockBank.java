package V33_MultiThreadding.Synchronization.Locking.ExplicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitLockBank {
	private int balance = 100;
	/*
	 Here we are not using synchronized keyword, Instead of this we are applying the manual lock onto the thread.
	 By creating Lock interface object. So here how can we are creating an interface object so here we are directly passing the implemented class. as given below.
	 Lock l = new ReentrantLock(); Here ReentrantLock is an class which is implementing the Lock interface
	 In this we have methods 1). Lock : initially its free whenever a thread try to lock them self its become into lock state or if the lock is already 
	   									acquired by any other thread then new thread needs to be into the wait until 1st thread completes its execution.
	 2). tryLock :  Here we have again two type
	  				i) without any time line : Here this will directly try to lock the or try to acquire the lock if not free then this will return false
	  											directly, and here it doesn't wait.
	  				ii) with time line : Here we are passing the time line so initially its try to acquire lock if its already lock is acquired by any other
	  									 thread then this will wait for the given time line if after time as well the not unlocked then this will return false. 
	 3). Unlock : Once a Thread acquired Lock and its execution is completes then that will provide a key to unlock the key. 
	 */
	
	private final Lock lock = new ReentrantLock();
	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" is attempting to withdraw amount from the account of amount : "+amount);
		
		try {
			if(lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
				if(balance>=amount) {
					System.out.println(Thread.currentThread().getName()+" is proceeding to withdraw amount from the account of amount : "+amount);
					try {	
						Thread.sleep(3000);
						balance -= amount;
						System.out.println(Thread.currentThread().getName()+" is successfully withdrawed amount from the account of amount : "+amount);
					} catch (Exception e) {
						Thread.currentThread().interrupt();
					}finally{
						lock.unlock();
					}
					
				}else {
					System.out.println(Thread.currentThread().getName()+" INSUFFICIENT BALANCE current balace of you account is : "+balance);
				}
			}else {
				System.out.println(Thread.currentThread().getName()+" the lock is still in acquired state will try after some time!!");
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}

}
