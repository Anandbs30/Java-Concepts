package V33_MultiThreadding.Cached_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cached_Thread_Pool {
	public static void main(String[] args) {
		
		/*
		 * Here The newCachedThreadPool will create the new threads according to the requirement of the threads. And also automatically
		 * terminate the thread which is not required or not in use.
		 * For termination of the thread here it will check the last 60 sec duration is it active or inactive if status is inactive then
		 * this will start the termination of that thread.
		 * Here no limit is given so based on the requirement it will create multiple threads which is quite dangerous.	
		 * This will dynamically adjust the pool size 
		 * When do we need to use this ?
		 * Ans : When we have load variable then we have to use this, And also those variable are need to be short leaved variable or thread.
		 */
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
	}
}
