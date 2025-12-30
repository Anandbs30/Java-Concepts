package V29_Exceptions.Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_On_Method_Signature {
	/*Here we added the exception type on the method using throws keyword.
		if you add the exception type on the method using throws keyword that means wherever this method is calling from the another method that is
		responsible for handle this issue.
	*/
	public static void main(String[] args){
		/*Here i am calling the method where in the method signature added the exception type using throws keyword help.
		 So we need to handle this here using try catch block
		 If we not handle exception here as well we have added on the method signature exception type with throws key word then jvm will handle
		 this issue and terminate the program.
		 */
		try {
		FileRead_method();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void FileRead_method() throws FileNotFoundException{
		FileReader flr = new FileReader("anand.txt");
	}
}
