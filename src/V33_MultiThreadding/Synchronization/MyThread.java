package V33_MultiThreadding.Synchronization;

public class MyThread extends Thread{
	
	private Counter counter;
	
	public MyThread(Counter c) {
		this.counter=c;
	}

	@Override
	public void run() {
		for(int i = 0; i<1000;i++) {
			counter.increment();
		}
	}

	
}
