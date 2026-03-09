package V36_Collection_FrameWork.Collection_Interface.List.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Comparator is an Interface with the help of this we can make the custom ordering.
 */
class MyCustomeSort implements Comparator<Integer>{

	
	//Here in the below if the return type int is returns the negative(-ve) value then num1 first come and then num2 otherwise reverse the concept.
	@Override
	public int compare(Integer num1, Integer num2) {
		return num2 - num1;
	}		
}

class MyCustomeStringSortDesc implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		return len2 - len1;
	}
	
}
/*
 * Example : Here len is String length 
 * 
 * 
 * if in the below compare method return type int is negative then that will return the o1 otherwise o2
 * len1 is = 3 and len2 is = 5
 * int the above case len1 - len2 then this will return len1 as return type int is having -ve value.
 */
class MyCustomeStringSortAesc implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		return len1 - len2;
	}
	
}

public class Comparator_Class{
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 1, 3, 6, 5);
		System.out.println("List elements without sorting : \n"+nums);
		nums.sort(null);//Here sorting order is null means natural sort(Ascending order).
		System.out.println("The sorted in ascending order : \n"+nums);
		
		nums.sort(new MyCustomeSort());
		System.out.println("Number sorted in descending order : "+nums);
		
		//Number sorting using the Lambda expression
		nums.sort((i, j)->j-i);
		System.out.println("Number sorted in descending order using lambda Expression : "+nums);
		
		nums.sort((i, j)->i-j);
		System.out.println("Number sorted in ascending order using lambda Expression : "+nums);
		
		
		//if you want to make the custom sorting as based on the word length then we have t use the Comparator.
		List<String> names = Arrays.asList("Anand", "Kaveri", "Lalita", "Mangal", "Basagouda");
		//if i use the names.sort(null); this will sort the list using the char value internally.
		names.sort(null);
		System.out.println(names);
		
		names.sort(new MyCustomeStringSortDesc());
		System.out.println("Sorted List based on the word length in descending order : "+names);
		
		names.sort(new MyCustomeStringSortAesc());
		System.out.println("Sorted List based on the word length in Aescending order : "+names);
		
		
		//Below using the Lambda Expression
		List<String> names1 = Arrays.asList("Anand", "Kaveri", "Lalita", "Mangal", "Basagouda");
		
		//Printing the ascending and descending using the lambda expression
		
		names1.sort((a, b)->b.length()-a.length());
		System.out.println("Sorted List based on the word length in descending order using LAMBDA Expression : "+names1);
		
		names1.sort((a, b)->a.length()-b.length());
		System.out.println("Sorted List based on the word length in ascending order using LAMBDA Expression : "+names1);
		
	}
}
