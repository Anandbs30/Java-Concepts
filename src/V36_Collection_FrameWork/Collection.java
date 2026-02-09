package V36_Collection_FrameWork;
/*
 * What is Collection?
 * Ans : A collection simply is an object that represent a group of objects, known as its elements.
 * 
 * What is Collection FrameWork?
 * Ans : It provides a set of interfaces and classes that helps in managing groups of objects.
 * 
 * NOTE : Before the introduction of the collection framework in JDK 1.2, java used to rely on a variety of classes like Vector, Stack, HashTable and Arrays
 * to store and manipulate groups of objects.
 * 
 * However these classes had several drawbacks Inconsistency, Lack of inter-operability and No Common Interface.
 * 1) Inconsistency : Each class had a different way of managing collections, leading to confusion and a steep learning curve.
 * 2) Lack of inter-operability : These classes were not designed to work together seamlessly.
 * 3) No Common Interface : There was no common interface for all these classes, which meant you couldn't write generic algorithms that could operate on 
 * 							different types of collections.
 *  
 *  
 *  To resolve above 3 problems in java introduced Collection frame work in Java 2 or Java 1.2
 *  Solution provided : 
 *  				Unified architecture : A Consistent set of interfaces for all collections.
 *  				Inter-operability : Collections can be easily interchanged and manipulated in a uniform way.
 *  				Reusability : Generic algorithms can be written that works with any collection.
 *  				Efficiency : The framework provides efficient algorithms for basic operations like searching, sorting and manipulation.
 *  
 *  KEY INTERFACES IN THE COLLECTION FRAMEWORK : 
 *  
 *  	The collection framework is primarily built around a set of interfaces.
 *  	
 *  	IMPORTANT ONCE ARE : 
 *  		1) Collection : The root interface for all the other collection types.
 *  		2) List : An ordered collection that can contain duplicate elements(e.g., ArrayList, LinkedList).
 *  		3) Set : A collection that cannot contain duplicate elements(e.g., HashSet, TreeSet).
 *  		4) Queue : A collection designed for holding elements prior to processing(e.g., PriorityQueue, LinkedList when used as a queue).FIFO principle
 *  		5) Deque : A double-ended queue that allows insertion and removal from both ends(e.g., ArrayDeque).
 *  		6) Map : An interface that represents a collection of key-value pairs(e.g., HashMap, TreeMap)
 * 
 *  COLLECTION HIERARCHY : 
 *  	The collection framework is organized into a hierarchy where the core interfaces are at the top, and the specific implementations extend these interfaces.
 *  	
 *  	Iterable is an main or root interface of collection frame work if any of the class is implements its then we can use the for each loop on the objects.
 *  
 *  
 *                                     Iterable
                               (for-each support)


                                       |
                                   Collection
                              (add, remove, size)


        -------------------------------------------------------------------------------


           List                              Set                               Queue
  (ordered, duplicates)              (unique elements)                  (processing order)


   ---------------------              ---------------------              ---------------------


   ArrayList                          HashSet                            LinkedList
   (fast read)                        (no order)                         (FIFO)


   LinkedList                         LinkedHashSet                      PriorityQueue
   (fast insert)                      (insertion order)                  (priority)


   Vector                             TreeSet
   (legacy)                           (sorted)
      |
     Stack                               |
     (LIFO)                           SortedSet


   CopyOnWriteArrayList              EnumSet
   (thread-safe)                     (enum only)


                                     ConcurrentSkipListSet
                                     (thread-safe sorted)


                                     CopyOnWriteArraySet
                                     (thread-safe)


                                                                        Deque
                                                                      (both ends)
                                                                          |
                                                ------------------------------------------------
                                                |                    |                         |
                                           ArrayDeque           LinkedList        ConcurrentLinkedDeque
                                           (fast)               (impl)             (thread-safe)


                                                                       BlockingQueue
                                                               (threads wait full/empty)
                                                                          |
                ------------------------------------------------------------------------------------
                |                     |                     |                     |               |
        ArrayBlockingQueue     LinkedBlockingQueue    PriorityBlockingQueue   SynchronousQueue   DelayQueue
        (fixed size)           (optional size)        (priority + block)      (no storage)      (time-based)


                                                                       |
                                                             ConcurrentLinkedQueue
                                                             (non-blocking)

 */
public class Collection {
	public static void main(String[] args) {
		
	}
}
