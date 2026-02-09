package V35_Generics.Array_List_With_Generics;

import java.util.ArrayList;

public class Array_List_String {
	public static void main(String[] args) {
		
		//If we mention the data type here as given below String then we can add Only String type data into the ArrayList.
		//Below is an String type ArrayList. Here String type inside <> is known as Generic Type ArrayList Syntax
		ArrayList<String> arr = new ArrayList<>();
		
		
		arr.add("Anand");
		arr.add("Kaveri");
		arr.add("Mangal");
		arr.add("Basagouda");
		arr.add("Lalita");
		
		//To print only using index number then we need to use below
		String string = arr.get(3);
		System.out.println(string);
		int i = 0;
		for(String str : arr) {
			System.out.print(str);
			if(arr.size()-1>i) {
				System.out.print(", ");
				i++;
			}
		}
		System.out.println();
		
		System.out.println(arr.get(2).length());
	}
}
