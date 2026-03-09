package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * ConcurrentLinkedQueue is an implementation of the Queue interface that supports locks-free, thread-safe operations.
 * 
 * Here in this we can perform the put(); put(); methods and put(); take(); methods simultaneously. 
 * Due to this here high throughput is happens.
 */
public class ConcurrentLinkedQueue_Class {
	private static BlockingQueue<String> taskQueue = new LinkedBlockingDeque<>();
	
	//As we are using the ConcurrentLinkedDeque so it internally uses the compare and swap method.
	private static ConcurrentLinkedDeque<String> taskQueue1 = new ConcurrentLinkedDeque<>();
	
	public static void main(String[] args) {
		/*
		 * Thread producer = new Thread(()->{ while(true) { try {
		 * taskQueue.put("Task "+System.currentTimeMillis());//Adds task (will use locks
		 * internally) } catch (InterruptedException e) { e.printStackTrace(); } } });
		 * 
		 * Thread consumer = new Thread(()->{ while(true) { try { String task =
		 * taskQueue.take();//Takes task (will use locks internally)
		 * System.out.println("Processing : "+task); } catch (InterruptedException e) {
		 * e.printStackTrace(); } } });
		 * 
		 * producer.start(); consumer.start();
		 */
		
		Thread producer1 = new Thread(()->{
			while(true) {
				try {
					taskQueue1.add("Task "+System.currentTimeMillis());//Adds task (will use locks internally)
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer1 = new Thread(()->{
			while(true) {
				try {
					String task = taskQueue1.poll();//Takes task (will use locks internally)
					System.out.println("Processing : "+task);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		producer1.start();
		consumer1.start();
	}
}
