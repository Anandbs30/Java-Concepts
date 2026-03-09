package V36_Collection_FrameWork.Map_Interface.HashMap;

public class HashMap_Collision {
	public static void main(String[] args) {
		
		//The below out put is same for both are same but the input string is different this is known as collision.
		System.out.println(simple_Hash("nan"));//output is : 7
		System.out.println(simple_Hash("ann"));//output is : 7
	}
	
	public static int simple_Hash(String key) {
		int sum = 0;
		for(char c : key.toCharArray()) {
			sum += (int) c;
		}
		return sum % 10;
	}
/*
| Operation            | Average-Case Time Complexity | Worst-Case Time Complexity | Explanation                                                                                                                                                                      |
| -------------------- | ---------------------------- | -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| put(key, value)      | O(1)                         | O(log n)                   | Inserts a key-value pair. Average: Constant time due to direct bucket access. Worst-Case: O(log n) when bucket converts to a Red-Black Tree after exceeding collision threshold. |
| get(key)             | O(1)                         | O(log n)                   | Retrieves the value associated with a key. Average: Constant time via direct bucket access. Worst-Case: O(log n) when searching within a treeified bucket.                       |
| remove(key)          | O(1)                         | O(log n)                   | Removes the key-value pair associated with a key. Average: Constant time with direct access. Worst-Case: O(log n) when removing from a treeified bucket.                         |
| containsKey(key)     | O(1)                         | O(log n)                   | Checks if a key exists in the map. Average: Constant time via direct bucket access. Worst-Case: O(log n) when searching within a treeified bucket.                               |
| containsValue(value) | O(n)                         | O(n)                       | Checks if a value exists in the map. Both average and worst-case are linear time since it may need to traverse all entries.                                                      |
| size()               | O(1)                         | O(1)                       | Returns the number of key-value pairs. Both average and worst-case are constant time as the size is maintained as a separate field.                                              |

*/
}
