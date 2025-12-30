package V29_Exceptions.Exception_Handling.Custome_Exception_Class;
/*
 * We can create custom exception class
 */
public class Custome_Exception_class {
	public static void main(String[] args) {
		Bank_Account account = new Bank_Account(30);
		try {
			account.withdraw(39);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
