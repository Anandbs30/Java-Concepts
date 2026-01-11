package V33_MultiThreadding;
//By default for each main class automatically an thread is created and that thread is called as Main thread.
public class MainClass {
	/*
	 To create our own thread we have to either extend the thread class or implement the runnable interface
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("The current thread name : "+Thread.currentThread().getName());
		System.out.println("The current thread Priority : "+Thread.currentThread().getPriority());
		
		
		//This is the object of the Thread class extending class object which can be directly perform
		Thread_Class w = new Thread_Class();//Here we are creating an new object of the thread so This is in the NEW state 
		//Here start method is used to start Thread.
		
		/*
		 This is RUNNABLE Here it is waiting for start once it gets the resources then this will start, 
		 also we can say that is this is waiting for the CPU, once CPU got free then this will run.
		 This is known as RUNNABLE STATE
		 Once This will start the THREAD state changes to the Runnable State 
		 */
		//		w.start(); 
		
		/*
		 This below is class object where class is implementing the Runnable interface and also in this we can't start the thread using 
		 class object we have to create the Thread object and then inside the constructor we have to pass the class object which is implementing
		 the Runnable interface.
		 */
		Runnable_Interface ri = new Runnable_Interface();
		Thread t = new Thread(ri);
		//Now here we can get an method as start thread.
		t.start();
		
		for( ; ;) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
		
		
	}
}
