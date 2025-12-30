package V29_Exceptions.Exception_Handling;

public class FInally_KeyWord {
	public static void main(String[] args) {
		System.out.println(Divide(4, 0));
	}
	
	//The finally keyword used where you want to handle exception as well as you want to print something other than the exception
	//Also we can write the try catch block inside finally block
	public static int Divide(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			return -1;
		}
		//Here the output will be like Arithmetic Exception and below statement
		//So the finally block will execute whether try execute or catch this will execute in both cases. 
		finally {
			System.out.println("I don't know about program Execution");
		}
	}
}
