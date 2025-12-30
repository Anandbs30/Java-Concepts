package V28_InnerClasses.Anonymous_Inner_Class;

public class Shopping_Cart {
	private double total_Amount;
	private String payment_method;

	public Shopping_Cart(double total_Amount, String method) {
		this.total_Amount = total_Amount;
		this.payment_method = method;
	}
	
	
	/*Her in the method parameters we are using the reference of the Payment Interface.
   	  As we know we can't create the object of the interface but we can take reference of the interface Payment.
	  And here the processPayment method which accept the Payment object and then pay the total amount.
	*/
	public void processPayment(Payment payment_Method) {
		payment_Method.pay(total_Amount);
		payment_Method.pay(total_Amount, payment_method);
	}
	
}
