package V29_Exceptions.Exception_Handling;
/*
 The Exception handling is an way to handle the runtime errors so that the normal flow of the program /application can be maintained
 */
public class Exception_Handling {
	public static void main(String[] args) {
		int[] a = {100, 200, 300, 400, 500};
		int[] b = {5, 10, 15, 0, 25};
		for(int i = 0; i<a.length;i++ ) {
			System.out.println(Divide(a[i], b[i]));
		}
		System.out.println("The task has been completed!!");
	}
	/*As given below we can write inside a try block we can write multiple catch block but we need to follow the hierarchy as child first
	and then parent otherwise parent will catch the exception and handle it but child not work so if you write exception class as parent 
	first and then child while compilation you will get an error as showing the parent will handle the exception then child exception class 
	is not required
	*/
	public static int Divide(int a, int b) {
		try {
			return a/b;
		}catch(ArithmeticException e) {
			System.out.println("The issue is : "+e);
			return -1;
		}
		//we can write as given below as well but the classes needs to be in the same level means all are child not child and parent.
		catch(NullPointerException | IndexOutOfBoundsException | IllegalArgumentException e) {
			System.out.println(e.getMessage()+" and "+e.getCause());
			return -1;
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
			return -1;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
