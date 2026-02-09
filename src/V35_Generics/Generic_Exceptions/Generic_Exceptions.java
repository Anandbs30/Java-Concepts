package V35_Generics.Generic_Exceptions;
/*
 * An Exception is an event that occurs the during the execution of the program that disrupts its normal flow.
 * Exceptions are represent by classes, and they can be caught and handled using try-catch blocks.
 * Java allows us to define our own exceptions by extending the Exception class or any of its sub classes. 
 * 
 * However, when it comes to making exception generic, things get a bit more complicated due to the nature of java's 
 * type erasure and restrictions on generic. 
 */


/*
 * Java does not support generic exceptions due to type erasure. Type erasure means that generic type information is removed at runtime. Since exceptions
 * are closely tied to runtime operations(like catching them in try-catch blocks), having generic exceptions wouldn't works as expected. For example, if
 * you had an exception like MyGenericException<T>, you wouldn't be able to catch it with a specific type parameter because that type information would 
 * be erased at runtime.
 */

//Generic Class syntax
class Generic_Class<T>{
	
}

/* Generic class with Exception, Here below syntax is not possible 
   as per the error msg The generic class Generic_With_Exception<T> may not subclass java.lang.Throwable
   And also JVM throw an exception while runtime as we know after compilation the compiler removes the Generic type information and here JVM needs exact type
   to create the exception object
 * 
 */
/*
 * class Generic_With_Exception<T> extends Exception{
 * 
 * }
 */

//Custom Exception Class Syntax, Here below we are not getting an Error.

class Custom_Exception extends Exception{
	
}

public class Generic_Exceptions {

}

//Work around ? Ans : Here we have to create type specific classes to handle the Exception 
//as given below here we have created 2 classes to handle String and Integer type exceptions and using Super class method as message which print message 

class StringProcessingException extends Exception{
	public StringProcessingException(String message) {
		super(message);
	}
}

class IntegerProcessingException extends Exception{
	public IntegerProcessingException(String message) {
		super(message);
	}
}

//We can't able to handle Exception by making class as Generic but we can make Constructor generic with exception and handle exception.

class MyExceptionMain{
	public static void main(String[] args) {
		try {
			throw new MyException(30);
		} catch (MyException e) {
			System.out.println("Caught Exception : "+e.getMessage());
		}
		
		try {
			throw new MyException("AnandBS");
		} catch (MyException e) {
			System.out.println("Caught Exception : "+e.getMessage());
		}
	}
}

class MyException extends Exception{
	public <T> MyException(T value) {
		super("Exception related to value : "+value.toString()+
				" of type : "+value.getClass().getName());
	}
}
