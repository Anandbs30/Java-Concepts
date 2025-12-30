package V28_InnerClasses.Anonymous_Inner_Class;

import javax.annotation.processing.Generated;

public class Anonymous_Main_Class {
	public static void main(String[] args) {
		Shopping_Cart sc = new Shopping_Cart(5000, "Debit Card");
		//So here we are able to set the CreditCard name and processing the payment through the implement class as we created separately.
//		sc.processPayment(new CreditCard("Debit Card"));
		
		
		//So here Anonymous class helps us to process the payment without creating the impl class separately.
		//Instead of creating impl class and use that object we can implement method here itself Thats known as the Anonymous class.
		/*
		String Payment_method = "Debit card";
		sc.processPayment(new Payment() {
//			private String Payment_method;
			//Option : 1
//			{
//				Payment_method = "Credit Card";
//			}
			
			@Override
			public void pay(double amount) {
				System.out.println("The payment has been done for the amount : "+amount+" Through the : "+Payment_method);
				
			}
		});*/
		
		//Option : 3
		sc.processPayment(new Payment() {
			
			@Override
			public void pay(double amount, String payment_method) {
				// TODO Auto-generated method stub
				System.out.println("Amount paid of amount : "+amount+" using : "+payment_method+" method");
			}
			
			@Override
			public void pay(double amount) {
				System.out.println("Amount paid of amount : "+amount);
			}
		});
	}
}	
