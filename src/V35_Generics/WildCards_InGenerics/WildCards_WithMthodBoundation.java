package V35_Generics.WildCards_InGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Here below we used the List and ArrayList
 * List is an Super class.
 * ArrayList is an Sub class of the List
 */

public class WildCards_WithMthodBoundation {
	public static void main(String[] args) {
		System.out.println("The sum of the values : "+upperBoundExample(Arrays.asList(1, 2.2, 3.4, 30)));//Here asList method return List.
		
		//Example Without Boundation
		List<?> asList = Arrays.asList(1, 2, 3, 4, 5);
		//Here below we are unable to add the number as asList is don't know which type of data needs to be added as its an wildCard.
//		asList.add(12);//error
		//Here we can only fetch the data and also observe here that is we are fetching an value using its index but return type is an Object as it is don't know
		Object object = asList.get(2);
		
		//Example with Upper Boundation and Limitations
		List<? extends Number> asList2 = Arrays.asList(1, 2, 3, 4, 5);
		//Here below as well we are unable to add the data. But we can add null.
//		asList2.add(12);//Error
		asList2.add(null);
		
		//Example with Lower Boundation and Limitations
		List<? super Integer> asList3 = Arrays.asList(1, 2, 3, 4, 5);
		asList3.add(30);
		asList3.add(null);
	}
	
	
	//In this below method we are using the WildCard and calculating the sum and making Type Casting manually.
	public static int sum(ArrayList<?> list) {
		int sum = 0;
		for(Object o : list) {
			sum += (int) o;//Manual Type Casting 
		}
		return sum;
	}
	
	
	//Here below we used Boundation on method parameter and then we able to use the Number which is the parent class instead of the Object.
	//Means here we are restricted on method using boundation and used number. Note : This method can't accept other than number.
	//Upper Boundation means here we can we are extending the Number class which is parent class and we can use its child classes. 
	//This is the terrace we can't above than the Terrace
	public static double upperBoundExample(List<? extends Number> list) {
		double s = 0;
		for(Number n : list) {
			s += n.doubleValue();
		}
		return s;
	}
	
	//Here we are using the Lower Bound here LowerBound means Integer super class which might be Number or Object
	//Here we can't use the Integer Sub class
	//This is the floor we can't go below this. But we can go next floor which is present above of current.
	public static void lowerBoundExample(List<?  super Integer> list) {
		for(Object n : list) {
			System.out.println(n);
		}
	}
}
