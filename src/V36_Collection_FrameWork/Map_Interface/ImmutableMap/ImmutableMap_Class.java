package V36_Collection_FrameWork.Map_Interface.ImmutableMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * The Map once initialized then we can't change its values but we can read them.
 */
public class ImmutableMap_Class {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 12);
		map.put("B", 3);
		System.out.println("Original map : "+map);
		
		Map<String, Integer> ummap = Collections.unmodifiableMap(map);
		System.out.println("Original map values mapped into unmodifiableMap : "+ummap);
		
		//we can't able to modify the ummap variable elements as its unmodifiableMap.
		//here we get exception stating that UnsupportedOperationException
//		ummap.put("C", 30);
		
		//but if anyone modified in the original map then will get those as well as given below
		
		map.put("C", 30);
		System.out.println("After modifying the original map unmodifiableMap elements are : "+ummap);//changed so this is wrong.
		
		//Due to this reason in java 9 Map.of() method is came in this we can provide key value pair directly which understood.
		//Limitation to store only 10 key value pairs.
		Map<String,Integer> of = Map.of("Anand", 30, "Kaveri", 28);
		System.out.println(of);
		//here if we try to change then thats throws exception as UnsupportedOperationException
//		of.put("Mangal", 12);
		//Limitation to store only 10 key value pairs. To avoid this java introduced Map.ofEntries(); method where we can provide as given below.
		Map<String,Integer> ofEntries = Map.ofEntries(Map.entry("Anand", 30), Map.entry("Kaveri", 28), Map.entry("Mangal", 3));//comma separated.
		System.out.println(ofEntries);
	}
}
