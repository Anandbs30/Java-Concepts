package V33_MultiThreadding.Thread_Pool_Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Executor_Future_Method {
	public static void main(String[] args) {
		ExecutorService singleThread1 = Executors.newSingleThreadExecutor();
		Future<Integer> submit = singleThread1.submit(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Exceptio occured.......!!!");
			}
			return 30;
		});
//		Integer i = null;
//		try {
//			//The below will print false as the get method is not executed here.
//			System.out.println("Future is done or not : "+submit.isDone());
//			i = submit.get(2, TimeUnit.SECONDS);
//			//The below will print true as the get method is executed
//			System.out.println("Future is done or not : "+submit.isDone());
//			System.out.println(i);
//		} catch (TimeoutException | InterruptedException | ExecutionException e) {
//			System.out.println(e + " Exceptio occured.......!!!");
//		} 
		//For some reason if you want to cancel the execution of task then we can use the cancel method
		submit.cancel(true);
		System.out.println(submit.isCancelled());
		//The isDone method will return or print as true as its says that 
		//whenever the task is completed or terminated otherwise that will cancelled forcefully.
		System.out.println(submit.isDone());
		
		
		
		//But if we know without cancellations what is the status of the task or future?
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<Integer> submit2 = newSingleThreadExecutor.submit(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e+" Exceptio occured.......!!!");
			}
			System.out.println("Nothing King is back");
			return 21;
		});
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e+" Exceptio occured.......!!!");
		}
		//If we use below try catch block with get method then will get result and also statements are as false.
//		try {
//			System.out.println(submit2.get());
//		} catch (InterruptedException | ExecutionException e) {
//			System.out.println(e+" Exceptio occured.......!!!");
//		}
		
		submit2.cancel(false);
		System.out.println(submit2.isCancelled());
		System.out.println(submit2.isDone());
//		System.out.println(singleThread1.isShutdown());
		
	}
}
