package V23_Abstraction;

public class Abstraction_Main {
	public static void main(String[] args) {
		/*
		 Here we unable to create the Abstract_Animal class object directly as it is an Abstract class and have the
		 Abstract methods
		 
		 if you want to create then you have to define abstract methods body as well 
		 Note : BUT WE CAN TAKE REFERENCE AS GIVEN BELOW
		 */
//		Abstraction_Animal aa = new Abstraction_Animal();
		
		//Taking reference of the Abstraction_Animal class to create the object of the dog
		Abstraction_Animal dog = new Abstraction_Dog();
		dog.sayHello();
		dog.sleep();
		
	}
}
