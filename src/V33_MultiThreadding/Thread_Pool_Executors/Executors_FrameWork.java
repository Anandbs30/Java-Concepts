package V33_MultiThreadding.Thread_Pool_Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 Creation of the thread pool is called as : Executors Framework introduced in java 5 
 which is present under java.util.concurrent package
 Q) What is the help of the Executors Framework in java? 
 	Ans : Simplify the development of concurrent application by abstracting away many of the complexities involved in creating
 	 	  and managing the threads. 
 	NOTE : This is helps us to avoid manual creation of the thread and managing it.
 	
 Q). What are the issues or difficulties are in manual creation of the Thread?
	Ans : Resource management
		  Scalability
		  Thread reuse
		  error handling
		  
		  
Executor framework consist mainly three core interfaces
	1). Executor
	2). ExecutorService
	3). ScheduledExecutorService
 		  
 */

	
public class Executors_FrameWork {
//Example for synchronous
	
	
	public static int factorial(int a) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		int fact = 1;
		for(int i = 1;i<=a;i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<10;i++) {
//			System.out.println("Factorial of the "+i+" is : "+factorial(i));
		}
		System.out.println("Total time taken : "+(System.currentTimeMillis()-startTime));
		
		
		//Below we are using multithreadding concept but here this will firstly print the time as main thread is not waits for the other threads.
//		System.out.println("Using MultiThreadding\n");
//		long stT = System.currentTimeMillis(); 
//		for(int j = 0;j<10;j++) {
//			int finalJ = j;
//			Thread t = new Thread(()->{
//				long rest = factorial(finalJ);
//				System.out.println("Factorial of the "+finalJ+" is : "+rest);
//			});
//			t.start();
//		}
//		System.out.println("Total time taken : "+(System.currentTimeMillis()-stT)+"\n");//Here this statement prints first.
		
		//Creating multiple threads and starting them also joining them to wait main thread to complete all of the thread tasks.
		System.out.println("Using multi threadding and also printing exact time : ");
		long stTime = System.currentTimeMillis();
		//Here below we are creating the manual 9 threads and they are not in reuse. 
		Thread t1[] = new Thread[9];
		for(int i = 1;i<10;i++) {
			int fi = i;
			t1[i-1] = new Thread(()->{
				long r = factorial(fi);
				System.out.println("Factorial of the "+fi+" is : "+r);
			});
			t1[i-1].start();
		}
		//To make wait for the main thread to terminate further and print the time taken below we are joining the threads
		for(Thread thread : t1) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();	
			}
		}
		System.out.println("Total time taken : "+(System.currentTimeMillis()-stTime));
		
		//Using Executors to create and handle the Threads. In this we have to shoutDown the Executor.
		/*
		System.out.println("Using executers : ");
		long tim = System.currentTimeMillis();
		//Below created thread pool using executor class method and below how much number you provide that much threads are created and
		//They are running parallel, If you provide 3 then this will create 3 threads and reuse them for the execution.
		ExecutorService nft = Executors.newFixedThreadPool(3);
		for(int i = 0;i<10;i++) {
			int f1i = i;
			nft.submit(()->{
				long x = factorial(f1i);
				System.out.println("Factorial of the "+f1i+" is : "+x);
			});
		}
		
		//Here you are forcefully offing the Executor after this we can't perform anything using the executor.
		nft.shutdown();
		//here in this the below line execute of print first as here main thread is not waiting to perform all the thread execution.
		System.out.println("Executor Total time taken : "+(System.currentTimeMillis()-tim));*/
		//Not That the we can use the Executor interface here but that have only one method which is Execute but it doesn't have the shoutDown method
		
		System.out.println("using Executor and waiting the main thread to complete all other user thread execution complition : ");
		long stTim = System.currentTimeMillis();
		ExecutorService nFTP = Executors.newFixedThreadPool(3);
		for(int i = 0; i<10;i++) {
			int fdi = i;
			nFTP.submit(()->{
				int factorial = factorial(fdi);
				System.out.println("Factorial of the "+fdi+" is : "+factorial);
			}
			);
		}
		
		nFTP.shutdown();
		try {
			nFTP.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
		
		System.out.println("Executor Total time taken : "+(System.currentTimeMillis()-stTim));
	}
}
