package V36_Collection_FrameWork.Java8Features;

import java.util.Arrays;
import java.util.List;

//Use method without invoking & in place of lambda expression.	
public class Method_Reference_Class {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda");
		
		//Normal forEach loop
		for (String names : list) {
			System.out.println(names);
		}
		
		//initially we written using lambda expression as given below
		list.forEach(lm -> System.out.println("Names using lambda expression : "+lm));
		
		//To make short of the above we have to use the method reference
		
		list.forEach(System.out::print);
	}
}
