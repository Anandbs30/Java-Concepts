package V33_MultiThreadding.Synchronization.Locking.ExplicitLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
 DeadLock : 1st thread is depending on the a thread and 2nd thread is also depending on the 1st thread.
 if we are using ReentrantLock class then internally its maintain the count of how much time the lock is acquired.
 */
public class ReentrantExample {
	private final Lock lock = new ReentrantLock();
	
	public void outerMethod() {
		
		lock.lock();//This will work be like the synchronized keyword once a thread is using then until that get finished it will waits the other threads.
		//But if we settled in the main method as interrupt time then here we have to use the lock.lockInterruptibly(); then this will allow to interrupt.
		try {
			System.out.println("Outer method!!");
			innerMethod();
		} finally {
			lock.unlock();
		}
	}

	private void innerMethod() {
		
		lock.lock();
		try {
			System.out.println("Inner method!!");
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ReentrantExample re = new ReentrantExample();
		re.outerMethod();
	}
}
