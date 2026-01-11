package V33_MultiThreadding;

public class Runnable_Interface implements Runnable{

	@Override
	public void run() {
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
