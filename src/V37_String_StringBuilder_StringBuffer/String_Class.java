package V37_String_StringBuilder_StringBuffer;

public class String_Class {
	public static void main(String[] args) {
		//String is immutable
		String str = "Hello";
		String concat = str.concat(" World");//here we are trying to add the world after the initial string hello but thats not possible.
		//So basically if you store the above line into an variable then you will get result as Hello World as its created an new String.
		System.out.println("Original String : "+str);
		System.out.println("After concatinating and created an new string : "+concat);
		
		
		
		String result = "";
		
		for(int i = 0; i<10000;i++) {
			result += "Hello";
		}
		
		System.out.println("The final result of the string is : "+result);
	}
	
}
