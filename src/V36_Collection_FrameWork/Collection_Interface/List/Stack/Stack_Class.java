package V36_Collection_FrameWork.Collection_Interface.List.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*
 * NOTE : Here in this as well Stack uses the Internally Array as we know stack is extends the Vector.
 * 
 * Stack is extends the Vector class
 * What is stack?
 *  :-> If we put the book one on another then that is known as Stack of books.
 *  	This is follow the LAST IN FIRST OUT(LIFO) principle.
 *  	This is extends the vector class due to this reason it is synchronized and making thread-safe
 *  
 *  On which condition we have to use Which DataStructure : 
 *  	
 *  	ArrayList : Sequential and TimeComplexity is O(1) while fetching the data from the ArrayList. 
 *  	LinkedList : Efficiently done Insertion and Deletion.
 *  	Vector : Sequential and TimeComplexity is O(1) with synchronization.
 *  
 *  LIFO STRUCTURE : Stack follows the LAST-IN-FIRST-OUT(LIFO) principle, where the last element added is the first one to be removed.
 *  INHERITANCE : Stack is a subclass of Vector, which means it inherits all the features of a dynamic array but is constrained by the stack's LIFO nature.
 */
public class Stack_Class {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		//So here also same behavior in the Stack capacity as in the Vector.
		//Initial capacity is 10 once it exceed it's capacity then this will double its initial capacity.
		System.out.println("Initial capacity of the stack is : "+s.capacity());
		//To add integer into stack we have to use the push() method.
		s.push(3);
		s.push(30);
		s.push(300);
		s.push(3);
		s.push(30);
		s.push(300);
		s.push(3);
		s.push(30);
		s.push(300);
		s.push(3);
		System.out.println("After adding the 10 elements into stack capacity is : "+s.capacity());
		s.push(30);
		System.out.println("After adding the 11th element into stack capacity is : "+s.capacity());
		s.push(300);
		s.push(3);
		s.push(30);
		s.push(300);
		s.push(3);
		s.push(30);
		s.push(300);
		s.push(3);
		s.push(30);
		System.out.println("After adding the 20 element into stack capacity is : "+s.capacity());
		s.push(300);
		s.push(3000);
		//Here below its exceeds it's capacity of 20 then its doubles the current capacity 20 * 2 = 40;
		System.out.println("After adding the 22 element into stack capacity is : "+s.capacity());
		//Here to string method is called to print the Stack.
		System.out.println(s);
		
		//To remove lastly added integer from the stack we have to use the pop() method and it return the integer.
		Integer removedElement = s.pop();
		System.out.println("The removed lastly added element is : "+removedElement);
		System.out.println("After removing the lastly element from the stack the remaining Stack elements are : "+s);
		
		//if you want to know which element is added lastly then we have to use the peak() method which return the lastly added value.
		
		Integer peek = s.peek();
		System.out.println("The lastly added element in the stack is : "+peek);
		
		//To check whether the stack is empty or Not we have to use the .isEmpty() which return boolean value true or false.
		System.out.println("The stack is empty : "+s.isEmpty());//here will get false as result.
		//to check the stack size then we have to use the .size() method which return an integer.
		//So basically the .size() method is return the element count of the stack or index count which are filled with the values.
		System.out.println("Size of the stack is : "+s.size());
		//As we know stack is extends the vector class we can add, remove at a particular index.
		//Means we can perform anything as vector but if you want to specific then you have peek, pop, push methods.
		
		//to search an particular element index then you have to use the search() method.
		//Note IMP : The search method follows the 1 index means the indexing is starts from 1
		System.out.println(s.search(300));
		
		//We can use the LinkedList as Stack. we can implement stack using the LinkedList as given below
		//Here we are able to achieve the implementation of the stack behavior using the linkedList because here as we know LinkedList uses the doubly
		//Linked list internally so we can perform task like addFirst and addLast
		//And here the time complexity is O(1)
		LinkedList<Integer> nums = new LinkedList<>();
		nums.addLast(12);
		nums.addLast(21);
		nums.addLast(39);
		nums.addLast(48);
		nums.addLast(57);
		System.out.println("Before removing the lastly added element from the linked list elements are : "+nums);
		System.out.println("This remove the lastly added element into linked list is : "+nums.removeLast());//this is be like pop method of Stack.
		System.out.println("The lastly added element into linked list is : "+nums.getLast());//this is be like peek method of Stack.
		
		System.out.println("After removing the lastly added element from the linked list elements are : "+nums);
		
		
		
		//We can implement the Stack behavior using ArrayList as well as given below : 
		ArrayList<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(4);
		num.add(6);
		System.out.println("ArrayList elements are : "+num);
		//to achieve the peek method here we need to get top element like lastly added element
		System.out.println("Lastly added element is : "+num.get(num.size()-1));//This is manually doing this thing
		
		//to achieve the pop method here we need to delete top element like lastly added element
		System.out.println("Deleting or Removing the lastly added element is : "+num.remove(num.size()-1));//This is manually doing this thing
		
		System.out.println("After deleting the lastly added element or deleted the top element from the ArrayList : "+num);
		
		
	}
}
