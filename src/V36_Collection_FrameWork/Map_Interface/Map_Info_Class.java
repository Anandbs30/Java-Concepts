package V36_Collection_FrameWork.Map_Interface;
/*
 * Map is an different interface which doesn't extends the Collection frame work.
 * Before learning set Concept we have to know about the Map how internally works.
 * Map Doesn't extend the collection interface.
 * 
					                                         Map
					                        (Key-Value, Separate from Collection)
					                                              |
					        ---------------------------------------------------------------------------------
					        |                                   |                                           |
					   AbstractMap                           SortedMap                                  ConcurrentMap
					  (Base class for                       (Keys sorted)                               (Thread-safe)
					   most Maps)                               |                                           |
					        |                                    |                                           |
					        |                                TreeMap                               -----------------------
					        |                          (Red-Black Tree, O(log n),                    |                     |
					        |                           No null key, Sorted)                 ConcurrentHashMap   ConcurrentSkipListMap
					        |                                                              (High performance,      (Sorted + Thread-safe,
					        |                                                               No null key/value,      Based on Skip List,
					        |                                                               CAS in Java 8)          O(log n))
					        |
					        |------------------------------
					        |            |               |
					     HashMap     WeakHashMap    IdentityHashMap
					 (O(1) avg,     (Uses Weak      (Uses == instead
					 1 null key,     Reference,      of equals(),
					 multiple        GC removes      Identity comparison)
					 null values,    unused keys)
					 Not thread-safe)
					        |
					        |
					   LinkedHashMap
					 (Maintains insertion order,
					  Doubly LinkedList,
					  Used for LRU cache)
					        |
					        |
					    Hashtable (Legacy)
					 (Synchronized,
					  No null key/value,
					  Slower than HashMap)
					  


*		If you start learning about the Map then think like Map is an Dictionary. As we know in dictionary every word have an meaning.
*		like that in map every key have an value.
*
*		EXAMPLE : 
*			ROLL NUMBER			NAME
*			1					ANAND
*			2					KAVERI
*			3					MANGAL
*			4					LALITA
*			5					BASAGOUDA
*
*		Here in the above table every number is mapped with an Name same like this In Map we get An Key is mapped with the value.
*		So In map key is unique but value can be duplicate.
*
*		In java, a Map is an object that maps keys to values. It cannot contain duplicate keys, and each key can map to at most one value. 
*		Think of it as a dictionary where you look up a word (key) to find its definition (value).
*
*
*										<--: KEY CHARACTERISTICS OF THE MAP INTERFACE :-->
*	KEY-VALUE PAIRS : Each entry in a Map consists of a key and a value. 
*	UNIQUE KEYS : No two entries can have the same key.
*	ONE VALUE PER KEY : Each key maps to a single value.
*	ORDER : Some implementations maintain insertion order (LinkedHashMap), natural order(TreeMap), or no order (HashMap).
*/
public class Map_Info_Class {

}
