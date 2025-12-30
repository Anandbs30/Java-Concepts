package V10_V11_StringData_Type;

public class v10_String_Data_Type {
	public static void main(String[] args) {
		//Primitive data type
		int a = 10;//Wherever the memory location is allocated for the a in that the 10 as values stored
		//Non-primitive data
		//Where it is create an new object by referring an class and store the value into that newly created object memory
		//The memory is allocated into the heap memory
		
		//String variable can be created in two ways
		//By referring its class
		String name = new String("Anand");
		System.out.println(name);
		
		//Also we can create as we create the primitive data direct value(or its called literal)
		String name1 = "AnandBS";
		System.out.println(name1);
		
		//here String n = new String("Kavu"); and String m = new String("Kavu"); are not same 
		String n = new String("Kavu");
		String m = new String("Kavu");
		System.out.println(n == m);//here we get output as false bcz its provide the object address and they are differenct 
		
		String n1 = "Mangal";
		String m1 = "Mangal";
		System.out.println(n1 == m1);//Here we get output as True as its comparing with the value not object address
		
		String v = "Nothing";//This will store into a string pool
		String w = new String("Nothing");//This w and x are stored Nothing into a heap memory with different address 
		String x = new String(v);
		String y = "Nothing";//This will point out the previous String pool data
		String z = "Nothing";//This will point out the previous String pool data
		System.out.println("\n");
		System.out.println(v == w);//false
		System.out.println(v == x);//false
		System.out.println(w == x);//false
		System.out.println(v == y);//True
		System.out.println(v == z);//True
	}
}
