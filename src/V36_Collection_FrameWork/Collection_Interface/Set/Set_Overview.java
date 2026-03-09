package V36_Collection_FrameWork.Collection_Interface.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* Set is an interface which extends the Collection framework interface.
 * Set is an collection frame work which doesn't allow you to store duplicates. And this is based on the HashMap principle. Due to this time complexity to 
 * Find(Read) and insert is O(1).
 * Set store elements in unordered. Using HashSet.
 * If you want to maintain order then use the LinkedHashSet.
 * 
 * As we know Map is an interface and that have implementation classes  : HashMap, LinkedHashMap, TreeMap, EnumMap.
 * like above Map set also an interface and it is also have further implementation classes : HashSet, LinkeHashSet, TreeSet, EnumSet.
 * 
 */
public class Set_Overview {
	public static void main(String[] args) {
		//The below we are using the HashSet so this will store elements in unordered and doesn't store duplicate as it is referring the Set.
		Set<Integer> ids = new HashSet<>();
		ids.add(23);
		ids.add(12);
		ids.add(32);
		ids.add(3);
		ids.add(12);
		
		System.out.println(ids);
		
		//If you want to store elements in Ordered means as inserted as it is then you have to use the LinkedHashSet, which also doesn't allow duplicates.
		Set<Integer> ids1 = new LinkedHashSet<>();
		ids1.add(23);
		ids1.add(12);
		ids1.add(32);
		ids1.add(3);
		ids1.add(12);
		
		System.out.println(ids1);
		
		//If you want to store Set elements in sorted order then you have to use the TreeSet.
		NavigableSet<Integer> ids2 = new TreeSet<>();
		ids2.add(23);
		ids2.add(12);
		ids2.add(32);
		ids2.add(3);
		ids2.add(12);
		System.out.println(ids2.floor(12));
		System.out.println(ids2);
		
		
		System.out.println("To clear all elements from the ids : ");
		ids.clear();
		System.out.println(ids);
		
		//Note : As we know using Collections.synchronizedMap(map_variable); to make any map as synchronized.
		//We have same in the set as well Collections.SynchronizedSet(set_variable); to make any set as Synchronized.
		//The below line makes synchronized but not that set all methods becomes synchronized so this is difficulty as we know if read operation happening then
		//write method needs to wait like.
		Set<Integer> synchronizedSet = Collections.synchronizedSet(ids1);
		
		//instead of the above we can use the ConcurrentSkipLisSet which helps in the synchronization as its have built in property.
		ConcurrentSkipListSet<Integer> csls = new ConcurrentSkipListSet<>();
		csls.add(23);
		csls.add(12);
		csls.add(32);
		csls.add(3);
		csls.add(12);
		System.out.println(csls);
		
		//We have Unmodifiable set as well which we use to store the constant which are not changeable.
		Set<Integer> of = Set.of(1, 13, 5, 7, 9, 2, 4, 6, 8, 10);//it doesn't allow to store duplicate values and if provide then this will throw exception.
		System.err.println(of);
	}
}
