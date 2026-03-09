package V36_Collection_FrameWork.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * As we know ITERABLE is an interface and that have a method Iterator().
 * what is Iterator()?
 * ANS : This will return an iterator, the iterator is used to traverse over the collection one by one. 
 */
public class Iterator_Class {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//here we apply for each loop so here java allow this because of the ArrayList class Have Iterator method as its Implements the Iterable.
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		//But internally the below will happen after applying the for each loop
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		//Example
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		System.out.println("Original List elements are : "+nums);
		Iterator<Integer> iterator2 = nums.iterator();
		while(iterator2.hasNext()) {
			
			Integer num = iterator2.next();
			if(num%2==0) {
				iterator2.remove();
			}
		}
		System.out.println("After removing even numbers from the list elements are : "+nums);
		
		//The ListIterator have more methods here as compare to the Iterator.
		ListIterator<Integer> lit = nums.listIterator();
		while(lit.hasNext()) {
			//Using listIterator we can update the current number as well.
			//Using set() method from ListIterator replace the last element returned by next or previous with the specified element.
			//This call can be made only if neither remove or add have been called after the last call to next or previous. 
		}
		
	}
}
