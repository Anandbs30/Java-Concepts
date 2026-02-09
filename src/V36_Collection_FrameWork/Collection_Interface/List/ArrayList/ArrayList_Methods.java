package V36_Collection_FrameWork.Collection_Interface.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Methods {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		//IF WE ADD AS GIVEN HERE THEN THE ELEMENT WILL ADD AFTER THE PREVIOUS VALUE INDEX.
		al.add(1);
		al.add(3);
		System.out.println(al);
		
		
		//ADDING AT A PERTICULAR INDEX AND REST OF THE VALUES ARE MOVE FORWORD OR BACKWORD AS PER THE INDEX INSERTION.
		al.add(0, 9);
		System.out.println(al);
		
		
		//MY UNDESTANDING 
		List<Integer> ar = Arrays.asList(1, 2, 3, 4,5);
		//So here we can't able to add or remove elements from a index but we can update the values.
		ar.set(0, 0);
		
		System.out.println(ar);
		//ADD ALL METHOD : Which basically add all the list elements into another.
		
		//LIst.of() method which is an immutable
		
		List<Integer> of = List.of(1, 2, 3, 4, 5, 6);
//		al.addAll(of);
		
//		System.out.println(al);
		
		//Also here we can add the list at a particular index which start the insertion at given index and goes on till its end.
		
		al.addAll(2, of);
		System.out.println(al);
		
		
		//Remove method
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pinaple");
		
		System.out.println(fruits);
		
		//Here Remove method will remove the first occurrence of the given value if there are duplicates.
		fruits.remove("Apple");
		
		System.out.println(fruits);
		
		//The below asList we can't remove and add the elements into it so here we have to create an ArrayList which return the List and then pass its object into\
		//New ArrayList constructor.
		List<Integer> asList = Arrays.asList(2, 4, 2, 6, 8, 10, 21);
		
		//Here we are passed the Above object into ArrayList() constructor
		List<Integer> num = new ArrayList<>(asList);
		
		//Now we can add, remove and update the values
		//Basically remove method is used the index to remove if you want to remove the integer values then we have to use the Wrapper class with valueOf method.
		num.remove(Integer.valueOf(21));
		System.out.println(num);
		
		
		//WE CAN CONVERT THE LIST INTO ARRAY USING toArray() METHOD
		//In this we haven't passed any data type so that will used the Object
		Object[] array2 = num.toArray();
		//Here we have provided the Integer type as wrapper class and its size is 0 at initially. 
		//Instead of the Integer it might be Student class or String then You have to put Other class which you want to create instead of the Integer. 
		Integer[] array = num.toArray(new Integer[0]);
		String[] array3 = fruits.toArray(new String[0]);
		
		System.out.println("List converted into Array and printing them : ");
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]);
			if(array.length-1>i) {
				System.out.print(", ");
			}
		}
		
//Sort Method
		Collections.sort(al);
		
		//we can also use the al.sort(null) method which as well do the same so here The sort(null) method is uses the Comparator.
		//The below sort method sort the elements ascending order.
		al.sort(null);
		System.out.println("\nAfter sorting Arraylist elements are : \n"+al);
		
	}
}
