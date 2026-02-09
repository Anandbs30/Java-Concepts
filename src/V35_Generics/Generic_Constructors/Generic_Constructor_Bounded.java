package V35_Generics.Generic_Constructors;

public class Generic_Constructor_Bounded {
	
	//Here we are bounding the value which takes only numbers
	public <T extends Number> Generic_Constructor_Bounded(T val) {
		System.out.println(val);
	}
}
