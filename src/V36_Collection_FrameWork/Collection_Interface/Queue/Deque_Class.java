package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
 * double-ended queue
 * this allows insertion and removal of elements from both ends front/starting index and back/last/end index.
 * Versatile than the regular queues and stacks because they support all the operations of both queue and stacks.
 * 
 *  INSERTION METHODS : 
 *  
 *  addFirst(E e) : Inserts the specified element at the front. throws exception if empty
 *  addLast(E e) : Inserts the specified element at the end. throws exception if empty
 *  offerFirst(E e) : Inserts the specified element at the front if possible.
 *  offerLast(E e) : Inserts the specified element at the end if possible.
 *  
 *  
 *  REMOVAL METHODS : 
 *  
 *  removeFirst() : Retrieves and remove the first element. throws exception if empty
 *  removeLast() : Retrieves and remove the last element. throws exception if empty
 *  pollFirst() : Retrieves and remove the first element, or returns null if empty.
 *  pollLast() : Retrieves and remove the last element, or returns null if empty.
 *  
 *  
 *  EXAMINATION(FETCH) METHODS : 
 *  
 *  getFirst() : Retrieves, but does not remove, the first element. throws exception if empty
 *  getLast() : Retrieves, but does not remove, the last element. throws exception if empty
 *  peekFirst() : Retrieves, but does not remove, the first element, or returns null if empty.
 *  peekLast() : Retrieves, but does not remove, the last element, or returns null if empty.
 *  
 *  
 *  STACK METHODS : 
 *  
 *  push(E e) : Adds an element at the front (equivalent to addFirst(E e)). 
 *  pop() :  Removes and returns the first element (equivalent to removeFirst()).
 *  
 */
public class Deque_Class {
	public static void main(String[] args) {
		
		//Here will get options as ArrayDeque, LinkedList. 
		
		/*What is ArrayDeque : Constructs an empty array deque with an initial capacity, sufficient to hold 16 elements.
		 * 					   Resizable-array implementation of the Deque interface. no capacity restrictions.
		 * 					   Faster than stack when used as stack and faster than LinkedList when used as a Queue.
		 */
		
		/*
		 * So as we seen below that is both working same then why we required the ArrayDeque?
		 * ANS :  Faster iteration because continues memory allocation in array as we know, low memory, null values not allowed 
		 * no need to move the elements while deleting an element as it is an circular array. this is work as head and tail.
		 * 
		 * No need to shift the elements, just we have to shift the head and tail.
		 */
		
		System.out.println("Using ArrayDeque : ");
		Deque<Integer> d1 = new ArrayDeque<>();
		d1.addFirst(10);
		d1.addLast(20);
		
		d1.offerFirst(5);
		d1.offerLast(25);
		
		System.out.println(d1);//[5, 10, 20, 25]
		
		System.out.println("First element : "+d1.getFirst());//5
		System.out.println("Last element : "+d1.getLast());//25
		
		d1.removeFirst();//5 removes
		d1.pollLast();//25 removes
		
		System.out.println(d1);//[10, 20]
		
		//when we have to use the LinkedList while implementing the Deque?
		//ANS : when you have to implement the Deque and requirement as you also have to insert elements in between then this is faster than ArrayDeque.
		System.out.println("\nNow using LinkedList : ");
		Deque<Integer> d2 = new LinkedList<>();
		d2.addFirst(10);
		d2.addLast(20);
		
		d2.offerFirst(5);
		d2.offerLast(25);
		
		System.out.println(d2);//[5, 10, 20, 25]
		
		System.out.println("First element : "+d2.getFirst());//5
		System.out.println("Last element : "+d2.getLast());//25
		
		d2.removeFirst();//5 removes
		d2.pollLast();//25 removes
		
		System.out.println(d2);//[10, 20]
	}
}
