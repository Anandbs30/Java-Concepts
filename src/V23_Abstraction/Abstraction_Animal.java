package V23_Abstraction;
/*
 Abstraction : Hiding internal Details
 Example : We have AC or TV remote if you want to change the channel or ac mode then you need to press button.
 Using that button reference the task will be perform but you don't know actually what is the internal functionality is
 going on
 
 Here the normal class can't have the abstract method so due to this reason we have added the abstract on class. 
 */
public abstract class Abstraction_Animal {
	
	
	//if we define an abstract method then also we need to specify the class as abstract
	//We need to add the abstract in between the method access modifier and return type of the method.  
	public abstract void sayHello();
	
	//The below is an concrete method mean that have the body and what that method is do is defined.
	public  void sleep() {
		System.out.println("ZZZZZZZZZZZZZZzzzzzzzz");
	}
}
