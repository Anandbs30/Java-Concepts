package V36_Collection_FrameWork.Map_Interface.EnumMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/*
 * EnumMap is directly implements the Map interface.
 */
public class Enum_Map_Class {
	public static void main(String[] args) {
		/*HERE MAP IS WORKING FINE THEN WHY ENUMMAP IS COMES INTO PICTURE?
			ANS : IF ALL THE KEYS IN A MAP ARE VALUES FROM A SINGLE ENUM, THEN WE HAVE TO USE ENUMMAP AS THE SPECIFIC IMPLEMENTATION.
				  AN ENUMMAP, WHICH HAS THE ADVANTAGE OF KNOWING ALL POSSIBLE KEYS IN ADVANCE, IS MORE EFFICIENT COMPARED TO OTHER IMPLEMENTATIONS, AS IT CAN
				  USE A SIMPLE ARRAY AS ITS DATA STRUCTURE.
				  
			AS WE KNOW HASHMAP REQUIRES THE RESIZE BUT IN ENUMMAP WE HAVE TO PROVIDE ENUMMAP AND THE ENUM CLASS THAT WILL STORE EASILY.
		*/
		Map<Day, String> map = new HashMap<>();
		
		Map<Day, String> map1 = new EnumMap<>(Day.class);
		
		//here the explanation : below whenever we use put method and the key as Day.TUESDAY, value as Running then there is no HashCode generates its automatic
		//bond with the enum TUESDAY index so here as we know enum internally uses an array thats index here it uses.
		//Here order is maintained as you in the order of storage same it will display
		//Here array size is same as enum , no hashing, ordinal/index is used.
		//This is faster than the HashMap as here hashing is no happening, memory efficient.
		map1.put(Day.TUESDAY, "Running");
		map1.put(Day.MONDAY, "Swimming");
		System.out.println("To find the index value of the TUESDAY : "+Day.TUESDAY.ordinal());//output : 1
		System.out.println(map1);
	}
}

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
