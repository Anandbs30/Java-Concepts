package V5_V6_DataTypes;
//NOTE : Each 1 byte = 8 bites.
public class v5_dataTypesCapacityInBites {
	public static void main(String[] args) {
		int a = 10;//Capacity to store 4 bytes means 4 * 8 = 32 bites.
		long b = a;//Here we can store the int value into long type as long have high capacity of 8 bytes 8 * 8 = 64
		float c = b;//We can also store into float as well, Java automatically convert int to float ans : 10.0
		
		System.out.println("Value of the int a is : "+a);
		System.out.println("Value of the long b is : "+b);
		System.out.println("Value of the float c is : "+c);
		
		//But we can't store float values into int and long
		float d = 2.07f;
		int e = (int)d;//here we get an error as needed type cast if you want to store then type casting is needed
		//Through the type casting we can store value into int data type with loss as .07 is the loss here
		
		System.out.println("Value of the float d is : "+d);
		System.out.println("Value of the type casted int e with data loss value is : "+e);
		float  f = d-e;
		System.out.println("Loss value is : "+f);
		
		char g = 'a';
		int h = g;
		float i = h;
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}
