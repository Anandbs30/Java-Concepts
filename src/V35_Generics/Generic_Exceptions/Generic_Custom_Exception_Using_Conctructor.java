package V35_Generics.Generic_Exceptions;


//We can handle exception using below methodology. 
public class Generic_Custom_Exception_Using_Conctructor {
	public static void main(String[] args) {
		try {
			throw new Custom_Generic_Exception(12);
		} catch (Custom_Generic_Exception e) {
			System.out.println("Exception caught : "+e.getMessage());
		}
	}
}

class Custom_Generic_Exception extends Exception{
	public <T> Custom_Generic_Exception(T val) {
		super("Exception related val : "+val.toString()+" type is : "+val.getClass().getName());
	}
}
