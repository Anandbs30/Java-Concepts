package V33_MultiThreadding.Thread_Comunication;
/*
 * In a multithreaded environment, threads often need to communicate and coordinate with each other to accomplish a task.
 * Without proper communication mechanisms, threads might end up in inefficient busy-waiting states, leading to wastage of CPU 
 * resources and potential deadlocks.
 * 
 *  For Inter Thread communication we have to use below methods. and we have to use below methods inside the synchronized method or synchronized block 
 *  	- notify() : This is wakes up of the single thread that is waiting.
 *  	- notifyall() : This is wakes up of all threads which are into the waiting state.
 *  	- wait() : this is tells to the current thread to release lock and for until any other thread run the notify() or notifyall() method 
 *  	
 */


class Shared_Resource{
	private int data;
	private boolean hasData;
	//In method signature added synchronized bcz as we know wait and notify are not synchronized
	public synchronized void produce(int value) {
		while(hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		data = value;
		hasData = true;
		System.out.println("Producer : "+value);
		notify();//If more than one threads are waiting here then use notifyall() method.
	}
	public synchronized int consume() {
		while(!hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		hasData = false;
		System.out.println("Consumed : "+data);
		notify();
		return data;
	}
}

class Producer implements Runnable{
	
	private Shared_Resource resources;

	public Producer(Shared_Resource resources) {
		this.resources = resources;
	}
	
	@Override
	public void run() {
			for(int i = 0;i<10;i++) {
				resources.produce(i);
			}
		
	}
	
}

class Consumer implements Runnable{
	
	private Shared_Resource resource;
	
	public Consumer(Shared_Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			int consume = resource.consume();
		}
		
	}
	
}

public class Thread_Comunication {
	public static void main(String[] args) {
		Shared_Resource sr = new Shared_Resource();
		Thread prodThread = new Thread(new Producer(sr));
		Thread conThread = new Thread(new Consumer(sr));
		System.out.println("Thread communications");
		prodThread.start();
		conThread.start();
	}
}
