package V29_Exceptions.Errors;
/*
 Error means which is caught while compilation as given below example like you missed out to define the data type of the variable, missed to 
 add semicolon at the end of the syntax basically those are an syntax mistake errors.
 there are 3 types of error 
 1) Syntax Error : 
 2) Logical Error : 
 3) Runtime Error : 
 */
public class Error {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
//		1) Syntax Error : where we miss the adding ;(semicolon) or not defined data type of the variable 
		
//		id = 12;//this is an error where we haven't mentioned the data type of the variable.
//		int num = 21//Here i didn't provided the semicolon which is sign of the end of my syntax in java.
		

		
	}
//	2) Logical Error : Here you got task to multiply and you wrote division logic.
//	Here below the method name is saying that multiplication needs to be happen but in the print statement you wrote logic for the divide.
	public void multiplication(int a, int b) {
		System.out.println(a/b);
	}
}
