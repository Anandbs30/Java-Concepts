package V33_MultiThreadding;
/*
 Runnable interface is an FUnctional interface where the interface consist only one abstract method.
 */
public class Runnable_Interface implements Runnable{

	@Override
	public void run() {
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
