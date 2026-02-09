package V35_Generics.Problem_Without_Generics;

import java.util.ArrayList;
//Mainly highlighted issue is Type Safety Issue, Manual casting and No Compile time checking. 
public class Without_Generics {
	public static void main(String[] args) {
		//Here in the below array we have to provide the number which indicate the array size and it is fixed after creation we can't
		//Change it.
		int[] array = new int[5];
		//So here we have stored multiple data types data, Here we don't need to provide any ArrayList size as its dynamic, if its becomes
		//fill then automatically increase the size.
		//Row Type ArrayList Syntax
		ArrayList list = new ArrayList();
		list.add("Anand");
		list.add(30);
		list.add('A');
		list.add(3.9);
		
		/*
		 * for(int i = 0; i<list.size();i++) { System.out.print(list.get(i));
		 * if(list.size()-1>i) { System.out.print(", "); } }
		 */
		
		//Fetching the stored data from ArrayList
		Object object = list.get(0);//initially it provide an reference as Object as we are storing multiple data type data
		//if you you know exactly which data type is stored into that then we have to make type casting.
		//Here this means programmer is storing anything and as well as fetching anything from the arrayList where it is not Type Safe
		String str = (String) list.get(0);
		System.out.println("fetching arraylist data from the object reference : "+object + "\nAnd using str with typecasting : "+str);
		
		//here we know that the in the index 1 we have integer but we are making type casting as String and while compilation we are not
		//getting any error but will get an error while runtime as exception So this is not type safe.
		Object object2 = list.get(1);
		String in = (String)list.get(1);
	}
}
