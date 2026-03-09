package V36_Collection_FrameWork.Map_Interface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * HashMap is a class which stores the Key value pair in it and this is extends the AbstractMap<K, V> also implements some interfaces as given below.
 * 		Map<K, V>, Cloneable, Serializable 
 * HashMap internally uses the Natural sorting based on the Key's as we know that Keys are never duplicate.
 * HashMap index is starts with the 1
 * HashMap consist only one null value and if you pass another value with the null using .put() method then the new value will replace the previous.
 * also if you provided the key 3 and inserted value as Anand and after some time if you provided the key 1 and value as Lalita then this will replace the 
 * previous value Anand
 * 
 * 									<--: KEY CHARATERISTICS :-->
 * 	
 * UNOREDERED : Does not maintain any order of its elements. Store the values based there Keys which are stored in the natural sorted order() Ascending order. 
 * ALLOWS NULL KEYS AND VALUES : Can have one null key and multiple null values.
 * NOT SYNCHRONIZED : Not thread-safe; requires external synchronization is used in a multi-threaded context.
 * PERFORMANCE : Offers constant-time performance (O(1)) for basic operations like get and put methods, Assuming the hash function disperses elements properly. 
 */
public class Hash_Map_Class {
	
	public static void main(String[] args) {
		//Here below getting the Warning as we know HashMap store the Key Value pair so we have to provide the generic type Key and its value
		HashMap map = new HashMap();
		
		//HashMap with Generic types
		HashMap<Integer, String> map1 = new HashMap<>();
		//To insert key value pair into the HashMap we have to use the .put() method.
		map1.put(4, "BASAGOUDABS");
		map1.put(5, "KAVERIBS");
		map1.put(1, "ANANDBS");
		map1.put(2, "LALITABS");
		map1.put(3, "MANGALBS");
		//Here the older value ANANDBS is replaced by the The Anand as we know put method is used to Update the value.
		map1.put(1, "The Anand");
		//we can pass the key as null only one time as in the HashMap the key is unique or not duplicate.
		
//		map1.put(null, "Hey Hi null");
		//Here this is printing the values using HashMap toString method where the values are return.
		System.out.println(map1);
		
		//To get particular key stored value then we have to use the .get() method and this will holds the Values Data type.
		
		String student1 = map1.get(7);
		System.out.println(student1);//If the value not present for the given key then this will print the null.
		System.out.println(map1.get(3));
		
		//To check the value is present for a particular key then we have to sue the .contains() method which return boolean value true or false.
		System.out.println(map1.containsKey(9));//False
		System.out.println(map1.containsKey(2));//True and here this method .contains() will take O(1) as time complexity.
		//we can also provide the value to check is present or not using .contains() method.
		System.out.println(map1.containsValue("anandbs"));//which is case sensitive so this will return the false
		System.out.println(map1.containsValue("ANANDBS"));//True
		
		
		//printing the keys and its values using for loop
		
		for(int i = 1; i<=map1.size();i++) {
			System.out.println("Key : "+i+" value : "+map1.get(i));
		}
		
		//using for-each loop, Here basically A set which stores the all Keys into a set to perform this we have to use the .keySet() method.
		//And the method is returns the Set which basically not stores the duplicate and also HashMap doesn't have the keys as duplicate.
		System.out.println("\nThe below will print the keys : ");
		Set<Integer> keySet = map1.keySet();
		for(int a : keySet) {
			System.out.println(a);//Here this will print keys, to get respective key value then we have to use the map1.get(a); 
		}
		//we can also write the above code as given below. Making shorter.
		
		System.out.println("\nThe below code will print the  keys along with their values also : ");
		for(int b : map1.keySet()) {
			System.out.println("Key : "+b+" "+"Value : "+map1.get(b));
		}
		
//		We can print the both values using the for-each loop of the map1.entrySet(); method which will return the collection of the set.
		Set<Entry<Integer,String>> entrySet = map1.entrySet();
		for(Entry<Integer,String> c : entrySet) {
			//here even we can set the values using the c.setValue(); method
			//the below will all keys value as Nothing.
//			c.setValue("Nothing");
			
			//To set a particular key value
			//Note : if your HashMap consist the null as key then here you will get the NullPointerException so we have to handle that using the try catch.
			try {
				if(c.getKey()==2) {//we can use c.getKey().equals(3) as well
					c.setValue("Nothing");
				}
			} catch (NullPointerException e) {
				
			}
			System.out.println("Key using EntrySet method : "+c.getKey()+" and its value : "+c.getValue().toLowerCase());
		}
		
		//To delete any entry from the map then we have to use the map1.remove(); 
		
//		String remove = map1.remove(3);//this is based on the key
//		System.out.println(map1);
		//The below method which is basically return the boolean value if the value is true
		//Then it will delete the entry otherwise return the value as false.
		boolean remove2 = map1.remove(3, "MANGALBS");
		System.out.println(remove2);//This will print the false as we are deleting the same key in the above.
		System.out.println(map1);
		
		
		//HashMap Edge case handling methods.
		//In HashMap we have an method which is getOrDefault which means if the given key is present then it will return that otherwise whatever we have 
		//given as default value which will printed.
		
		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("Anand", 93);
		marks.put("Kaveri", 90);
		marks.put("Mangal", 91);
		marks.put("Lalita", 93);
		marks.put("Basagouda", 95);
		
		//putIfAbsent() method. This method firstly check the keys which is given and then if not present then it will insert other wise leave.
		marks.putIfAbsent("Satish", 96);
		System.out.println(marks);
		System.out.println("The newlly inserted value for the key : "+marks.get("Satish"));
		
		//getOrDefault() method.
		Integer defaultValue = marks.getOrDefault("Satish", 0);
		Integer orDefault = marks.getOrDefault("Anand", 99);
		
		System.out.println("The value : "+defaultValue);//this will return as 0 because as key is not present in the marks HashMap.
		System.out.println(orDefault);//This will print the values as 93 Because as we know Anand keyword is exist in the HashMap.
		
		
	}
}
