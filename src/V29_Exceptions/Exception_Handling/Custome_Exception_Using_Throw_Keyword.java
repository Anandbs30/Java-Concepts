package V29_Exceptions.Exception_Handling;

import java.io.IOException;

public class Custome_Exception_Using_Throw_Keyword {
	public static void main(String[] args) throws Exception{
		/*If you don't handle here then here as well you have to add exception type with throws keyword on method signature.
		The the jvm handle the exception and terminate the application or program
		*/
		
		try {
			method3();
		}catch(Exception e) {
			System.out.println(e);
			throw new IOException("Hey i didn't found file!!");
		}
		
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		//This will run as its an unchecked exception.
		throw new ArithmeticException();
	}
	
	public static void method3() throws IOException{
		//Here either handle issue using try catch or else add exception type with throws keyword on method signature
		method4();
	}
	
	public static void method4() throws IOException{
		//Here it is an checked exception so we need to add exception type with throws keyword on method signature. 
		throw new IOException();
	}
}
