package V33_MultiThreadding;

public class Thread_Class extends Thread{

	//Here below run method is used to run the thread.
	@Override
	public void run() {
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
