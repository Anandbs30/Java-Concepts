package V36_Collection_FrameWork.Map_Interface.SortedMap.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

/*
 * NavigableMap : NavigableMap is extends SortedMap, providing more powerful navigation options such as finding the closest matching key or retrieving the 
 * map in reverse order.
 */
public class NavigableMap_Class {
	public static void main(String[] args) {
		NavigableMap<Integer, String> std = new TreeMap<>();
		
		std.put(1, "One");
		std.put(5, "Five");
		std.put(3, "Three");
		//The below line by default prints the Ascending order as we are using TreeMap.
		System.out.println("NavigableMap elements : "+std);//{1=One, 3=Three, 5=Five}
		
		//What is the help of the NavigationMap this also provides the methods which helps us to work smartly in less time.
		//Providing an key which is not present but the lowerKey method using that key prints an key which is lower than the given key 
		//and if no value then null will be printed
		System.out.println("Providing an key which is not present but the lowerKey method using that key prints an key which is "
				+ "lower than the given key : "+std.lowerKey(2));
		
		//Providing an key which is not present but the ceilingKey method using that key prints an key which is greater than or equal the given key 
		//and if no value then null will be printed
		
		System.out.println(std.ceilingKey(4));//5, if you provide 6 then this will print null.
		System.out.println(std.higherKey(2));//3
		System.out.println(std.higherEntry(3));//5=Five, this will print greater than the given key.
		System.out.println("NavigationMap elements in descending order : "+std.descendingMap());
	}
}
