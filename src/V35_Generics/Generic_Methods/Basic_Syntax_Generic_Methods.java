package V35_Generics.Generic_Methods;

public class Basic_Syntax_Generic_Methods {

	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 5};
		String[] ar = {"Anand", "Kaveri", "Lalita", "Mangal", "Basagouda"};
		printArray(arr);
		printArray(ar);
	}
	
	
	//Syntax 
	//Here <T> generic type needs to be present in between the access modifier and return type other wise if you want to keep that after return type
	//and methodName will get an error.
	public <T> void methodName(T parameters) {
		//method body
	}
	
	//Example
	//Here below we are printing the array elements and type is generic means array elements type might be string or integer etc.\
	//Here we can use the multiple parameters as well.
	public static <T> void printArray(T[] arr) {
		int len = arr.length;
		int a = 0;
		for(T element : arr) {
			System.out.print(element);
			a++;
			if(len>a) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
