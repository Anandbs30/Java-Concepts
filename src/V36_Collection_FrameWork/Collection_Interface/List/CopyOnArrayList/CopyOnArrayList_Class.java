package V36_Collection_FrameWork.Collection_Interface.List.CopyOnArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * We know that ArrayList and LinkedList are Thread safe and if we does the Concurrent modification then will get the inconsistency in result.
 * And we know that Vector and Stack have the thread safe as they will allow only one thread to work at a time (Synchronized) but locking is happening
 * So due to this locking reason we get the performance issue. 
 */
public class CopyOnArrayList_Class {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
		/*What is "Copy On Write" whenever a write option like adding element or removing an element.
		 * In the normal ArrayList or LinkedList the existing list will be changes 
		 * In the CopyOnWriteArrayList a new copy of the list is created, and the modification is applied to that copy list.
		 * What is the Help as above line stating?
		 * ANS : This ensure that other threads reading the list while it's being modified are unaffected.
		 * 
		 *  READ OPERATIONS : Fast and direct, since they happen on a stable list without interference from modifications.
		 *  WRITE OPERATIONS : A new copy of the list is created for every modification.
		 *  				   The reference to the list is then updated so that subsequent reads use this new list.
		 *  
		 *  
		 *  Example : 
		 *  notepad --> notepad-copy --> after update its become --> notepad
		 *  
		 *  when to use?(Less write high read)
		 *  -->If you have much more read with multiple threads then we can use this but in write cases it's not correct option as we know at every
		 *     modification this will create a copy so if the case where two threads are modifying then will get conflict.
		 */
		
		//ArrayList required Stable otherwise we get issue or error example while reading if you perform the write task as well then will get issue as
		//ConcurrentModificationException
		
		/*
		 * List<String> shopping_items = new ArrayList<>(); shopping_items.add("Milk");
		 * shopping_items.add("Eggs"); shopping_items.add("Bread");
		 * System.out.println("Initiall shopping items are : "+shopping_items);
		 * 
		 * for(String item : shopping_items) { System.out.println(item);
		 * 
		 * if(item.equals("Eggs")) { shopping_items.add("Butter");
		 * System.out.println("Added Butter while reading the shopping item......."); }
		 * }
		 * 
		 * System.out.println("Updated shopping_items list is : "+shopping_items);
		 */
		
		
		//Here below using CopyOnWriteArrayList we can perform the both read and write operations or Tasks at a time
		//As we know initially its printed the elements and also note that the printing elements through the a snapshot or a copy of the previous list
		//and the writing is operation is happening on the different copy so due to this here we haven't received the ConcurrentModificationException
		
		CopyOnWriteArrayList<String>  shopping_items1= new CopyOnWriteArrayList<>();
		shopping_items1.add("Milk");
		shopping_items1.add("Eggs");
		shopping_items1.add("Bread");
		System.out.println("CopyOnWriteArrayList Initiall shopping items are : "+shopping_items1);
		//Here this loop is working on the 1 copy
		for(String item : shopping_items1) {
			System.out.println(item);
			
			if(item.equals("Eggs")) {
				//here this modification of insertion happened on the 2nd copy  
				shopping_items1.add("Butter");
				System.out.println("Added Butter while reading the shopping item.......");
			}
		}
		//Here the finally printed is updated copy of the list
		System.out.println("CopyOnWriteArrayList Updated shopping_items list is : "+shopping_items1);
	}
}
