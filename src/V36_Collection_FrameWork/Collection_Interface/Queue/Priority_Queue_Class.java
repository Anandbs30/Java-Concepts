package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_Class {
	public static void main(String[] args) {
		//Part of the Queue interface
		//Orders elements based on their natural ordering (for primitive lowest first)(ex : integer 1, 2, 3, 4 lowest is 1)(ex : char a, b, c lowest a)
		//custom comparator for customized ordering.
		//In Queue which element is present at the top or head position which have the high priority.
		//This is not allowed the null values.
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(57);
		pq.add(3);
		pq.add(48);
		pq.add(30);
		pq.add(12);
		System.out.println(pq);//[3, 12, 48, 57, 30]
		//Fetching the high priority / first index value using the .peek(); method.
		System.out.println("High priority element is : "+pq.peek());//output : 3
		//if you want to know next value then you have to remove first element which is 3
		System.out.println("Removing High priority element to know next priority value : "+pq.poll());
		
		System.out.println("High priority element is : "+pq.peek());
		
		//using loop printing the priority wise elements.
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		//INTERNAL WORKING OF PRIORITYQUEUE
		//PriorityQueue is implemented as a min-heap by default ()for natural ordering.
		//What is mean-heap?
		//ANS : Min-Heap is an binary tree where its child nodes value either equal to parent node or greater than parent.
		//		Here time complexity for the insertion and deletion is O(log n) and to fetch peek or head value is O(1).
		
		//Custom comparator for customized ordering.
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());//Now the head is higher value : 57
		pq1.add(57);
		pq1.add(3);
		pq1.add(48);
		pq1.add(30);
		pq1.add(12);
		
		System.out.println("High priority element is : "+pq1.peek());//57
		
		//we can write it as well without using the Comparator
		PriorityQueue<Integer> pq2 = new PriorityQueue<>((x, y)->y-x);//descending
		pq2.add(57);
		pq2.add(3);
		pq2.add(48);
		pq2.add(30);
		pq2.add(12);
//		System.out.println(pq2);
		System.out.println(pq2.peek());
		System.out.println(pq2.poll());
		System.err.println("Now the peek value is : "+pq2.peek());
	}
}
