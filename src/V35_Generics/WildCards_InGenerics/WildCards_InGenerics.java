package V35_Generics.WildCards_InGenerics;

import java.util.ArrayList;

/*
 * In java Generics, wildCards(?) are a special kind of type argument that can be used in method arguments or class definitions to represent an unknown
 * type. They allow for more flexible and dynamic code by letting the type be specified later or be more loosely defined.
 * 
 *  Whenever we use the read only then we have to use the ? as generic type here we don't know which type of data is present.
 *  
 *  Note : When to Use Generic T and WildCard ?
 *  	  Ans : While returning data and maintain type safety will use the Generic Type as T
 *  			While reading data and doing some work with that data and here not returning and data then we have to use the WildCard ?.
 */
public class WildCards_InGenerics {
	public static void main(String[] args) {
		
		//While creation of the ArrayList using WildCard ? its allow to create but it doesn't allow to add or do anything.
		//As given below we are creating an String DataType ArrayList but reference is Unknown as its don't know what is going to add into it.
		//Due to this reason it won't allow to do like this. 
		//Note : If you are using the WildCard into the creation of the ArrayList then you can't able to add and Modify the ArrayList. you can us it while reading. 
		ArrayList<?> list = new ArrayList<String>();
//		list.add("Anand");
		
	}
		//	If you are using generic type and printing array elements here we are not returning anything.
		//Here below we are just reading the data and printing them from the list. So here instead of the T we can use the ? which is an WildCard.
		public <T> void printArrayList(ArrayList<T> list) {
			for(T o : list) {
				System.out.println(o);
			}
		}
		
		//Instead of the Generic T using WildCard as ?
		public void printArrayelements(ArrayList<?> list) {
			for(Object o : list) {
				System.out.println(o);
			}
		}
		
		//returning value
		public <T> T getFirst(ArrayList<T> list) {
			return list.get(0);
		}
		
		//Here in the below example i have copying the data from source to destination where we have to use the Generic type T, If you use the WildCard ?
		//Then will get an error at destination.add(item); line as its not allow bcz here it's not type safety
		public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
			for(T item : source) {
				destination.add(item);
			}
		}
		
		//Using the WildCard ? 
		public void copy1(ArrayList<?> source, ArrayList<?> destination) {
			for(Object item : source) {
//				destination.add(item);
			}
		}
}
