package V36_Collection_FrameWork.Map_Interface.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class Example_HashTableand_HashMap {
	public static void main(String[] args) {
		//HashTable all methods are synchronized as its allow only one thread to perform the task.
		Hashtable<Integer, String> hashMap = new Hashtable<>();
		
		Thread t1 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				hashMap.put(i, "Thread1");
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 1000;i<2000;i++) {
				hashMap.put(i, "Thread1");
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//The output is varying at every run as its not thread safe.
		//as we need output as 2000 if you need this then replace the HashMap to HashTable.
		//After replacing the HashMap by HashTable we get the result or output as 2000 as its synchronized(ThreadSafe)
		System.out.println("The final size of the map is : "+hashMap.size());
	}
}
