package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_Class {
	public static void main(String[] args) {
		//This SynchronousQueue is creates with nonfair access policy.
		//The above line means Each insert operation must wait for a corresponding remove operation by another thread and vice versa.
		//Capacity is one so here if another insert operation comes then that needs to be wait till the previous element got removed.
		//it can not store elements.
		BlockingQueue<String> sq = new SynchronousQueue<>();
		Thread producer = new Thread(()->{
			try {
				System.out.println("Producer is waiting for the transfer....");
				sq.put("Hello from producer!!");
				System.out.println("Producer has transfered the message....");
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Producer was interrupted!!");
			}
		});
		
		Thread consumer = new Thread(()->{
			try {
				System.out.println("Consumer is waiting to receive....");
				String msg = sq.take();
				System.out.println("Consumer received message : "+msg);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Consumer was interrupted!!");
			}
		});
		
		producer.start();
		consumer.start();
	}
}
