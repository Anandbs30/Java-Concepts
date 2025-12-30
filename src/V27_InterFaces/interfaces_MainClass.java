package V27_InterFaces;
/*
 What is class : Blue print for the object
 what is interface : Blue print for the class
 In interface this consist only abstract method(mean method without body)
 Also consist the Static constants
 also consist default methods also this can consist private method
 also it consist the static methods
 Concrete methods means : which are ready to use.(Means which are consist the both declaration and definition)
 */
public class interfaces_MainClass {
	/*
	 Interfaces use cases 1) For Multiple inheritance and 2) To achieve abstraction
	 Note : We can't create object of the Interface bcz its doesn't consist the implementation.
	 Also it don't have constructor
	 */
	public static void main(String[] args) {
		Interface_Dog idog = new Interface_Dog();
		idog.eat();
		idog.sleep();
		System.out.println();
		Interface_Cat icat = new Interface_Cat();
		icat.eat();
		icat.sleep();
		
		/*
		 Note : here we can access the field or variable directly as they are attached with the interface 
		 because they are by default static.
		 and also we can access directly max_age from Dog and Cat classes as they are implementing that interface
		 */
		System.out.println(Interface_Animal.max_Age);
		System.out.println(Interface_Dog.max_Age);
		System.out.println(Interface_Cat.max_Age);
		
//		Interface_Animal.interface_Info();
		//we can't able to access the interface_info using implementation class
//		Interface_Dog.interface_Info();//not accessible
		
		//Here below we are calling the Running default method of the interface using implemented class
		
//		Interface_Animal.running();//We can't able to call this as it's not static and neither abstract method.	  
		
		idog.running();
		icat.running();
		
		icat.calculation(1, 3, 5, 7, 9);
	}
}
