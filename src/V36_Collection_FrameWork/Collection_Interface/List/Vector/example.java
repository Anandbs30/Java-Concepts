package V36_Collection_FrameWork.Collection_Interface.List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class example {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		ArrayList<Integer> list = new ArrayList<>();
		Thread t1 = new Thread(()->{
			for(int i = 0 ; i<1000;i++) {
				list.add(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0 ; i<1000;i++) {
				list.add(i);
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
		
		System.out.println("Size of list where we are using the ArrayList : "+list.size());//expected result is : 2000.
		
		
		Vector<Integer> list1 = new Vector<>();
		Thread t3 = new Thread(()->{
			for(int i = 0 ; i<1000;i++) {
				list1.add(i);
			}
		});
		
		Thread t4 = new Thread(()->{
			for(int i = 0 ; i<1000;i++) {
				list1.add(i);
			}
		});
		
		t3.start();
		t4.start();
		
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Size of list where we are using the Vector : "+list1.size());//expected result is : 2000.
	}
}
