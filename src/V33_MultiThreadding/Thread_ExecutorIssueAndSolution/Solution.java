package V33_MultiThreadding.Thread_ExecutorIssueAndSolution;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
	public static void main(String[] args) throws InterruptedException {
		int numberOfThreads = 3;
		ExecutorService fixed = Executors.newFixedThreadPool(numberOfThreads);
		/*
		 * CountDownLatch is not reusable once count is reaches the 0 then unable to reset its count.
		 * To use CountDownLatches reuse then we can use the Cyclic Barrier
		 */
		
		System.out.println("Using CountDownLatches!!");
		CountDownLatch latch = new CountDownLatch(numberOfThreads);
		
		fixed.submit(new DependencyService(latch));
		fixed.submit(new DependencyService(latch));
		fixed.submit(new DependencyService(latch));
		latch.await();
		System.out.println("All the dependency Services finished, Main service starting!!");
		fixed.shutdown();		
		/*
		 * Use when you need all the threads needs to be come and complete there work. Then finally main thread execute.
		 * Here we can reset the barrier 
		 */
		System.out.println("Using CyclicBarrier!!");
		int threadCount = 3;
		ExecutorService fixed2 = Executors.newFixedThreadPool(threadCount);
		CyclicBarrier cb = new CyclicBarrier(threadCount);
		fixed2.submit(new Cyclic_Barier(cb));
		fixed2.submit(new Cyclic_Barier(cb));
		fixed2.submit(new Cyclic_Barier(cb));
		
		System.out.println("CyclicBarier main");
		
		cb.reset();
		fixed2.shutdown();
	}
}
class DependencyService implements Callable<String>{

	
	private final CountDownLatch latch;
	
	public DependencyService(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public String call() throws Exception {
		try {
			System.out.println(Thread.currentThread().getName()+" service is started");
			Thread.sleep(2000);
			
		} finally {
			latch.countDown();
		}
		return "Ok";
	}
}	
class Cyclic_Barier implements Callable<String>{
	
	private final CyclicBarrier barier;
	
	public Cyclic_Barier(CyclicBarrier barier) {
		this.barier = barier;
	}

	@Override
	public String call() throws Exception {
			System.out.println(Thread.currentThread().getName()+" service is started");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" is waiting at the barrier!!");
			//Through the below code the worker thread wait here to come all the threads.
			barier.await();
		return "Ok";
	}
	
}