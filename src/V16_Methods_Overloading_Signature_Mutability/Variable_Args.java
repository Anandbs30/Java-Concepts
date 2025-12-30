package V16_Methods_Overloading_Signature_Mutability;
//Here we are passing more than two or more than that arguments then every time we need to define that.
//Example if we have 2 parameter then method for it and if more than that then will need to define another method with 3 parameters.
//To avoid this we got Variable Args concept as given below
//If we get more than 2 parameters or its changing then we can use in method as int ...a
public class Variable_Args {
	public static void main(String[] args) {
		System.out.println("Sum of the numbers : "+sumNumbers(1, 2, 3, 4, 5));
		System.out.println("Sum of the numbers : "+sumNumbers(20, 40, 60));
		
	}
	/*
	 So here below the int ...a is just treat the elements as array elements
	 or we can write int... a as well both are same
	 */
	public static int sumNumbers(int ...a) {
		int sum = 0;
		int len = 0;
		while(len<a.length) {
			sum += a[len];
			len++;
		}
		return sum;
	}
}
