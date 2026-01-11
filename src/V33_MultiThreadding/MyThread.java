package V33_MultiThreadding;

public class MyThread extends Thread{
	
	//Here we can't able to add the Throws Exception on the method signature as we are overriding the method here if we add the will get error.
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());//4. This will print Thread-0
		System.out.println("RUNNING");//5. This will print RUNNING
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//7. The below will print main Thread and its state is : RUNNABLE
		System.out.println(Thread.currentThread().getName()+" Thread and its state is : "+Thread.currentThread().getState());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		System.out.println(mt.currentThread().getName());//1. This will print main
		System.out.println(mt.getState());//2. This will print NEW
		mt.start();
		System.out.println(mt.getState());//3. This will print RUNNABLE
		Thread.sleep(1000);
		//6. The below will print main Thread and its state is : TIMED_WAITING
		System.out.println(mt.currentThread().getName()+" Thread and its state is : "+mt.getState());
		//If we write join method then this will wait for the thread termination and then this will terminate the thread.
		mt.join();
//		System.out.println(mt.currentThread().getName()+" Thread and its state is : "+mt.getState());
		//8. The below main Thread and its state is : TERMINATED
		System.out.println(Thread.currentThread().getName()+" Thread and its state is : "+mt.getState());
	}
}
