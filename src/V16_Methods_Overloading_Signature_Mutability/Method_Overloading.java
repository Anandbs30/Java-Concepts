package V16_Methods_Overloading_Signature_Mutability;


/*
 Method Overloading concept where we are creating methods with same name and if you are using same method name and different parameters.
 That is known as the signature or we can say method name and parameter list
 */
public class Method_Overloading {
	
	//Sum of two integers
	public static void sumOfNumbers(int a, int b) {
		System.out.println("Sum of two numbers is : "+(a+b));
	}
	//Sum of three integers
		public static void sumOfNumbers(int a, int b, int c) {
			System.out.println("Sum of three numbers is : "+(a+b+c));
		}
	
	public static void main(String[] args) {
		sumOfNumbers(2, 4);
		sumOfNumbers(2, 4, 6);
	}
}
