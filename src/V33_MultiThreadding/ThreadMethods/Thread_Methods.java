package V33_MultiThreadding.ThreadMethods;

public class Thread_Methods extends Thread{
	
	@Override
	public void run() {//2nd method Once JVM allocate then this will start executing  
		System.out.println("Thread here we can write the logic");
		
//		for(int i =1; i<=10;i++) {
//			try {
//				Thread.sleep(5000);//3rd This will sleeps thread for a given time then after that execute
////				System.out.println(i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
		try {
			Thread.sleep(5000);//3rd This will sleeps thread for a given time then after that execute
//			System.out.println(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread_Methods tm = new Thread_Methods();
		tm.start();//1st method where we can start the thread after this JVM will allocate your run 
		tm.join();//4th this method will wait for the complete execution of the Thread tm and then proceed for the Execution of the main thread.
		System.out.println("tm Thread is completly executed!!");
	}
}
