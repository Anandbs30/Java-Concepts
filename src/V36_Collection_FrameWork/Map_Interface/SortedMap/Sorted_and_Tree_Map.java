package V36_Collection_FrameWork.Map_Interface.SortedMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * SortedMap is an interface and which extends the SequencedMap interface and then SequencedMap interface is extends Map interface.
 * 
 * SortedMap is an interface that extends Map interface and guarantees that the entries are sorted based on the keys, either in their natural ordering or by a 
 * specified Comparator.
 */
public class Sorted_and_Tree_Map {
	public static void main(String[] args) {
		//Here TreeMap is an implemented class of the Map interface.
		//TreeMap is internally an REDBLACKTREE (REDBLACKTREE is self balancing binary search tree)
		//Here methods timeComplexity is O(log n) as we know all other Map methods takes O(n) but here internally these methods are sorting so their
		//it will take time.
		//TreeMap is an class which extends the AbstractMap Class and this AbstractMap is implements the Map interface.
		//TreeMap is also implements the NavigableMap interface which again extends the SortedMap then SequencedMap then Map.
		Map<Integer, String> stds = new TreeMap<>();
		stds.put(89, "Anand");
		stds.put(68, "Lalita");
		stds.put(88, "Mangal");
		stds.put(77, "Kaveri");
		stds.put(100, "Basagouda");
		
		//Here above we are using the TreeMap and Natural sorting(Ascending order) is happening as given below
		System.out.println(stds);//Output : {68=Lalita, 77=Kaveri, 88=Mangal, 89=Anand, 100=Basagouda}
		
		//Why we have the SortedMap interface,
		//SortedMap interface have extra method which helps us to do work in easy way.
		//Here TreeMap is an implemented class of the SortedMap interface.
		SortedMap<Integer, String> std = new TreeMap<>();
		std.put(89, "Anand");
		std.put(68, "Lalita");
		std.put(88, "Mangal");
		std.put(77, "Kaveri");
		std.put(100, "Basagouda");
		
		//SortedMap interface Methods as given below.
		
		System.out.println("The first key of the SortedMap is : "+std.firstKey());
		System.out.println("The first entry of the SortedMap is : "+std.firstEntry());
		System.out.println("The last key of the SortedMap is : "+std.lastKey());
		System.out.println("The last entry of the SortedMap is : "+std.lastEntry());
		System.out.println("Fetching the values from Head to till given key : "+std.headMap(89));//Here the given key is excluded (not print)
		System.out.println("Fetching the values from given starting point key : "+std.tailMap(88));//Here the given key is included (prints.)
		//the below method given end key is excluded (not print), but includes start key.
		System.out.println("Making sub Map by providing the entry point and end point inbetween key values are print : "+std.subMap(77, 89));
		
		//If you want to do the Descending order then we have to write comparator code(LAMBDA EXPRESSION) into the TreeMap constructor.
		SortedMap<Integer, String> std1 = new TreeMap<>((x, y)->y-x);
		std1.put(89, "Anand");
		std1.put(68, "Lalita");
		std1.put(88, "Mangal");
		std1.put(77, "Kaveri");
		std1.put(100, "Basagouda");
		System.out.println("The SortedMap in descending order based on key : "+std1);
	} 
	
}
