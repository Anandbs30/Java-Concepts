package V34_Volatile_VS_Atomic.Atomicity;
/*
 * Atomicity is an class which have methods and those methods helps us to resolve the issue
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityClass {
	
	//we can use this to get exact result which is correct through this and other wise we can use the Synchronized keyword on the method.
	//Through this we can make the thread safety
	private AtomicInteger count = new AtomicInteger(0);
	
	public void increment() {
		//Here we can't able to do increment using ++ operator, Instead of this we have to use the .Increment() function or method
		count.incrementAndGet();
	}
	
	public int getCounter() {
		return count.get();
	}
	
	public static void main(String[] args) throws InterruptedException {
		AtomicityClass ac = new AtomicityClass();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i<1000;i++) {
				ac.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				ac.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The total count of the counter is : "+ac.getCounter());
	}
}
