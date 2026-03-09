package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkeDeque_Class {
	
	public static void main(String[] args) {
		//Non-Blocking, Thread-Safe and Double-ended queue.
		//Uses the Compare and Swap method.
		//This will work in multi-threaded environment.
		
		ConcurrentLinkedDeque<String> cldq = new ConcurrentLinkedDeque<>();
		cldq.add("Element 1");
		cldq.addFirst("Element 0");
		cldq.add("Element 2");
		System.out.println(cldq);
		
		
		String removeFirst = cldq.removeFirst();
		System.out.println("Removed first element : "+removeFirst);
		String removeLast = cldq.removeLast();
		System.out.println("Removed last element : "+removeLast);
		System.out.println(cldq);
		
	}

}
