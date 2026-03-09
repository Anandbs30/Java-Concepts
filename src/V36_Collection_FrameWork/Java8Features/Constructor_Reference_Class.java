package V36_Collection_FrameWork.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constructor_Reference_Class {
	public static void main(String[] args) {
		List<String> brandNames = Arrays.asList("Samsung", "Nokia", "Apple", "MI", "Oppo");
		
		//using lambda expression
		List<Mobiles> collect = brandNames.stream().map(x -> new Mobiles(x)).collect(Collectors.toList());
		
		System.out.println(collect.get(4).names);
		
		//Now we are exploring how to use the constructor reference.
		//Mobiles::new here Mobiles means class name and :: is reference and new is refers to the constructor of the Mobiles class. 
		List<Mobiles> collect2 = brandNames.stream().map(Mobiles::new).collect(Collectors.toList());
		System.out.println(collect2.get(0).names);
	}
}
class Mobiles{
	String names;
	
	public Mobiles(String mn) {
		this.names = mn;
	}
}