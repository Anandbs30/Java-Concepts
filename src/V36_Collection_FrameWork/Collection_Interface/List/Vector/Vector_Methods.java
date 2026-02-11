package V36_Collection_FrameWork.Collection_Interface.List.Vector;
/*
 * 												<--: VECTOR METHODS :-->
 * 
 * add(E e) : Adds an element at the end.
 * add(int index, E element) : Inserts an element at the specific index.
 * get(int index) : Retrieves the element at the specific index.
 * set(int index, E element) : Replaces the element at the specified index.
 * remove(Object o) : Removes the first occurrence of the specified element.
 * remove(int index) : Removes the element at the specified index.
 * size() : Returns the number of elements in the vector.
 *  isEmpty() : Checks if the vector is empty.
 *  contains(Object o) : Checks if the vector contains the specified element.
 *  clear() : Removes all elements from the vector.
 *  
 * 												<--: INTERNAL IMPLEMENTATION OF VECTOR :-->
 * Internally, Vector uses an array to store its elements. The size of this array grows as needed when more elements are added. The default behavior is
 * to double the size of the array when it runs out of space. This resizing operation is a costly one, 
 * as it requires copying the old elements to the new, larger array.
 * 
 * 
 * 												<--: SYNCHRONIZATION AND PERFORMANCE OF THE VECTOR :-->
 * Since Vector methods are synchronized, it ensures that only one thread can access the vector at a time. This makes it thread-safe but can introduce 
 * performance overhead in single-threaded environments because synchronization adds locking and unlocking costs.
 * 
 * In modern Java applications, ArrayList is generally preferred over Vector when synchronization isn't required. For thread-safe collections,
 * the CopyOnWriteArrayList or ConcurrentHashMap from the java.util.concurrent package is often recommended instead. 
 */
public class Vector_Methods {
	public static void main(String[] args) {
		
	}
}
