package V36_Collection_FrameWork.Map_Interface.HashTable;

import java.util.Hashtable;

/*
 * HashTable is present before collection framework. and HashTable is extends with Dictionary and Dictionary is an abstract class.
 * HashTable implements Map interface.
 * By default this stores the data in the descending order
 * Here in HashTable as well Bucket system is used for the store, get etc elements.
 * Here in HashTable in case of collision linked list is used as we know in the HashMap if collision is happens and that reaches the limit 8
 * then the binary search tree is used.
 * 
 * Note : HashTable is Synchronized(Thread Safe)
 * 		  As we know HashMap Store null values and One null key but here in the HashTable don't allow to store the null value and null key.
 * 		  This is an Legacy class and currently this is not used as its Replaced by ConcurrentHashMap.
 * 		  As it is synchronized(Thread safe) it is comparatively slower than the HashTable.  
 */
public class Hash_Table_LagacyClass {
	public static void main(String[] args) {
		Hashtable<Integer, String> fruits = new Hashtable<>();
		fruits.put(9, "Cherry");
		fruits.put(1, "Apple");
		fruits.put(3, "Cherry");
		fruits.put(2, "Banana");
		fruits.put(10, "Mango");
		
		
		System.out.println("HashTable elements are : "+fruits);//{10=Mango, 9=Cherry, 3=Cherry, 2=Banana, 1=Apple}
		
		//HASHTABLE methods
		System.out.println("Value for the key 2 is : "+fruits.get(2));//Banana
		System.out.println("Does key 3 contains value? : "+fruits.containsKey(3));
		System.out.println("Does Banana present? : "+fruits.containsValue("Banana"));
		System.out.println("Removing the keyValue using key : "+fruits.remove(2));
		System.out.println("After removing the element with key 2 the remaining HashTable elements are : "+fruits);//{10=Mango, 9=Cherry, 3=Cherry, 1=Apple}
		//The below are throw an exception as HashTable is not allow null values.
//		fruits.put(7, null);
//		fruits.put(null, "Graps");
	}
}
