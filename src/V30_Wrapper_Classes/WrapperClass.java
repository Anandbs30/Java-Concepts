package V30_Wrapper_Classes;
/*
 Note : Basically the object value is stored into the heap and primitive data type value is stored into the Stack.
 What is the Wrapper classes?
 Ans : Wraps a value of the primitive type int in an object.
 
    As we know we call the java is an object oriented programming language but if we try to access the primitive data
    type object then we can't able to access like 
    int a = 10; 
    a. //if you make a. then we need to get the methods but it can't provide any method.
    to overcome this we have the wrapper classes ex : Itegere
    example : we can write as given below : 
    Integer a = 10;
    Here a. get methods so basically int data type is wrapped into the Integer that's why we get the methods here.  
 */
public class WrapperClass {
	public static void main(String[] args) {
		int a = 10;//here a is an primitive datatype so the 10 value is stored into the stack.
//		a. ;//We can't get any method here as int is not an object its an primitive data type.
		//But we can wrap the int data type into the Integer to get methods to perform directly as given below.
		Integer b = 10;//Here b is an reference variable as Integer is an class and here 10 is stored into the heap. 
		//Here above behind the scene what happening
		Integer k = Integer.valueOf(30);
		/*
		Note : Unboxing == AutoUnboxing, Boxing == AutoBoxing 
			   Where Auto means this is Automatically managing by Java internally.
		
		 * So here we are boxing the int value into Integer class method ValueOf().
		  So the above process will done by java as b value is wrapping into Integer object this is known as Autoboxing.
		  Basically here as well primitive data int wrapping into an object so this process is known as the Boxing.
		  And the Process where we are unwrapping the object data into primitive data type thats known as Unboxing.
		  
		*/
		int bitCount = b.bitCount(b);
		System.out.println("BitCount value of b is : "+bitCount);
		
		boolean bool = true;//This will stored into stack
		Boolean boo = true;//This is stored into heap as it is an object.
		
		Float f = 1.25f;
		Double d = 1.123;
		Character c = 'A';
		Byte by = 3;
		Long l = 1234l;
		Short s = 12;
		
		
		//Deep dive
		Integer x = null;//Here it can have the null value as its an object of the Integer Class
//		int y = null;//Not possible as its an primitive data type not an object
		int z = 0;//Instead of the null it can hold Zero(0)
	
		
		//using Integer class we can easy our code like below
		//Ex : max value of the given 10 and 9
		//We have so many methods as given below examples
		int max = Integer.max(10, 9);
		System.out.println(max);
		
		String binaryValue = Integer.toBinaryString(20);
		System.out.println("Binary value of 20 is : "+binaryValue);
		
		String str = "1234";
		Integer valueOf = Integer.valueOf(str);
		System.out.println("the string value is : "+valueOf	);
	}
}
