package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class LinkedBlockingQueue_Class {
	public static void main(String[] args) {
		//Here below we have provided an capacity as 5 that is fixed. 
		//if you don't provide any capacity them this will use the Integer.MAX_VALUE as capacity
		
		BlockingQueue<Integer> lbq = new LinkedBlockingQueue<>(5);
		
		
		//The LinkedBlockingQueue is optionally bounded. if you don't bound then that is known as Unbounded but that is an risk as we might be get
		//an error or issue as OutOfMemory.
		//Uses two separate locks for the enqueue(insert element) and dequeue(remove element).
		//Higher concurrency between producer and consumer here waiting will become less as compared to the ArrayBlockingQueue.
		
		//This is also an unbounded but here in this if you not provide capacity then this will default 11 as capacity is used.
		//That orders its elements according to their natural ordering.
		//This uses the Binary heap as Array and it can grow dynamically.
		//Head is based on their natural ordering or a provided comparator like priority queue.
		//put() method never block here as we know the PriorityBlockingQueue is Unbounded
		BlockingQueue<String>  pbq = new PriorityBlockingQueue<>();
		pbq.add("apple");
		pbq.add("banana");
		pbq.add("chery");
		System.out.println(pbq);
		//How do we pass the comparator here
		BlockingQueue<Integer>  pbq1 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
		
		
	}
}
