package V10_V11_StringData_Type;
//Basically to avoid repeated code used methods
//In this case we store the repeatedly using code into a method and will call that method wherever required to perform same thing 
public class v11_String_Methods {
	public static void main(String[] args) {
		String name = "Anand";
		System.out.println(name.length());
		for(int i = 0; i<name.length();i++) {
			char c = name.charAt(i);
			System.out.println(c);
		}
		//we can fetch index values aswell
		char c = name.charAt(0);
		System.out.println("\nIndex value is : "+c);
		String name1 = "Anand";
		//In the string we don't use to compare the String as given below.
		//This will check the Object reference or address
		System.out.println(name == name1);//This will compare with the references 
		
		System.out.println(name.equals(name1));//This will actually compare the each char of the string
		//if we change in the string as lower and upper case then also we get false using above .equals method
		String name2 = "anand";
		System.out.println(name.equals(name2));
		//So we use below and here we are ignoring the case sensitivity
		System.out.println(name.equalsIgnoreCase(name2));
		
		//CompareTo() method here it will compare with the string each char ascii value with another String each char ascii value 
		String a = "Nothing";
		String b = "NothiNg";
		//So here it will provide an value 
		System.out.println('N'+0);//here we were added +0 to char to print the ascii value of the char
		System.out.println('n'+0);
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		
		//We also have Case ignore into CopareTo() method
		int compareToIgnoreCase = a.compareToIgnoreCase(b);
		System.out.println(compareToIgnoreCase);//If string is matching then it will return zero(0)
		
		//Substring of a String ? == Substring is a part of the Given String
		String full_name = "Anand Basagouda Shiraganve";
		String sub = full_name.substring(6);
		System.out.println("Begings with : "+sub);
		
		String sub1 = full_name.substring(0, 5);
		System.out.println("Start and end with : "+sub1);
		
		//Trim method to remove the spaces from front side and end side
		String t = "      Anand      ";
		String trim = t.trim();//This method is used basically in the form filling
		System.out.println(trim);
		
		//ToLowerCase and ToUpperCase
		String an = "ANANDBS";
		System.out.println(an.toLowerCase());
//		System.out.println(an.toLowerCase(null));
		
		//Contains
		String and = "AnandBS";
		System.out.println(and.contains("S"));
		
		System.out.println(and.startsWith("A"));
		System.out.println(and.endsWith("S"));
		String empty = "";
		System.out.println(empty.isEmpty());//Space also considered as not empty
	}
}
