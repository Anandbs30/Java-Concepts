package V36_Collection_FrameWork.Map_Interface.HashMap;

import java.util.HashMap;

/*
 * Suppose we want to store information about the number of fruits in a store.
 * Here's below what we want to store : 
 * 		FRUIT				QUANTITY
 * 		Apple				   50
 * 		Banana				   30
 * 		Orange				   80
 * 		Grape				   20 
 * 
 */
public class HashMap_Example {
	public static void main(String[] args) {
		//We'll create HashMap to store these key-value pairs (fruit names as keys and quantity's as values).
		HashMap<String, Integer> fruits = new HashMap<>();
		//Lets add the key-value pairs one by one
		fruits.put("Apple", 50);
		/*
		 * 							<--: INTERNAL PROCESS :-->
		 * 			The key "Apple" is hashed using its hashCode(). Let's assume "Apple" generates a hashCode of 10832233 (This is jut an example value).
		 * 			
		 * 			The hashCode is used to calculate the index in the internal array (bucket array). Let's say the array size is initially 16.
		 * 
		 * 				index = hashCode % arraySize;
		 * 				
		 * 				index = 10832233 % 16 = 9;
		 * 
		 * 			This means the "Apple" will be stored in bucket 9.
		 */
		
		fruits.put("Banana", 30);
		//index = 13942244 % 16 = 4;
		
		fruits.put("Orange", 80);
		//index = 19332414 % 16 = 14;
		
		fruits.put("Grape", 20);
		//index = 548734 % 16 = 14;
		
		/*
		 * So in the above "Orange" and "Grapes" index is 14 Since "Orange" is already in bucket 14, The HashMap handles the collision by adding "Grape" to
		 * to the linkedList in bucket 14.
		 * 
		 * Now, bucket 14 contains two entries: ("Orange", 80) and ("Grape", 20).
		 */
		
		
		/*
		 * 							<<-->> THE FINAL OUTCOME INTERNALLY IS <<-->>
		 * 
		 * 			** HashMap Structure (Array of Buckets, size: 16)

							Index | Bucket (Key-Value Pairs)
							------------------------------------------------------------
							
							  0   |
							  1   |
							  2   |
							  3   |
							  4   | ("Banana", 30)
							  5   |
							  6   |
							  7   |
							  8   |
							  9   | ("Apple", 50)
							 10   |
							 11   |
							 12   |
							 13   |
							 14   | ("Orange", 80) -> ("Grape", 20)   // Collision: stored in a linked list After java 8 Once the threshold 8 is reaches
							 		Then treefication happens.
							 15   |

		 */
		
		//Now we are fetching the "Grape", Here if the "Orange" and "Grape" is stored into a array index 14 as we know there HashCode is same and in that 
		//index 14 have an linkedList which stores the different index inside it. So here if we use the fruits.get("Grapes"); then internally it's used
		//.equals method to check the given key String is matching with the 14 index linked list String key. if yes then this will fetch the it's value.
		
		System.out.println(fruits.get("Grape"));
	}
}




