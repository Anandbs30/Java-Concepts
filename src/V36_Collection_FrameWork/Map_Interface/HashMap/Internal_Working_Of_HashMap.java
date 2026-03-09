package V36_Collection_FrameWork.Map_Interface.HashMap;

import java.util.HashMap;

/* Note HashMap internally uses the Array to store the data. In that in a single index it stores the key value pair. and default size of array is 16.
 * and that array holds the linkedList for all index that's why the multiple key value pairs into it. 
 * Key : The identifier used to retrieve the value. using map.get(); method.
 * Value : The data associated with the key.
 * Bucket : A place where key-value pair are stored. Think of buckets as cells in a list(array).
 * Hash Function : Converts a key into an index (bucket location) for storage. Here whatever data stored in the form of Key value so in this the key will
 * 				   goes under the hash function and took and index from the bucket internal array.
 * 
 * 							<--: Characteristics :-->
 * 					* DETERMINISTICS : The same input will always produce the same output.
 * 					* FIXED OUTPUT SIZE : Regardless of the input size, the hash code has a consistent size(eg:, 32-bit, 64-bit)
 * 					* EFFICIENT COMPUTATION : The hash function should compute the hash quickly.
 * 
 * 	
 *    1️⃣ KEY Diagram
 *                     Value
                      ●
                      |
                      |
Key  ●  ------------------------------------------  ●  Bucket
 (Identifier)                                         (Storage Cell)
 (Must be Unique)
 (Uses hashCode())
 (equals() used for
  comparison inside bucket)
 (Can be one null key only)
                      |
                      |
                      ●
                Hash Function


					Inside Meaning:
						KEY →
						• Used to retrieve value
						• Must be immutable (Best Practice)
						• Should properly override hashCode() & equals()
						• Poor hashCode() → High collision → Performance drop
						• Stored along with hash value inside Node

	2️⃣ VALUE Diagram
		                    Value
		                      ●
		              (Actual Data Stored)
		              (Can be Duplicate)
		              (Can be null - multiple allowed)
		              (Replaced if same key inserted)
		                      |
		                      |
		Key  ●  ------------------------------------------  ●  Bucket
		                      |
		                      |
		                      ●
		                Hash Function
				Inside Meaning:
					VALUE →
					• Data mapped to key
					• Not involved in hashing
					• Can be updated using same key
					• Stored inside Node<K,V>
					
	3️⃣ BUCKET Diagram
				                    Value
				                      ●
				                      |
				                      |
				Key  ●  ------------------------------------------  ●  Bucket
				                                                  (Array Index)
				                                                  (Node<K,V>[])
				                                                  (Power of 2 size)
				                                                  (Default capacity = 16)
				                                                  (Load Factor = 0.75)
				                                                  (Collision handled here)
				                                                  (LinkedList → Tree if ≥ 8)
				                      |
				                      |
				                      ●
				                Hash Function

						Internal Structure Inside Bucket:
									Bucket →
									   Node (hash, key, value, next)
									
									Collision Handling:
									Array
									  ↓
									LinkedList (Before Java 8)
									  ↓
									Red-Black Tree (If bucket size ≥ 8 AND capacity ≥ 64)
									
	4️⃣ HASH FUNCTION Diagram
					                    Value
					                      ●
					                      |
					                      |
					Key  ●  ------------------------------------------  ●  Bucket
					                      |
					                      |
					                      ●
					                Hash Function
					              (hashCode())
					              (Index = (n-1) & hash)
					              (Fast bitwise operation)
					              (Determines bucket location)
					              (Triggers rehash when threshold crossed)
					
					Internal Working Flow:
						1. key.hashCode()
						2. Hash spreading (Java 8 improvement)
						3. index = (capacity - 1) & hash
						4. Store in bucket[index]
						5. If collision → equals() check
					
					🔥 Bonus (4+ Years Interview Level – Integrated View)
							HashMap Internal Architecture
							
							HashMap
							   |
							   |-- Node<K,V>[] table  (Array of Buckets)
							           |
							           |-- Node (hash, key, value, next)
							                   |
							                   |-- LinkedList
							                   |-- Red-Black Tree (If threshold ≥ 8)
							
					
					🚀 Senior-Level Key Points To Remember
							Add these mentally when explaining diagram:
							• Default capacity = 16
							• Load factor = 0.75
							• Threshold = capacity × loadFactor
							• Rehashing doubles capacity
							• Not thread safe
							• One null key allowed
							• Multiple null values allowed
							• Worst case before Java 8 → O(n)
							• After Java 8 → O(log n)
							
	WHAT IS HASH FUNCTION?
	 :-> A hash function is an algorithm that takes an input(or "key") and returns a fixed-size string of bytes, typically a numerical value.
	 	 The output is known as a hash code, hash value, or simply hash.
	 	 The primary purpose of a hash function is to map data of arbitrary size to data of fixed size.
	 	 
		<--: HOW DATA IS STORED IN HASHMAP :-->
		STEP 1 : HASHING THE KEY : First, the key is passed through a hash function to generate a unique hash code (an integer number). 
				 This hash code helps determine where the key-value pair will be stored in the array (called a "Bucket array").
		
		<--: CALCULATING THE INDEX :-->
		STEP 2 : The hash code is then used to calculate an index in the array (bucket location) using "INT INDEX = HASHCODE % ARRAYSIZE;"
				 The index decides which bucket will hold this key-value pair.
				 For example, if the array size is 16, the key's hash code will be divided by 16, and the reminder will be the index.
		
		<--: STORING IN THE BUCKET :-->
		STEP 3 : The key-value pair is stored in the bucket at the calculated index. Each bucket can hold multiple key-vlaue pairs.
				 (This is called a collision handling mechanism, discussed later.)
				 
		Example :=>
 * 			map.put("apple", 30);
 * 			- here above key is apple and value is 30.
 * 			- The hash code of apple is calculated.
 *			- The index is found using hash code.
 *			- The pair ("apple", 30) is stored in the corresponding bucket. 
 * 
 *		<--: HOW HASHMAP RETRIVES DATA :-->
 *			When we get(key), the HashMap follows these below steps : 
 *			* HASHING THE KEY : Similar to insertion, the key is hashed using the same hash function to calculate its hash code.
 *			* FINDING THE INDEX : The hash code is used to find the index of the bucket where the key-value pair is stored.
 *			* SEARCHING IN THE BUCKET : Once the correct bucket is found, it checks for the key in that bucket. If it finds the key, 
 *										it returns the associated value.
 		Note :  HashFunction takes input and provide same output and come time 2 inputs output might be same this is known as Collision.
 		
 		class Node<k, v>{
		 			final int hash: //hash code of the key
		 			final k key; //The key itself
		 			V value; //The value associated with the key.
		 			Node<K, V> next; //Pointer to the next node in case of a collision (linked list)
 			}
 			<--: HANDLING COLLISIONS :-->
 				Since different keys can generate the same index(called a collision), HashMap uses a technique to handle this situation. Java's HashMap
 				uses Linked List (or balanced trees after java 8) for this. Here Red Black tree comes when linked list is stores lots of data and that 
 				will issue while fetching data take time, So here once the threshold is reaches then the tree comes into picture. threshold is 8.
 				
 				RED BLACK TREE : Which is self balanced binary search tree. This will helps us in searching faster.
 				
 				If multiple key-value pair map to the same bucket, they are stored in a linked list inside the bucket.
 				
 				When a key-value pair is retrieved, the HashMap traverses the linked list, checking each key until it finds a match.
 				
 		EXAMPLE FOR HANDLING COLLISION :-->
 			map.put("apple", 50);
 			map.put("banana", 30);
 			map.put("orange", 80);
 			
 			Let's say "apple" and "orange" end up in the same bucket due to a hash collision. They will be stored in a linked list in that bucket.
 					Bucket5 : ("apple", 50)->("orange", 80) //This is not happens just an example as we know that the threshold is 8.
 					
 			When we do map.get("orange"), HashMap will go to Bucket 5 and then traverse the linked list to find the entry with the key "orange".
 			
 			 
 		<--: HASHMAP RESIZING (REHASHING) :-->
 			HashMap has an internal array size, which is default size is 16.
 			when the number of elements (key-value pairs) grows and exceeds a certain load factor (default is 0.75), HashMap automatically resizes the 
 			array to hold more data. This process is called rehashing.
 			NOTE :  In the HashMap() constructor we can provide the initial size of the array. and also we can give the load factor as well 
 			load factor means the elements are store till that size then the size needs to be changed. 
 			example : The default size of the array is 16, so when more than 12 elements (16 * 0.75) are inserted, the HashMap will resize as double.
 			
 			<--: DURING REHASHING :-->
 				The array size is doubled.
 			
 			1. All existing entries are rehashed (i.e., their position are recalculated) and placed into the new array.
 			2. This ensures the HashMap continues to perform efficiently even as more data is added.
 			
 			
 			<--: TIME COMPLEXITY :-->
 			HashMap provides constant time complexity O(1) performance for basic operations like put() and get() (assuming no collisions).
 			However, if there are many collisions, and many entries are stored in the same bucket, the performance can degrade to O(n), where n is the 
 			number of elements in that bucket.
 			
 			But after Java 8, if there are too many elements in a bucket, HashMap switches to a balanced tree instead of a linkedList to ensure better 
 			performance O(log n).
 */
public class Internal_Working_Of_HashMap {
	
	public static void main(String[] args) {
		//Here below initial size is 17 and once its reaches 17 * 0.50 = 8.50 then the size will resized as double of its starting given size.
		HashMap<Integer, String> std = new HashMap<>(17, 0.50f);
	}

}
