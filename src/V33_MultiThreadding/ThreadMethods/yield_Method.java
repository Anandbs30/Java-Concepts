package V33_MultiThreadding.ThreadMethods;

public class yield_Method extends Thread{

	
	public yield_Method(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" is running");
			//This yield method will give the chance to the another method for the run or execution
			//Means the threads are execute Randomly
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		yield_Method ym1 = new yield_Method("Thread 1");//Here we are creating threads to perform an task so those are known as userThreads.
		yield_Method ym2 = new yield_Method("Thread 2");
		ym1.start();
		ym2.start();
	}
	
	
}
