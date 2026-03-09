package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * Queue : Is used to store the data this datastructure that works on the FIFO (first-in-first-out) principle.
 * 
 * Main characteristics are : Elements are added at the end and removed from the front. 
 * Stack : follows the LIFO(last in first out) principle.
 */
public class Queue_Class {
	public static void main(String[] args) {
		//List is basically act like Stack. as stack follows the LIFO
		
		LinkedList<Integer> list = new LinkedList<>();
		//here we are adding the elements at the first or head so this process is known as the Push and Pop
		list.addFirst(30);
		list.addFirst(66);
		list.addFirst(48);
		list.addFirst(39);
		System.out.println("Original LinkedList elements are : "+list);//[39, 48, 66, 30]
		
		list.removeFirst();
		
		System.out.println("After removing the First element from the LinkedList elements are : "+list);
		
		//We can make LinkeList as Queue as well 
		LinkedList<Integer> list1 = new LinkedList<>();
		
		//here below we are adding the elements at the end so this process is known as enqueue.
		list1.addLast(30);
		list1.addLast(66);
		list1.addLast(48);
		list1.addLast(39);
		System.out.println("Original LinkedList elements are : "+list1);//[39, 48, 66, 30]
		
		list1.removeFirst();//removing the first element this process is known as the Dequeue.
		
		System.out.println("After removing the First element from the LinkedList elements are : "+list1);
		
		//In the above LinkedList which is performing the Stack and queue as well then why we need Queue interface?
		//As we know LinkedList have the methods like add(), addFirst(), addLast() this make complexity so Java introduced Queue.
		//Queue is an interface which extends the Collection interface. That have the add(), remove so here
		//If we perform add() then here elements are added from end(last index).
		//If we perform remove() then here elements are removed from front(start index).
		//Note LinkedList implements the Deque interface and Deque again extends the Queue interface.
		//Enqueue which is the process performed using add() or offer() method which add the elements at first index.
		//Dequeue which is the process performed using remove() or poll() method which remove the elements from the first index.
		//Peek() or element() method will fetch the first index element.
		//As Queue is an interface we can't do instantiate of this so we need to know its implementation classes.
		//Implementation classes : LinkedList, PriorityQueue etc
		
		//we can write as Queue<Integer> a = new LinkedList<>(); but we can't able to use the addFirst(), addLast() methods as they are LinkedList methods.
		
		
		//Dequeue which is the process performed using remove() or poll() method which remove the elements from the first index.
		//Differences between these
		Queue<Object> q = new LinkedList<>();
		System.out.println("The size of the LinkedList is : "+q.size());//output = 0;
		
		
		//now will test the methods 
		//remove(); this will throw if list is empty .
//		System.out.println(q.remove());//through this we get an Exception as NoSuchElementException.
		
		//poll(); this will return null if list is empty otherwise return the value.
		System.out.println(q.poll());
		
		//Peek() or element() method will fetch the first index element.
		System.out.println(q.peek());
//		System.out.println(q.element());//Throws exception.
		
		//This is have only capacity as 2 if if you want to add 3 element using add(); method then you will get error as capacity, 
		//but if you use the offer(); method to add then this will check the condition of the capacity if capacity is there then it return true and
		//element is inserted otherwise this will return false so element is not insert into queue.
		Queue<Object> q1 = new ArrayBlockingQueue<>(2);
		//Enqueue which is the process performed using add() or offer() method which add the elements at first index.
		q1.add(3);
		q1.add(2);
//		q1.add(7);//throws exception here about capacity. java.lang.IllegalStateException: Queue full
		q1.offer(7);
		//instead of the .add() use the .offer();
		
		
		System.out.println("The size of the LinkedList is : "+q1.size());
	}
}
