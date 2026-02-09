package V35_Generics.Generic_Constructors;
/*
 * So here We are making the Constructor as Generic and here we are not making class as generic.
 */
public class Generic_Constructor {
	//Here making constructor as generic without class as generic. 
	public <T> Generic_Constructor(T value) {
		System.out.println(value);
	}
	
	
}
