package V5_V6_DataTypes;

public class v5_PremitiveDataTypes {
	public static void main(String[] args) {
		
		//The below are Integral numbers or Whole numbers
		System.out.println("Learning Premitive Data Types in java");
		byte a = -128;//This will store only -128 to 127
		System.out.println("The minimum value of the byte is : "+Byte.MIN_VALUE);
		System.out.println("The maximum value of the byte is : "+Byte.MAX_VALUE);
		
		short b = -32768;//This will store only -32768 to 32767
		System.out.println("The minimum value of the short is : "+Short.MIN_VALUE);
		System.out.println("The maximum value of the short is : "+Short.MAX_VALUE);
		
		
		int c = -2147483648;//This will store only -2147483648 to 2147483647
		System.out.println("The minimum value of the int is : "+Integer.MIN_VALUE);
		System.out.println("The maximum value of the int is : "+Integer.MAX_VALUE);
		
		long d = -9223372036854775808l;//This will store only -9223372036854775808 to 9223372036854775807 
		//Also here we need to specify the given integer is Long bcz by default the java consider as Integer and through the error.
		System.out.println("The minimum value of the long is : "+Long.MIN_VALUE);
		System.out.println("The maximum value of the long is : "+Long.MAX_VALUE);
		
		//The below are Decimal numbers 
		float e = 0.23f;//This will store 1.4E-45 to 3.4028235E38 and also here need to specify that it is float value
		//Because by default java reads as or considered as double
		System.out.println("The minimum value of the Float is : "+Float.MIN_VALUE);
		System.out.println("The maximum value of the Float is : "+Float.MAX_VALUE);
		
		double f = 3.4028235E38;//This will store the 4.9E-324 to 1.7976931348623157E308
		System.out.println("The minimum value of the Double is : "+Double.MIN_VALUE);
		System.out.println("The maximum value of the Double is : "+Double.MAX_VALUE);
		
		char g = 'A';//This will store single digit or char or special character like $ # and 
		//that needs to enclosed by '' single cots
		//Every char have significantly bonded with the integer to get that need to add type casting
		//The character min value is : 0 and max value is : 65535
		System.out.println("The character is : "+g);
		System.out.println("Every char have significantly bonded with the integer and for the given char integer is : "+(int)g);
		System.out.println("The minimum value of the Character is : "+(int) Character.MIN_VALUE);
		System.out.println("The maximum value of the Character is : "+(int) Character.MAX_VALUE);
		char heart = 10084;//Through the numerical
		System.out.println(heart+ " Symbol");
		char j = '\u2325';//By hex decimal //0,1,2,3,4,5,6,7,8,9, A,B,C,D,E and F
		System.out.println(j);
		//Aschy value is sub set of the unicode
		
		//Print vlaues from 0 to 127
//		for(int i = 0; i<128;i++) {
//			System.out.println((char)i);
//		}
		
		//Boolean true or false
		
		boolean k = false;
		System.out.println(k);
		
		}
}
