package V35_Generics.BoundedTypeParameters;
/*
 * Here below we are bounding the Generic with a particular super class by extending it or which needs to implement with an Interface.
 * Here in the below generic we have used Number class which is Super class of the Integer, Double, Float and Long etc which are Extends this class.
 * This statement states that this particular Bounded_Box class object will store only numbers.
 * Which might be float, Int, double or long.  
 * Here below on T we can Apply multiple Constraints.
 * 
 */
public class Bounded_Box<T extends Number> {
	private T value;
	
	public void setValue(T val) {
		this.value = val;
	}
	
	public T getValue() {
		return value;
	}
}
