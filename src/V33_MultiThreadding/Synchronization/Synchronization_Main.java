package V33_MultiThreadding.Synchronization;
/*
 Synchronization keyword Disadvantages : 
 	1). Fairness
 	2). Blocking
 	3). Interruptability
 	4). Read/write locking : here Synchronization doesn't know which one is read and write.
 */
public class Synchronization_Main {
	public static void main(String[] args) {
		
		Counter c = new Counter();
		MyThread mt = new MyThread(c);
		MyThread mt1 = new MyThread(c);
		mt.start();
		mt1.start();
		
		
		try {
			
			//Here we are using join to get execute both and then we are below printing the counter value 
			mt.join();
			mt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//So here below statement we have to get final count as 2000 as we started 2 threads but we get less than the 2000
		//Because here threads are running simultaneously so if counter field value is 10 then both read those as 10 and start execution.
		//This is the reason behind this. So to avoid this and get expected result we have an keyword called synchronized which will help 
		//us to complete one thread execution then only second thread starts.
		//And also one more reason as we are sharing the one object with the multiple threads.
		System.out.println("The final count of the counter is : "+c.getCounter());
		
		/*
		 We can make method as synchronize or we can make a particular code block as synchronized as defined in the Counter class. 
		 */
	}
}
