package V33_MultiThreadding.Completable_Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * The Completable Future is introduced in java 8 to handle Asynchronous programs
 * Note : .join() and .get() both methods are same these are waits the main method to complete the other threads then they will return result
 * or result with exception but basic difference is if we use .join() method then no need to handle exception initially, but if we use the .get()
 * method then we have to manage the exception by using try catch or Throws in method signature.
 */
public class Completable_Future {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//By default below thread is Demon Thread so main thread doesn't wait for the completion of these threads and main thread execute.
		CompletableFuture<String>  completableFuture = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(2000);
				System.out.println("Worker Thread");
			} catch (Exception e) {
				
			}
			return "Ok!";
		});
		System.out.println("Main Thread is not wait for the Completion of demon thread..");
		
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(5000);
				System.out.println("The Worker Thread or Demon Thread.");
			} catch (Exception e) {
				
			}
			return "Everything is OK!";
		});
		String result = null;
		try {
			result = supplyAsync.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println("Here we are trying to wait the Main thread to complete the execution of the Deamon thread!");
		//NOTE THAT EXPLORE THE COMPLETABLE FUTURE METHODS.
		//By Default, CompletableFuture tasks often run on daemon threads due to the use of Fork.JoinPool.commonPool
		//We can control the thread type by providing the custom executor service.
		//The CompletableFuture task itself doesn't dictate whether it's daemon or user thread.
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(5000);
				System.out.println("Worker Thread!!");
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return "OK";
		}, executor).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"Time Out Exception Occured!!");
		System.out.println(f1.get());
	}
}
