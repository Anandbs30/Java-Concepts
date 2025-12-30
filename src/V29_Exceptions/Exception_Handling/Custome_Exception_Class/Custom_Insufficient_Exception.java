package V29_Exceptions.Exception_Handling.Custome_Exception_Class;

public class Custom_Insufficient_Exception extends RuntimeException{
	public Custom_Insufficient_Exception() {
		super("You don't have money in your account which you entered here!!!");
	}
}
