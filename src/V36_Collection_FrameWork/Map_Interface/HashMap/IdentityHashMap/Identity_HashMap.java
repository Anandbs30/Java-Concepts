package V36_Collection_FrameWork.Map_Interface.HashMap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
//Note wherever you use the new keyword while creating an object then that's hashcode is different.	
//NOTE : == method compare with the object address and .equals() method will check the object content.
/*
 * 
 * String generates hash based on characters. and Formula used internally : hash = 31 * hash + charValue;
 * example : hash = 0
			 hash = 31*0 + 'A'
			 hash = 31*hash + 'B'
			 hash = 31*hash + 'C'
			 
NOTE : HASHMAP CALLS .equal() METHOD WHEN OBJECT ADDRESS IS SAME. THEN ONLY. where it will check with the each char of the content.	

 */
public class Identity_HashMap {
	public static void main(String[] args) {
		String key1 = new String("Anand");
		String key2 = new String("Anand");
		//Here the HashCode is generated using the object content so content is same for both key1 and key2 so here the HashCode is same.
		//And here the 
		System.out.println("HashCode of the key1 : "+key1.hashCode());
		System.out.println("HashCode of the key2 : "+key2.hashCode());
		Map<String, Integer> m = new HashMap<>();
		m.put(key1, 3);
		m.put(key2, 12);
		//If we use the HashMap then will get new value {Anand = 12} as we know HashMap uses .equals() and hashCode() 
		//.equals() -> compares content and hashCode() → based on characters here both will return true. so the old value will get replaced with new value.
		
		System.out.println(m);
		//In this IdentityHashMap we play with the object memory address using that only HashCode is generated.	
		//Also here .equals() method is not used , IdentityHashcode(means object ke andarka hashcode consider) and == method.
		Map<String, Integer> n = new IdentityHashMap<>();
		//both key1 and key2 hashcode are different
		//in this below HashCode will calculated using the object address. So here HashCode is different as object addresses are different. 
		//And then using == method checks key1 == key2 then this will return false.
		System.out.println("IdentityHashMap identity hashcode : "+System.identityHashCode(key1));
		System.out.println("IdentityHashMap identity hashcode : "+System.identityHashCode(key2));
		n.put(key1, 30);
		n.put(key2, 120);
		//the below will return both values, If in your class hashcode present or not in this IdentityHashMap Object class hashcode(memory will) will work. 	
		System.out.println(n);
	}
}


