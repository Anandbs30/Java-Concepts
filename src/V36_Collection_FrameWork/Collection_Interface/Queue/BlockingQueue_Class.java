package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//NOTE : ENQUEUE : INSERT AN ELEMENT AND DEQUEUE : REMOVE AN ELEMENT.
/*
 * Deque, PriorityQueue are not thread safe and now we are going to learn that BlockingQueue which provides thread safety.
 * 
 * Here in BlockingQueue is waits for two things 1) Queue to become non-Empaty and 2) Wait for the space.
 * 1) Queue to become non-Empaty : Here if you fetching something but that Queue is empty so here thread or queue wait for the something 
 * 								   fill into that to fetch the same. 
 * 2) Wait for the space : Here thread wait for the some space become in the Queue to insert elements into those empty space.
 * 
 * NOTE : This is very use full in the multi-threadded environment. Basically communication is happening here. This will simplify the concurrency.
 * Example for the understanding : Producer and Consumer.
 * 			- Producer don't produce anything till that queue becomes empty.
 * 			- Consumer will doesn't consume anything till something hold that queue.
 * 
 * 
 * What happens in the standard queue?
 * ANS : All methods or operations like add(), remove() etc are starts immediately.
 * 		empty queue --> remove(); (this will not wait here). This means in Standard queue is doesn't wait like here queue is empty and we are trying
 * 															 to remove something so here either will get an error or if you use poll then get null.
 * 		
 * 		full queue --> add(); (this will not wait here). This means here initially Queue is full after that also you want to add elements using add();
 * 														 So here we get an error as queue is full if you used offer();
 * 
 *  //BLOCKING QUEUE METHODS : 
 *  	put(); : if you trying to add elements here it Blocks if the queue is already full until space becomes available.
 *  	take(); : if you trying to fetch elements and queue is empty here it blocks if the queue is empty until an element becomes available to fetch.
 *  	offer(); : if you trying to add elements here it waits if the queue is already full until space becomes available. we can specify here waiting time.
 *  
 *  here put() and offer() methods are almost same bit difference will learn that as well.
 * 
 */


//Producer class
class Producer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	private int value = 0;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Producer produced : "+value);
				queue.put(value++);
				Thread.sleep(1000);
			} catch (Exception e) {
				Thread.currentThread().interrupted();
				System.out.println("Producer interrupted!!");
			}
		}
	}
}


//Consumer class
class Consumer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Integer value = queue.take();
				System.out.println("Consumer cosumed : "+value);
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.currentThread().interrupted();
				System.out.println("Consumer interrupted!!");
			}
		}
	}
}


public class BlockingQueue_Class {
	public static void main(String[] args) {
		//Here as we all know BlockingQueue is an interface and ArrayBlockingQueue is an implementation class of the BlockingQueue.

		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
		//What is ArrayBlockingQueue?
		//ANS : A bounded, blocking queue backed by an array.(Here the internal array size is fixed.) as above the array size is 5 that is fixed.
		//Here circular array is present. Low memory overhead. Single lock as Producer and consumer block each other. 
		//Above line means uses an single lock for the both enqueue(Insert (add) an element into the queue, Usually at the rear (tail).) 
		//and dequeue operations(Remove an element from the queue, Usually from the front (head).).
		//Problem when more threads comes.
		Thread producerThread = new Thread(new Producer(bq));
		Thread consumerThread = new Thread(new Consumer(bq));
		producerThread.start();
		consumerThread.start();
		
	}
}


