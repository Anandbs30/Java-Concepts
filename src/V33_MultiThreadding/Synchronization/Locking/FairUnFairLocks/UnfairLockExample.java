package V33_MultiThreadding.Synchronization.Locking.FairUnFairLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
 * Here below will provide the lock unordered way.
 */
public class UnfairLockExample {
	private final Lock UnfairLock = new ReentrantLock();
	
	public void accessResource() {
		UnfairLock.lock();
		
		try {
			System.out.println(Thread.currentThread().getName()+" accquired the lock!!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}finally {
			System.out.println(Thread.currentThread().getName()+" released the lock!!");
			UnfairLock.unlock();
		}
	}
	
	public static void main(String[] args) {
		UnfairLockExample ule = new UnfairLockExample();
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				ule.accessResource();
			}
		};
		
		Thread t1 = new Thread(runnable, "Thread 1");
		Thread t2 = new Thread(runnable, "Thread 2");
		Thread t3 = new Thread(runnable, "Thread 3");
		try {
			t1.start();
			Thread.sleep(50);
			t2.start();
			Thread.sleep(50);
			t3.start();
		} catch (Exception e) {
//			Thread.currentThread().interrupt();
		}
	} 
}
