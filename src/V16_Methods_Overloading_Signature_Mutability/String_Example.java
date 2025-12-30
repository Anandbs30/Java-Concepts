package V16_Methods_Overloading_Signature_Mutability;


public class String_Example {
	public static void main(String[] args) {
		String cat = "Dogzzzzzy";
		System.out.println("Original String is : "+cat);
		System.out.println("After changing it into UpperCase : "+toUpperCase(cat));
	}
	
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
