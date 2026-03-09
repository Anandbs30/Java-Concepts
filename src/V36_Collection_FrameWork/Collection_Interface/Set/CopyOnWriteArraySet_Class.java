package V36_Collection_FrameWork.Collection_Interface.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_Class {
	public static void main(String[] args) {
		//Thread safe
		//Copy-On_Write mechanism : if we perform any add or remove operations then internally Array create its copy to perform.
		//Duplicates are not allowed.
		//Iterators Do not reflect modifications.
		//CopyOnWriteArraySet is used when read is happens high and write is low then we can use this, as we know at write or update operation this
		//will create an copy of the internal array. So consider if high write is there then multiple copies of the internal array will be created
		//through this we get issue of the memory consumption issue.
		
		//If we have to perform concurrent read and write then we can use the ConcurrentSkipListSet.
		CopyOnWriteArraySet<Integer> cowas = new CopyOnWriteArraySet<>();
		ConcurrentSkipListSet<Integer> csls = new ConcurrentSkipListSet<>();
		
		//adding 5 elements into both
		for(int i = 1;i<=5;i++) {
			cowas.add(i);
			csls.add(i);
		}
		
		System.out.println("The CopyOnWriteArraySet elements : "+cowas);//The CopyOnWriteArraySet elements : [1, 2, 3, 4, 5]
		System.out.println("The ConcurrentSkipListSet elements : "+csls);//The ConcurrentSkipListSet elements : [1, 2, 3, 4, 5]
		
		System.out.println("Iterating and Modifying the CopyOnWriteArraySet elements : ");
		for(Integer i : cowas) {
			//Here below before or after printing elements attempting to modify the set during iteration.
			cowas.add(9);
			System.out.println("Reading from CopyOnWriteArraySet : "+i);//This will print till 5 only as above line is working on copy of the array.
			cowas.add(7);
		}
		
		System.out.println("The CopyOnWriteArraySet elements : "+cowas);
		System.out.println("-------------------------------------------------------------------------------\n");
		
		//The ConcurrentSkipListSet is also called as weakly consistent
		System.out.println("Iterating and Modifying the ConcurrentSkipListSet elements : ");
		for(Integer i : csls) {
			//Here below before or after printing elements attempting to modify the set during iteration.
			csls.add(9);
			//in this below line this will print 9 and 7 as well. Some time its print some time not so this is called weakly consistent.
			System.out.println("Reading from CopyOnWriteArraySet : "+i);
			csls.add(7);
		}
		
		System.out.println("The CopyOnWriteArraySet elements : "+csls);
	}
}
