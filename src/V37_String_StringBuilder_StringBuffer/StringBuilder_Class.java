package V37_String_StringBuilder_StringBuffer;

public class StringBuilder_Class {
	public static void main(String[] args) {
		//StringBuilder is an class where we can modify the initial string without creating a new object.
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println("After inserting a value into existing string : "+sb);
		
		sb.insert(1, "Java");
		System.out.println("After inserting 1 index value as java then sb becomes : "+sb);
		
		sb.replace(1, 3, "World");
		System.out.println("After replacing the value at strt index is 1 and end index is 3 with World : "+sb);
		
		sb.delete(1, 4);
		System.out.println("After deleting the value from index 1 to 4 : "+sb);
		
		StringBuilder reverse = sb.reverse();
		System.out.println("Reversed string is : "+reverse);
		
		char charAt = sb.charAt(0);
		System.out.println("sb Char from index 0 is : "+charAt);
		
		int length = sb.length();
		System.out.println("The length of the string builder is : "+length);
		
		String substring = sb.substring(1, 4);
		System.out.println("Substring from index 1 to 4 is : "+substring);
		
		
		/*
		 * Internal working of the STRINGBUILDER is : 
		 * STRINGBUILDER is have an internal charArray and which have default size is 16, Once the initial capacity full 16/16 then the capacity is doubles.
		 * So basically internally create another charArray with default size of the 16 and older charArray elements and capacity merged with this. 
		 * This is mutable means we can modify the String without creating its new object.
		 * Method chaining will be applicable.
		 * This is not thread safe.
		 */
		
		//Method Chaining : So below each method once its done there operation then they will return the reference due to this we can make Method Chaining.
		sb.append(" Anand").reverse().replace(2, 4, "Nothing").reverse();
	}
}
