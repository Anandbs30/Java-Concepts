package V33_MultiThreadding.Thread_Pool_Executors;
/*
 Collection of pre-initialized threads and they are ready to perform task are known as Thread Pool.
 Q). Why we need Thread Pool?
 	Ans : Resource management : Creating and destroying the threads to perform a task that is very expensive.
 		  Response time : Here thread is already created we have to just use that, So here we are saving new thread creation time.
 		  Control over thread count : here we have an control on creation of thread.
 	
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
public class Thread_Pool {

}
