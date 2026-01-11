package V33_MultiThreadding.ThreadMethods;

public class InteroptMethod extends Thread{
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
			System.out.println("The Thread is running......");
		} catch (InterruptedException e) {
			System.out.println("Thread is interuped : "+e);
		}
	}

	public static void main(String[] args) {
		InteroptMethod im = new InteroptMethod();
		im.start();
		System.out.println("The current state of the thread is : "+im.getState());
		im.interrupt();//This will interrupt with the thread and provide an exception 
		System.out.println("The current state of the thread is : "+im.getState());
	}
}
