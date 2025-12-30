package V12_ConditionStatementsIfElseIf;

public class Relational_Operators {
	//Here Relational Operators compare two values and then return the boolean result (True or False)
	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		
		//We can try same thing with char, String as well
		char c = 'z';
		char d = 'a';
		System.out.println(c < d);//This will return as false as here it is compare with ascii values
		System.out.println(c + 0);//122 is not less than the 97
		System.out.println(d + 0);
		
		String str1 = "ANAND";
		String str2 = "ANAND";//Here if we compare str1 and str2 then it will return as true bcz its compares with the 
		//Reference and here in the string pool only one ANAND stored and str2 is just pointing out that.
		System.out.println(str1 == str2);//True
		String str3 = new String("ANAND");//If we compare here then it will return as fail.
		//as it is stored into heap memory with new reference and both are not match
		System.out.println(str1 == str3);//False
		System.out.println(str1.equals(str3));//True return as its here compare with the actual value
	}
}
