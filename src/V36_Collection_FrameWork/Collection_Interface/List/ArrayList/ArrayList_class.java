package V36_Collection_FrameWork.Collection_Interface.List.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * An ArrayList is a resizable array implementation of the List Interface.
 * Unlike Arrays in java, which have a fixed size, an ArrayList can change its size Dynamically as elements are added or removed.
 * This flexibility makes it a popular choice when the number of elements in a list isn't known in advance.
 * Index starts with 0
 * 
 * If you add any new element into ArrayList then that will added at last index and if you add a specific then that will into that given index.
 */
public class ArrayList_class {

	
	public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		
		//We can write like below as we are creating ArrayList object by referring the its parent interface List. 
		//The below will return the ArrayList 
		List<Integer> ar = new ArrayList<>();
		System.out.println(ar.getClass().getName());
		
		//Creating the ArrayList and passing the values directly in the parameter using Arrays.asList method which return List.
		//Here we can't able to write the Reference as ArrayList instead of the List As we know Arrays.asList return the
		//Parent class as List
		
		//NOTE a from below ArrayLists asList and asList2 we can't add and remove the elements but we can update the new element with previous.
		//Otherwise for Add and remove will get an exception.
		List<Integer> asList = Arrays.asList(1, 2, 4, 5, 6, 7, 8);
		System.out.println(asList.getClass().getName());
		
		
		
		//we can add and remove the values from asList2 values or asList by passing this into an ArrayList Constructor.
		List<Integer> arrayList = new ArrayList<>(asList);
		arrayList.add(28);
		
		System.out.println(arrayList);
		
		//if we have an Array and now we want to convert that into ArrayList();
		//if we use the int[] here then the sop statement will print the Object address not values as ArrayList required the Generic Type to create Object.
		Integer[] num = {9, 8, 7, 5, 3, 2, 1};
		
		//Here we can't able to write the Reference as ArrayList instead of the List As we know Arrays.asList return the
		//Parent class as List
		List<Integer> asList2 = Arrays.asList(num);
		System.out.println(asList2.getClass().getName());
		System.out.println(asList2);
		
		//In new version of the java We can create A ArrayList using .Of method but that is unchangeable here we can't update value as well.
		//Here below the of is an object and which is immutable.
		List<Integer> of = List.of(1, 3, 5, 7);
		System.out.println(of);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		//Here an concept we know that before adding the elements into the ArrayList we can't find the its size but by default its capacity is 10
		//Here capacity is of the Array where arrayList is internally uses the Array so here capacity is of the Array.
		//The capacity that is initial and also the capacity which can store how much index before resizing the size of the ArrayList.
		//Add method is used to add the elements into the ArrayList object.
		arr.add(12);
		arr.add(21);
		arr.add(30);
		arr.add(0, 3);
		
		//To find ArrayList Size or length we use Size method.
		System.out.println("length of the arrayList is : "+arr.size());
		
		//To get the particular index value the we have to use the get Method.
		System.out.println("Fetching the array index based value : "+arr.get(2));
		
		//we can print arrayList elements directly by calling object inside print statement
		//How this will print arrayList elements like [12, 21, 30] as we know ArrayList is extends the AbstractList<E> abstract class and again 
		//AbstractList class is extending the abstractCollection class which contain the toString method through this method we get output like [12, 21, 30]
		System.out.println("Printing the array elements directly : "+arr+"\n");
		
		//Printing the array elements using Loops : 
		System.out.println("Printing arraylist elements using loops : ");
		System.out.println("    Uisng For Loop : ");
		for(int i = 0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("Using For each loop : ");
		for(int a : arr) {
			System.out.println(a);
		}
		
		//Checking the value is exist or not, Here we have to use the contain method which return true false as boolean value.
		
		System.out.println(arr.contains(30));
		System.out.println(arr.contains(24));
		
		//To remove any value from the index then we have to use remove method where method will take index number.
		arr.remove(0);
		System.out.println("After removing an index value the arrayList size is : "+arr.size());
		System.out.println("After removing an index value the arrayList is : ");
		for(int b : arr) {
			System.out.println(b);
		}
		
		//To add in between the value in the ArrayList we can use the add method index based with value.
		arr.add(1, 300);
		System.out.println("After adding the 300 as value at index number 1 the arrayList elements are : ");
		for(int c : arr) {
			System.out.println(c);
		}
		
		//To update any value of the ArrayList index value we have to use the set method. here set method is replace the index value with new value
		
		arr.set(0, 03);
		System.out.println("After updating the 0th index value as 03 then the arrayList elements are : ");
		for(int d : arr) {
			System.out.println(d);
		}
		
		/*
		 * INTERNAL WORKING OF THE ARRAYLIST : 
		 * 		Unlike a regular array, which has a fixed size, an ArrayList can grow and shrink as elements are added or removed.
		 * 		This dynamic resizing is achieved by creating a new array when the current array is full and copying the elements to the new array.
		 * 		Internally, the ArrayList is implemented as an array of Object references. When you add elements to an ArrayList, 
		 * 		you're essentially storing these elements in this internal array.
		 * 		
		 * 		When you create an arrayList, it has an initial capacity(default is 10). 
		 * 		The capacity is refers to the size of the internal array that can hold elements before needing to resize.
		 * 
		 * 								ADDING ELEMNTNTS TO ARRAYLIST
		 * WHEN WE ADD AN ELEMENT TO AN ARRAYLIST, THE FOLLOWING STEPS OCCUR : 
		 * 		CHECK CAPACITY : Before adding the new element, ArrayList checks if there is enough space in the internal array(elementData).
		 * 						 If the array is full, it needs to be resized.
		 *		RESIZE IF NECESSARY : If the internal array is full, the arrayList will create a new array with a large capacity
		 *							  (Usually 1.5 times the current capacity) and copy the elements from the old array to the new array.
		 *		ADD THE ELEMENT : The new element is then added to the internal array at the appropriate index, and the size is incremented.
		 *
		 *								RESIZEING THE ARRAY
		 *		INITIAL CAPACITY : By default, the initial capacity is 10. This means the internal array can hold 10 elements before it needs to grow.
		 *		GROWTH FACTOR : When the internal array is full, a new array is created with size 1.5 times the old array. This growth factor balances
		 *						memory efficiency and resizing cost.
		 *		COPYING ELEMENTS : When resizing occurs, all elements from the old array are copied to the new array, which is an O(n) operation, 
		 *						   Where n is the number of elements in the ArrayList.
		 *
		 *
		 *								REMOVING ELEMENTS
		 *		CHECK BOUNDS : The ArrayList first checks if the index is within the valid range.
		 *		REMOVE THE ELEMENT : The element is removed, and all elements to the right of the removed element are shifted one position 
		 *							 to the left to fill the gap.
		 *		REDUCE SIZE : The size is decremented by 1.
		 *
		 *NOTE : ArrayList doesn't shrink it's size but we can make that to save the memory.
		 */
//		NOTE : ArrayList doesn't shrink it's size but we can make that to save the memory.
		//Here the arrayList size is not 1000 the 1000 is the size of the Array which is internally creating.
		ArrayList<Integer> al = new ArrayList<>(1000);
		//The below line will print the 0 as its doesn't have any elements.
		System.out.println(al.size());
		//Through the below line of get method will get an exception as IndexOutOfBoundsException because as its doesn't have any elements
//		System.out.println(al.get(0));
		//Example
		
		
		//So here below initial array capacity or length is 11 not ArrayList size
		ArrayList<Integer> arl = new ArrayList<>(11);
		arl.add(1);
		arl.add(2);
		arl.add(3);
		arl.add(4);
		arl.add(5);
		arl.add(6);
		arl.add(7);
		arl.add(8);
		arl.add(9);
		arl.add(10);
		arl.add(11);//until this the initial array size is 11 but after this the arraList will increase its size to new as initial array size * 1.5
		arl.add(12);//now this point the initial array size becomes 16 as we are playing with integer. But if you check the size of the ArrayList 
		//The that will return 12 as it's stored values means that will only consider the value filled index count only.
		System.out.println("Size of the array lis is : "+arl.size());
		System.out.println("Array list elements printing and as it is use the toString method to print the ArrayList elements : "+arl);
		
		//We don't have any method to print the initial array size but we have an way to print it using reflection
		//The below code will  throw an exception as : module java.base does not "opens java.util" to unnamed module @7ad041f3 from java 9 we can't access it.
		/*If you wan't to print then sts->In STS top menu → Run
			Click Run Configurations… -> Select your Java application -> On the left panel -> 
			expand Java Application -> select class -> Go to Arguments tab -> 
			VM arguments -> --add-opens java.base/java.util=ALL-UNNAMED

		 * 
		 */
		ArrayList<Integer> abs = new ArrayList<>(11);
		abs.add(1);
		abs.add(2);
		abs.add(3);
		abs.add(4);
		abs.add(5);
		abs.add(6);
		abs.add(7);
		abs.add(8);
		abs.add(9);
		abs.add(10);
		abs.add(11);
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[])field.get(abs);
		System.out.println("ArrayList capacity : "+elementData.length);
		
		abs.add(12);
		elementData = (Object[])field.get(abs);
		System.out.println("ArrayList capacity : "+elementData.length);//here resize happens internally of the array and it print 16
		
//		
//		abs.remove(2);
//		elementData = (Object[])field.get(abs);
//		System.out.println("ArrayList capacity : "+elementData.length);//here it print 16
		
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		abs.remove(2);
		elementData = (Object[])field.get(abs);
		System.out.println("ArrayList capacity : "+elementData.length);//here it print 16 as its not resizing
		
		//to resize based on the elements then we have to use the trimToSize() method which will remove the unused memory and print only element contain 
		//index count
		abs.trimToSize();
		elementData = (Object[])field.get(abs);
		System.out.println("ArrayList capacity : "+elementData.length);//this will print 4
		
		
	} 
}
