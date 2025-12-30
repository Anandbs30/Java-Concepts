package V29_Exceptions.Errors;

public class Runtime_Error {
	/*The below program will give us Arithmetic exception and stop the loop there only as here 30/0 happened then its infinite we know but java
	don't have any value to show case this. So due to this reason we get an exception as Arithmetic Exception while runtime and loop will stop.
	*/
	public static void main(String[] args) {
		int[] arr = {10, 100, 200, 30, 40};
		int[] arr1 = {2, 5, 100, 0, 40};
		for(int i = 0; i < arr.length;i++) {
			System.out.println(divide(arr[i], arr1[i]));
		}
		System.out.println("Good job.");
	}
		public static int divide(int a, int b) {
			return a/b;
		}
}
