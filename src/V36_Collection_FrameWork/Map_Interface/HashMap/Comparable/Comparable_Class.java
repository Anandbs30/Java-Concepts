package V36_Collection_FrameWork.Map_Interface.HashMap.Comparable;

import java.util.List;
import java.util.ArrayList;

/*
 * We know about Comparator : when we have to do custom sorting logic then we use the Comparator. we can make the custom logic with multiple fields
 * Comparator have one method compare, here we are comparing between 2 values out of the class.
 * 
 * COMPARABLE : This means we are saying to the class as you have to sort like this then we have to use the COMPARABLE class, Here we can write sorting condition on
 * using one field.
 * Comparable have the one method which is compareTo(). which is present inside a class and something.compareTo() happens.
 * 
 * 
 * 
 * NOTE : Double is and wrapper class which consist the compare method where natural sorting logic is written.
 */
public class Comparable_Class {
	public static void main(String[] args) {
		List<Student_Class> sc = new ArrayList<>(); 
		sc.add(new Student_Class("Charlie", 3.5));
		sc.add(new Student_Class("Bob", 3.7));
		sc.add(new Student_Class("Alice", 3.5));
		sc.add(new Student_Class("Akshit", 3.9));
		//to make sorting as natural sort will provide the null inside the .sort() method
		sc.sort(null);	
		//Here will get an error as we are providing the null into the sort method. we have to provide the ordering
		System.out.println(sc);
		
		
		//The above .sort(null) method works for the integers
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(0);
		l.sort(null);
		//here this will print the elements in the Ascending order.
		System.out.println(l);
	}
}
