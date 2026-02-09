package V33_MultiThreadding.Thread_Pool_Executors;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/*
 Difference between Callable and Runnable
 If you want to return anything then use the callable method.
 If you don't want to return anything then use Runnable as its have only one method and it doesn't return anything.
 Callable have call method and call method consist throws Exception in method signature, So don't need to use try catch to handle exception.
 Runnable have run method and run method doesn't consists any exception in the method signature as its an override method, here we need to 
 use try catch block into the code block to handle the exception
  
 */
public class ExecutorService_Methods{
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService single = Executors.newSingleThreadExecutor();
		/*.submit() method works like start where this will create the thread and start that concurrently.
		 	Hands the task to ExecutorService
			Executor picks a worker thread
			Task runs asynchronously
			Calls run() or call() internally
		 */
		Future<Integer> submit = single.submit(()->42);
		if(submit.get()==42) {
			System.out.println("The return integer is equals given : "+submit.get());
		}else {
			System.out.println("Not returned!!");
		}
		
		single.shutdown();
		
		System.out.println(single.isShutdown());//This will return true when thread is shout down otherwise true.
		single.awaitTermination(2, TimeUnit.SECONDS);
		//this will print current status like if thread s active then false if deactivate then true
		//and this is wait after the thread shout down as well so in those cases this will return false
		//if you want to check then just comment the single.awaitTermination(); code 
		System.out.println(single.isTerminated());
		
		
		ExecutorService single1 = Executors.newSingleThreadExecutor();
		
		//If we use the Submit() Runnable is calling then we can't do that we have to write sop statement as its consist an abstract method.
		//Here below Submit() callable is calling so we can pass here data directly as "Hello" in below,, as it can return any datatype
		Future<?> submit2 = single1.submit(()->"Hello");
		//Here isDone method is not wait for the task finished or not this will return true false instuntly
		if(submit2.isDone()) {
			System.out.println("Task is completed!!");
			}
		//The get method is waits for the completion
		System.out.println(submit2.get());
		
		
		
		ExecutorService single2 = Executors.newSingleThreadExecutor();
		
		//Basically here below .submit() method have Runnable interface and one return type value. sop statement refers to the Runnable and Success refers to the return value 
		Future<String> submit3 = single2.submit(()->System.out.println("Hello"), "Success");
		System.out.println(submit3.get());
		
		
		
		//invokeAll(); this will accept only list example
		ExecutorService fixed = Executors.newFixedThreadPool(2);
		Callable<Integer> c1 = ()->{
			System.out.println("Task 1");
			return 1;
		};
		Callable<Integer> c2 = ()->{
			System.out.println("Task 2");
			return 2;
		};
		Callable<Integer> c3 = ()->{
			System.out.println("Task 3");
			return 3;
		};
		
		List<Callable<Integer>> l = Arrays.asList(c1, c2, c3);
		
		//firstly this will start all threads and also return the future result what are the values.
		//And also this will block main thread. Until the all the task complete the main thread will wait.  
		List<Future<Integer>> invokeAll = fixed.invokeAll(l);
		
		for(Future<Integer> f : invokeAll) {
			System.out.println(f.get());
		}
		
		fixed.shutdown();
		System.out.println("Thread is shoutdown? : "+fixed.isShutdown());
		fixed.awaitTermination(2, TimeUnit.SECONDS);
		System.out.println("The current status of the thread is : "+fixed.isTerminated());
		
		//Adding two integers and returning the result.
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		Future<Integer> submit4 = newFixedThreadPool.submit(()->1+2);
		//Here below while calling the get method main thread of the class will be called.
		Integer integer = submit4.get();
		System.out.println("The sum of the two given integer is : "+integer);
		
		
		System.out.println("\nUsing invokeall method with the time\n");
		//Also we have another invokeAll() method that is take the list of the tasks and also time so until the given time those will
		//run once given time is completes then it will terminates automatically.
		
		ExecutorService fixed1 = Executors.newFixedThreadPool(2);
		Callable<Integer> c4 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 4");
			return 4;
		};
		Callable<Integer> c5 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 5");
			return 5;
		};
		Callable<Integer> c6 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 6");
			return 6;
		};
		
		List<Callable<Integer>> l1 = Arrays.asList(c4, c5, c6);
		
		//firstly this will start all threads and also return the future result what are the values.
		//And also this will block main thread. Until the all the task complete the main thread will wait.  
		List<Future<Integer>> invokeAll1=null;
		try {
			invokeAll1 = fixed1.invokeAll(l1, 2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			
		}
		for(Future<Integer> f : invokeAll1) {
			try {
				System.out.println(f.get());
			} catch (CancellationException e0) {
				
			}catch (InterruptedException e1) {
				
			} catch (ExecutionException e2) {
				
			}
		}
		fixed1.shutdown();
		System.out.println("Thread is shoutdown? : "+fixed1.isShutdown());
		fixed1.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("The current status of the thread is : "+fixed1.isTerminated());
		
		System.out.println("\nUsing invokeAny method.");
		
		ExecutorService fixed2 = Executors.newFixedThreadPool(2);
		
		Callable<Integer> task7 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 7");
			return 7;
		};
		Callable<Integer> task8 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 8");
			return 8;
		};
		Callable<Integer> task9 = ()->{
			Thread.sleep(1000);
			System.out.println("Task 9");
			return 9;
		};
		
		List<Callable<Integer>> asList = Arrays.asList(task7, task8, task9);
		/*NOTE : In this the threads will run as we here using 2 threads and all the threads will be run but 
		 * result is only one as its return only one value which is completed first.
		 * 
		 * Here below we are using the invoke Any method of the executors which will execute and return only succeeded thread result,
		  And which are not completed then those are known as the cancelled here. 
		  Here in this threads are running two but result we are getting that is only one
		*/
		try {
			Integer invokeAny = fixed2.invokeAny(asList);
			System.out.println("The result is : "+invokeAny);
		}  catch (CancellationException e0) {
			
		}catch (InterruptedException e1) {
			
		} catch (ExecutionException e2) {
			
		}
		boolean cancelled = submit.isCancelled();
		System.out.println("Submit method status : "+cancelled);
	}
}
