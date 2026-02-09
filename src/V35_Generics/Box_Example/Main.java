package V35_Generics.Box_Example;
/*
 * Generic types allow us to define a class, interface or method with placeholder (type parameters) for the data type they will work with.
 * So how do we make class as generic?
 * 	- class ClassName<T>{ //Here T is type
 * 		Class Body	
 * 	  }
 */
public class Main {
	public static void main(String[] args) {
		Box b = new Box();
		b.setObject(3);
		//In the box class we haven't provided the exact data type so we can provide below anything and after some time we can create
		//mistake in the same
		String object = (String)b.getObject();
		//So here below we will get Class Casting Exception. To avoid this we can make Box class as generic
		System.out.println(object);
	}
}
