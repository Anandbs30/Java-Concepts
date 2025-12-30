package V7_Airthmatic_Operators;

public class v7_OperatorPrecidence {
	public static void main(String[] args) {
		//division and multiplication have higher precision but bracket () have more than these
		int a = 20 / 4 + 3 * 6 + (20 - 2);
		System.out.println(a);
		
		//Increment 
		int b = 3;
		//pre increment means here we are adding value and printing value
		b = b+1;
		System.out.println(b);
		b += 1;
		System.out.println(b);
		b++;
		System.out.println(b+"\n");
		
		//Decrement
		int c = 5;
		c = c - 1;
		System.out.println(c);
		c -= 1;
		System.out.println(c);
		c--;
		System.out.println(c);
		
		//post-increment and pre-increment
		
		//In the below firstly e assigned value as d and then d got incremented by 1
		//POST_INCREMENT
		int d = 12;
		int e = d++;
		System.out.println("\n"+d);
		System.out.println(e);

		//In the below firstly f value is getting incremented by 1 and then assigning its values to the g.
		//So both of these values are same.
		//PRE-INCREMENT
		int f = 30;
		int g = ++f;
		System.out.println("\n"+f);
		System.out.println(g);
		
		//In the below firstly e assigned value as d and then d got decremented by 1
		//POST_INCREMENT
		int d1 = 12;
		int e1 = d1--;
		System.out.println("\n"+d1);
		System.out.println(e1);

		//In the below firstly f value is getting decremented by 1 and then assigning its values to the g.
		//So both of these values are same.
		//PRE-INCREMENT
		int f1 = 30;
		int g1 = --f1;
		System.out.println("\n"+f1);
		System.out.println(g1);
	}
}
