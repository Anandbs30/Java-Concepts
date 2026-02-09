package V33_MultiThreadding.Synchronization.Locking.ReadWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocks {
	private int count = 0;
	
	/*Here below ReadWriteLock is an interface and ReentrantReadWriteLock is an implemented class of the interface.
	 Here ReadWriteLock is allows to multiple threads to read resources concurrently as long as no thread writing to it.
	 */
	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	private final Lock readLock = lock.readLock();
	private final Lock writeLock = lock.writeLock();
	
	public void increment() {
		writeLock.lock();
		try {
			count++;
		}finally {
			writeLock.unlock();
		}
	}
	
	public int getCount() {
		readLock.lock();
		try {
			return count;
		}finally {
			readLock.unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReadWriteLocks rwl = new ReadWriteLocks();
		Runnable readTask = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" read : "+rwl.getCount());
				}
			}
		};
		
		Runnable writeTask = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10;i++) {
					rwl.increment();
					System.out.println(Thread.currentThread().getName()+" Incremented!!");
				}
			}
		};
		
		Thread writeThread = new Thread(writeTask, "writeThread");
		Thread readThread1 = new Thread(readTask, "readThread1");
		Thread readThread2 = new Thread(readTask, "readThread2");
		
		writeThread.start();
		readThread1.start();
		readThread2.start();
		
		//Here join means the main thread will wait to finish all the thread or execution of all the threads.
		writeThread.join();
		readThread1.join();
		readThread2.join();
		
		System.out.println("The final count : "+rwl.getCount());
	}
	
}
