package V33_MultiThreadding.Synchronization;

public class Counter {
	private int counter = 0;
	
	/*
	public synchronized void  increment() {
		counter++;
	}
	*/
	
//	OR
	
	public void increment() {
		/*Here below this state that the current thread. OR we can say that we are talking about the 1 instance.
		Through this we get result as 2000
		One more thing that is wherever threads are using shared objects then we are specifying the some of the code block as synchronized
		Then that particular code or area or method called as **CRITICAL** area or **CRITICAL** section.
		Wherever we are not using the synchronized keyword and we are getting appropriate results then that methods or code block known as
		**RACE** condition.  
		WHENEVER WE ARE USING SYNCHRONIZED KEY WORD AND THEN ONE THREAD PERFORM THAT SCENARIO IS KNOWN AS MUTUAL EXCLUSION
		So MUTUAL EXCLUSIO that ensures that the multiple threads are not access simultaneously the critical code or section.
		Exclusion means this will stops the thread where another thread is executing.
		Synchronized basically apply the lock on the method or on critical code block to stop that by any other thread until that completes there work.
		 */
		
		synchronized(this) {
			counter++;
		}
	}
	public int getCounter() {
		return counter;
	}
}
