package V7_Airthmatic_Operators;

public class v7_OperatorPrecidence {
	public static void main(String[] args) {
		//division and multiplication have higher precision but bracket () have more than these
		int a = 20 / 4 + 3 * 6 + (20 - 2);
		System.out.println(a);//output : 41
		
		//Increment 
		int b = 3;
		//pre increment means here we are adding value and printing value
		b = b+1;
		System.out.println(b);//output : 4
		b += 1;
		System.out.println(b);//output : 5
		b++;
		System.out.println(b+"\n");//output : 6
		
		//Decrement
		int c = 5;
		c = c - 1;
		System.out.println(c);//output : 4
		c -= 1;
		System.out.println(c);//output : 3
		c--;
		System.out.println(c);//output : 2
		
		//post-increment and pre-increment
		
		//In the below firstly e assigned value as d and then d got incremented by 1
		//POST_INCREMENT
		int d = 12;
		int e = d++;
		System.out.println("\n"+d);//output : 13
		System.out.println(e);//output : 12

		//In the below firstly f value is getting incremented by 1 and then assigning its values to the g.
		//So both of these values are same.
		//PRE-INCREMENT
		int f = 30;
		int g = ++f;
		System.out.println("\n"+f);//output : 31
		System.out.println(g);//output : 31
		
		//In the below firstly e assigned value as d and then d got decremented by 1
		//POST_INCREMENT
		int d1 = 12;
		int e1 = d1--;
		System.out.println("\n"+d1);//output : 11
		System.out.println(e1);//output : 12

		//In the below firstly f value is getting decremented by 1 and then assigning its values to the g.
		//So both of these values are same.
		//PRE-INCREMENT
		int f1 = 30;
		int g1 = --f1;
		System.out.println("\n"+f1);//output : 29
		System.out.println(g1);//output : 29
	}
}
