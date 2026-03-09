package V36_Collection_FrameWork.Map_Interface.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/*
 * ConcurrentHashMap is extends the AbstractMap class and again AbstractMap is implements the Map interface.
 * ConcurrentHashMap also implements the ConcurrentMap interface and again ConcurrentMap interface is extends the Map interface. 
 */
public class ConcurrentHashMap_Class {
	public static void main(String[] args) {
		/* SEGMENT MEANS SMALL SMALL PARTS. 1 SEGMENT IS 1 SMALLER HASHMAP. Every segment have its own lock.
		 * In java 7 version the ConcurrentHashMap will work based on the segment locking, by default 16 segments and those are smaller HashMaps
		 * 
		 * NOTE : ONLY THE SEGMENT BEING WRITTEN TO OR READ FROM IS LOCKED
		 * 
		 *  IF WE TALK ABOUT THE PERTICULAR READ METHOD THEN : 
		 *  READ : IT DO NOT REQUIRED LOCKING UNLESS THERE IS A WRITE OPERATION HAPPENING ON THE SAME SEGMENT.
		 *  WRITE : IT REQUIRED WHILE WRITE OR UPDATE.
		 *  
		 *  
		 *  
		 *  JAVA 8 --> THE SEGMENTATION CONCEPT IS REMOVED AND ADDED COMPARE-AND-SWAP APPROACH. NO LOCKING ON READ METHODS.
		 *  		   WHY SEGMENTATION CONCEPT IS REMOVED IN JAVA 8?
		 *  		   ANS : AS WE KNOW THIS MAKES 16 SMALLER HASHMAPS IF OUR HASHMAP IS BIGGER THEN WE HAVE TO WAIT MEANS IF YOU WANT TO UPDATES 4 TO 5 SEGMENTS 
		 *  				 VALUES UPDATE THEN YOU HAVE TO WAIT.
		 *  		   AS PER THE RULE THIS IS NOT SCALABLE DUE TO THIS SEGMENTATION APPROACH HAS BEEN REMOVED.
		 *  	WHAT IS THE COMPARE-AND-SWAP? 
		 *  	ANS : HERE IN THIS THERE IS NO LOCKING BUT HAVE LOCKING WHILE RESIZING OF THE HASHMAP AND COLLISION
		 *  	
		 *  	WHY LOCKING HAPPENS IN RESIZING AND COLLISION?
		 *  	ANS : COLLISION : HERE WE ARE PLAYING WITH THE LINKEDLIST SO HERE THE THINGS ARE COMPLEX SO LOCKING IS REQUIRED MEANS APPLIED ON A PERTICULAR BUCKET.
		 *  		  RESIZING : ONCE THE LIMIT IS REACHED THEN AS PER THE GIVEN CONDITION RESIZE IS HAPPENS. HERE RESIZE HAPPENS INCREMENTALY.
		 *  					 LIKE WE HAVE INITIALLY 16 AND ITS BECOME FULL THEN ADDED ANOTHER 16 + 1 = 17 BUT AFTER ADDING 1 BUCKET IF TWO THREADS ARE COMES
		 *  					 TRY TO HOLD THAT THERE FOR LOCKING HERE IS ALSO MUST REQUIRED.
		 *  
		 *  		How COMPARE-AND-SWAP is works?
		 *  		ANS : EXAMPLE Thread1 have to saw last value of x. x = 42;
		 *  					  Thread1 got an work to update the x value as x = 50;
		 *  					  So here Thread1 firstly check while getting work as update x value in between this is any other thread modified or not.
		 *  					  if x value is still 42 then it will change or update it to the 50 otherwise it will just retry.
		 *  					  if you get question here like Thread1 retry and saw the x value again and then get update work after this while working if same
		 *  					  thing happens like some other thread made c value as 45, like this loop is going on then the thread will wait.
		 *  					  if thread is continuously failing then thread will wait for some time.
		 *  
		 *			COMPARE-AND-SWAP example of PUT method : you have started put method then after hashcode generation will get an index you want to store value.
		 *													 but as we know COMPARE-AND-SWAP happens so initially check the index is free or not if free inserts
		 *													 otherwise retry again. same thing happens in the update method as well.
		 */
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
	}
}
