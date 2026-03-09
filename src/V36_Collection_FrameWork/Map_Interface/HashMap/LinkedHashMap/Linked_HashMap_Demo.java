package V36_Collection_FrameWork.Map_Interface.HashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/*
 * Here LinkedHashMap class is extends HashMap class and implements Map interface. 
 * LinkedHashMap is maintain the order. But not in the HashMap.
 * LinkedHashMap internally uses the Doubly linked list along with the array as HashMap have, Which stores the inputs as they inserted.
 * Due to this reason LinkeHashMap is slower than the HashMap. 
 * LinkedHashMap is sub class of the HashMap, So LinkedHashMap also have the same TimeCOmplexity O(1), but comparatively bit slower than the HashMap.
 * And LinkedHashMap is uses internally Doubly Linked list which is uses the more memory as well as compared to HashMap.
 * When to use LinkedHashMap?
 * : when order is matters then we have to use the LinkedHashMap.
 * 
 * LinkedHashMap is also not an thread safety be like HashMap.
 */
public class Linked_HashMap_Demo {
	public static void main(String[] args) {
		//Here below 11 is initial capacity of the internal Array, 0.3f is loadFactor, true is accessOredr where true for access-order, 
		//Load Factor means the internal array when needs to resize its size.
		//false for insertion order. ByDefault its false.
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(11, 0.3f, true);//this will maintain the order but linkedHashMap is maintain the Order
		//Order maintain means : However you inserted that will print.
		HashMap<String, Integer> hm = new HashMap<>();//this will not maintain the order but linkedHashMap is maintain the Order 
		lhm.put("Anand", 30);
		lhm.put("Lalita", 12);
		lhm.put("Mangal", 57);
		//if we use the true in the constructor then the get value is goes down while accessing. or the accessed value is goes end of the LinkeList.
		//This means that the accessed means that those are currently using so due to this the unused elements becomes up so we can remove them directly.
		//Here this will help us.
		lhm.get("Mangal");
		lhm.get("Lalita");/* 
		here above we are accessing the Mangal and Lalita So here the Anand will be remaining element is becomes at the top so we can remove that easily.
		Anand : 30
		Mangal : 57
		Lalita : 12
		*/
		for(Map.Entry<String, Integer> e: lhm.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		//
	}
	
}
