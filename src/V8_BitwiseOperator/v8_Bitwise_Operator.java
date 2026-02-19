package V8_BitwiseOperator;


//Note : If the binary number is starts from the 0 then that is Positive 
//If the number starts with 1 then that is Negative 
public class v8_Bitwise_Operator {
	public static void main(String[] args) {
		int a = 17;
//		System.out.println("The given number "+a+" Bitweise is : "+Integer.toBinaryString(a));
		//We can able to calculate only integral numbers short, byte, int and long.
		//AND operator & : when both are 1 then only return 1 be like multiplication
		int b = 5;
		int c = a & b;
//		System.out.println(c);//Answer is 1
		//17 binary is : 10001 
		//5 binary is :  00101
		//And operator : 00001 --> finally this means 1
		
		
		//or Operator | : when any of the value is one in that row then this will return 1
		int d = a | b;
//		System.out.println(d);
		//17 binary is : 10001 
		//5 binary is :  00101
		//Or operator :  10101 --> finally this means : 21
		
		
		//xor ^ : When both rows value are different then it will return 1 otherwise 0
		int e = a ^ b;
//		System.out.println(e);
		//17 binary is : 10001 
		//5 binary is :  00101
		//xor operator : 10100 --> finally this means : 20
		
		
		//not ~ : it is used to make the given int as negative
//		int f = 5;
//		System.out.println(Integer.toBinaryString(f));
//		int g = ~f;
//		System.out.println(g);
//		System.out.println(Integer.toBinaryString(g));
		
		
		//left shift << : Its use case is used to shift its bits left side by 1
		int h = 5;
		System.out.println(Integer.toBinaryString(h));
		int i = h << 1;
		System.out.println(Integer.toBinaryString(i));
		//right shift >> : Its use case is used to shift its bits right side by 1
		int j = h >> 1;
		System.out.println(Integer.toBinaryString(j));
		//unsigned right shift >>> : In this case its leave the 2 zero at the first so its value is bcm Possitive
	}
}
