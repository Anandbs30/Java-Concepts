package V33_MultiThreadding.Thread_ExecutorIssueAndSolution;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Issue {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*To get the active threads into the pool : 
		 * You cannot directly ask ExecutorService how many threads are created
			because ExecutorService is an interface.
		 * You CAN do it by casting to ThreadPoolExecutor, because
			newFixedThreadPool() internally uses ThreadPoolExecutor.
		ThreadPoolExecutor fixedThread = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		
		Future<String> submit1 = fixedThread.submit(new DependentService());
		Future<String> submit2 = fixedThread.submit(new DependentService());
		Future<String> submit3 = fixedThread.submit(new DependentService());
		System.out.println("Active Threads in the pool are : "+fixedThread.getActiveCount());
		submit1.get();
		submit2.get();
		submit3.get();
		System.out.println("All the dependency Services finished, Main service starting!!");
		fixedThread.shutdown();
		System.out.println("Is thread is shutdown : "+fixedThread.isShutdown());
		System.out.println("Is thread is terminated : "+fixedThread.isTerminated());
		*/
		
		ExecutorService fixedThreads = Executors.newFixedThreadPool(3);
		Future<String> submit1 = fixedThreads.submit(new DependentService());
		Future<String> submit2 = fixedThreads.submit(new DependentService());
		Future<String> submit3 = fixedThreads.submit(new DependentService());
		
		//Here issue is below to wait the main thread to complete the other threads tasks to do this we have written here as .get(); to all 
		//Tasks manually To resolve this we can use the CountDownLatch method
		submit1.get();
		submit2.get();
		submit3.get();
		System.out.println("All the dependency Services finished, Main service starting!!");
		fixedThreads.shutdown();
	}
}

//writing an class where we are doing something and returning an string.

class DependentService implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" service is started");
		Thread.sleep(2000);
		return "Ok";
	}
	
}
