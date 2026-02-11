package V36_Collection_FrameWork.Collection_Interface.List.Vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

/*
 * A vector in java is a part of the java.util package and is one of the legacy classes in Java that implements the List interface.
 * It was introduced in JDK 1.0 before collection framework and is synchronized, making it thread-safe.
 * Now it is a part of collection framework.
 * However, due to its synchronization overhead, it's generally recommended to use other modern alternatives like ArrayList in single-thread scenarios. 
 * Despite this, Vector is still useful in certain situations, particularly in multi-threads environments where thread safety is a concern.
 * 
 * 							<--: KEY FEATURES OF VECTOR :-->
 * 
 * DYNAMIC ARRAY : Like ArrayList, Vector is a dynamic array that grows automatically when more elements are added than its current capacity.
 * SYNCHRONIZED : All the methods is Vector are synchronized, which makes it thread-safe. This means multiple threads can work on a Vector without 
 * 				  the risk of corrupting the data. However, this can introduce performance overhead in single-threaded environment.
 * LEGACY CLASS : Vector was part of Java's original release and is considered a legacy class. It's generally recommended to use ArrayList in 
 * 				  single-threaded environments due to performance considerations.
 * RESIZING MECHANISM : When the current capacity of the vector is exceeded, it doubles its size by default(or increases by a specific capacity 
 * 						increment if provided).
 * RANDOM ACCESS : Similar to arrays and ArrayList, Vector allows random access to elements, making it efficient for accessing elements using an index.
 * 
 * 							<--: CONSTRUCTORS OF VECTOR :-->
 * 
 * VECTOR() : Creates a vector with an initial capacity of 10.
 * VECTOR(INT INITIALCAPACITY) :Creates a vector with a specific initial capacity.
 * VECTOR(INT INITIALCAPACITY, INT CAPACITYINCREMENT) : Creates a vector with an initial capacity and capacity increment
 * 														(how much the vector should grow when its capacity is exceeded).
 * VECTOR(COLECTION<? EXTENDS E> C) :  Creates a vector containing the elements of the specified collection.
 */
public class Vector_Class_And_CreationOFVector {
	public static void main(String[] args) {
		Vector<Integer> nums = new Vector<>();//By default its capacity is 10 as ArrayList. if you provide capacity then that will become same.
		//Here in vector we have an method through that we can check the Capacity.
		
		System.out.println("the initial default capacity of the vector is : "+nums.capacity());
		
		System.out.println("Adding the numbers into Vector : ");
		for(int i = 0; i<10;i++) {
			nums.add(i);
		}
		System.out.println("Now capacity of the Vector num is : "+nums.capacity());
		nums.add(21);
		//here will get output as 20 as we know vector is increase its capacity as capacity * 2 so here we know default capacity is 10 * 2 = 20.
		System.out.println("After exeeding the capacity 10 then the capacity of the Vector num is : "+nums.capacity());
		Vector<Integer> nums1 = new Vector<>(30);
		System.out.println("The capacity of the vector is : "+nums1.capacity());
		
		//Here in vector we can provide how much capacity needs to be increased after filling its initial capacity
		Vector<Integer> nums2 = new Vector<>(5, 3);
		//here above 5 is initial size and once its filled then 3 capacity is added means 5 + 3 = 8 capacity becomes 8.
		for(int i = 0; i<8;i++) {
			nums2.add(i);
			if(i == 5) {
				System.out.println("The current capacity is : "+nums2.capacity());
			}
		}
		
		nums2.add(3);
		nums2.add(3);
		nums2.add(3);
		nums2.add(3);
		nums2.add(3);
		nums2.add(3);
		
		System.out.println(nums2.capacity());
		
		//We can also pass the collection inside the vector constructor.
		
		Vector<Integer> nums3 = new Vector<>(Arrays.asList(3, 5, 7, 9));
		
		//OR
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(3);
		ll.add(5);
		Vector<Integer> nums4 = new Vector<>(ll);
		
	}
}
