package V36_Collection_FrameWork.Collection_Interface.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkeList_Test {
	public static void main(String[] args) {
		/*Java already created an LinkedList which manage the internal its work
		 * NOTE : LinkedList is implemented as a doubly linked list and Index starts from 0 ZERO
		 * 
		 * Why Java chose a doubly linked list
				Because LinkedList implements multiple interfaces:
				LinkedList<E>
				  implements List<E>, Deque<E>, Queue<E>
				A doubly linked list makes these efficient:
				Add/remove at both ends → O(1)
				Traverse forward and backward
				
		
			A LinkedList is a linear data structure where each element is a separate object called a node. Each node contains two parts : 
				1) Data : The value stored in the node.
				2) Pointers : Two pointers, one pointing to the next node (next) and the other pointing to the previous node (previous).
				
			Performance Considerations : 
			
			LinkedList has different performance characteristics compared to ArrayList : 
				Insertion and Deletions : LinkedList is better for frequent insertions and deletions in the middle of the list because it does not
										  required shifting the elements, as in the ArrayList.
				Random Access : LinkedList has slower random access(get(int index)) compared to ArrayList because it has to traverse the list from the
								beginning to reach the desired index.
				Memory Overhead : LinkedList requires more memory than ArrayList because each node in a linked list requires extra memory to store 
								  references to the next and previous nodes.
		 */
		//Note here below at the starting we can Use the List instead of the LisnkedList as we know List is the parent class of the LinkedList but we can't
		//able to use the LinkedList methods.
		LinkedList<Integer> li = new LinkedList<>();
		li.add(3);
		li.add(12);
		li.add(21);
		li.add(30);
		System.out.println(li);
		//to get method here time complexity is O(N) as we know ArrayList time complexity is O(1) is faster than this.
		//Reason here we have to apply loop to get and also need to provide an if condition.
		Integer firstIndex = li.get(1);
		System.out.println("Getting value of index 1 : "+firstIndex);
		//Here below we can add the value at index 1 as we know LinkedList is uses the doubly LinkedList
		//As compared to ArrayList this is easy and time Complexity here is O(1) but in ArrayList O(N) as we need to move the values.
		li.addFirst(300);
		System.out.println("After inserting the new value at first index LinkedList is : "+li);
		//Here below we can add the value at last index as we know LinkedList is uses the doubly LinkedList
		//As compared to ArrayList this is easy and time Complexity here is O(1) but in ArrayList O(N) as we need to move the values.
		li.addLast(39);
		System.out.println("After inserting the new value at last index LinkedList is : "+li);
		
		//also we have methods like getFirst and getLast which provide the first and last index values
		
		Integer firstVal = li.getFirst();
		System.out.println("First index value is : "+firstVal);
		Integer lastVal = li.getLast();
		System.out.println("Last index value is : "+lastVal);
		System.out.println("Fetching the 0th index value : "+li.get(0));
		
		//Some methods of the LinkedList removeFirst, removeLast, removeFirstOccurance and removeLastOccurance etc......
		//here remove if means which condition basically return true or false and from your linked list element any of them return true then that will be removed. 
		li.removeIf(x->x%2==0);
		System.out.println("After removing the value using removeIf method the linkedList elements are : "+li);
		
		//On the fly if you want to create an LinkedList
		
		//1st way is in one go using Arrays.asList in the LinkedList Constructor as given below.
		LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Lion", "Tiger", "Elephant"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant", "cow"));
		
		//2nd way create it first then pass into LinkedList constructor.
		List<String> ams = Arrays.asList("Cat1", "Dog1", "Lion1", "Tiger1", "Elephant1");
		LinkedList<String> anm = new LinkedList<>(ams);
		
		System.out.println(animals);
		System.out.println(anm);
		
		animals.removeAll(animalsToRemove);
		System.out.println(animals);
		
		//NOTE : LinkedList behave here like List but it can be behave like Stack and Queue like behave aswell. 
		
	}
}
