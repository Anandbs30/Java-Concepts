package V16_Methods_Overloading_Signature_Mutability;

public class Methods {
	
	
	public static int sumOfArray(int[] array) {
		int sum = 0;
		int len = 0;
		while(len<array.length) {
			sum += array[len];
			len++;
		}
		return sum;
	}
	
	//Here we are not using static keyword so if you want to use this one then you need to create object of the class
	private void UpperCase(String str) {
		System.out.println("The given string without spaces and change the string into Upper case : "+str.trim().toUpperCase());
	}
	
	/*
	 BASICALLY METHODS ARE USED TO STORE THE CODE WHICH IS USED REPEATEDLY
	 
	 access_Modifiers : in below Public is an access modifier mean where this method can be accessible.
	 return_Type : in below void is an return type means what is returning from this method.
	 static : is an method type static that means we can use this method in the class without crating the class object
	 method_Name : in below main is an method name
	 parameters : in below String[] args are Parameters which are covered by ()
	 */
	
	public static void main(String[] args) {
		//Example As Sum of array elements
		int[] a = {2, 4, 6, 8};
		int sum = sumOfArray(a);
		System.out.println("The sum of the array elements is : "+sum);
		int b[] = {1, 3, 5, 7, 9};
		System.out.println("The sum of the another array elemnts is : "+sumOfArray(b));
		
		
		//Creating the class object to use the UpperCase Method.
		Methods m = new Methods();
		m.UpperCase(" anand basagouda shiraganve ");
	}

}
