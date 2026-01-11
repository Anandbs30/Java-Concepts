package V33_MultiThreadding.Synchronization.Locking.FairUnFairLocks;
/*
 * To maintain order of the threads here we have Fair, to active this one we have an method inside ReentrantLock here in this we have to pass the true or false.
 * Based on the thread request the thread will get chance to execute, So here we get an question like previously also all threads are executed what is the 
 * importance to use this, Assume that the you have 20 threads and some of the threads are not getting chance to execute in those cases this will ensure that to
 * execute all the threads.  
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
	
	private final Lock fairLock = new ReentrantLock(true);
	
	
	public void accessResources() {
		fairLock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+" acquired the lock!!");
			Thread.sleep(10000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}finally{
			System.out.println(Thread.currentThread().getName()+" released the lock!!");
			fairLock.unlock();
		}
	}
	
	public static void main(String[] args) {
		FairLockExample fle = new FairLockExample();
		Runnable ru = new Runnable() {
			
			@Override
			public void run() {
				fle.accessResources();
			}
		};
		
		Thread t1 = new Thread(ru, "One Thread");
		Thread t2 = new Thread(ru, "Two Thread");
		Thread t3 = new Thread(ru, "Three Thread");
		Thread t4 = new Thread(ru, "Four Thread");
		try {
			t1.start();
			Thread.sleep(100);
			t2.start();
			Thread.sleep(100);
			t3.start();
			Thread.sleep(100);
			t4.start();
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
		
	}
}
