package V36_Collection_FrameWork.Collection_Interface.List.CopyOnArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example_With_MultiThreading {
	public static void main(String[] args) {
		
		//Through the below will get an error as ConcurrentModificationException as we know array list required a stable list to perform the task, but here
		//while reading itself in the same ArrayList we are modifying the list As well so we are getting above mention error as ConcurrentModificationException.
		System.out.println("Trying to multitasking using the ArrayList : ");
		List<String> sharedList = new ArrayList<>();
		sharedList.add("Item1");
		sharedList.add("Item2");
		sharedList.add("Item3");
		
		Thread readerThread = new Thread(()->{
			try {
				while(true) {
					for(String item : sharedList) {
						System.out.println("Reading items : "+item);
						Thread.sleep(200);	
					}
				}
			} catch (Exception e) {
				System.out.println("Exception in reader thread : "+e);
			}
		});
		
		Thread writerThread = new Thread(()->{
			try {
				//Here adding the new element into the List.
				Thread.sleep(1000);
				sharedList.add("Item4");
				System.out.println("Added new item to the list.");
				
				//Here removing the Item1 from the list.
				Thread.sleep(1000);
				sharedList.remove("Item1");
				System.out.println("Removed Item1 from the list.");
				
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		});
		
		readerThread.start();
		writerThread.start();
		
		//instead of the ArrayList if We use the CopyOnWriteArrayList then we don't get the error.
		System.out.println("Trying the above same thing using CopyOnWriteArrayList : ");
		List<String> sharedList1 = new CopyOnWriteArrayList<>();
		sharedList1.add("CopyOnWriteArrayListItem1");
		sharedList1.add("CopyOnWriteArrayListItem2");
		sharedList1.add("CopyOnWriteArrayListItem3");
		
		Thread readerThread1 = new Thread(()->{
			try {
				while(true) {
					for(String item : sharedList1) {
						System.out.println("Reading items : "+item);
						Thread.sleep(2000);	
					}
				}
			} catch (Exception e) {
				System.out.println("Exception in reader thread : "+e);
			}
		});
		
		Thread writerThread1 = new Thread(()->{
			try {
				//Here adding the new element into the List.
				Thread.sleep(5000);
				sharedList1.add("CopyOnWriteArrayListItem4");
				System.out.println("Added new CopyOnWriteArrayListitem to the list.");
				
				//Here removing the Item1 from the list.
				Thread.sleep(5000);
				sharedList1.remove("CopyOnWriteArrayListItem1");
				System.out.println("Removed CopyOnWriteArrayListItem1 from the list.");
				
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		});
		
		readerThread1.start();
		writerThread1.start();
	}
}
