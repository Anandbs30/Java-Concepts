package V13_Loops;

public class While_Loop {
	private String no;
	public While_Loop(String ab) {
		this.no = ab;
	}
	public static void main(String[] args) {
		System.out.println("While Loop");
		//Syntax
		/*
		 while(Condition){
		 	value increment or Decrement
		 }
		 */
		
		//Print Hello world 10 times using while loop
		/*int a = 0;
		while(a < 10) {
			System.out.println(a + " Hello world!!");
			a++;
		}*/
		
		//Sum of first 10 natural number
		int sum = 0;
		int b = 1;
		while(b<=10) {
			sum += b;
			b++;
		}
		System.out.println("Sum of the n natural numbers : "+sum);
		
		
		//Count digits of numbers
		int n = 232345678;
		
		int result = 0;
		while(n > 0) {
			n = n / 10;
			result++;
		}
		System.out.println("Count digits of numbers : "+result);
		
		//Factorial 
		int m =6;
		int fact = 1;
		while(m>=1) {
			fact = fact * m;
			m--;
		}
		System.out.println("Factorial is : "+fact);
	}
}
