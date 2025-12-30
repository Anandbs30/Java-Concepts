package V27_InterFaces;

public interface Interface_Animal {
	
	/*
	 Note : Here the variable are by default public, static and they are final as well so we don't need to write.
	 */
	
	int max_Age = 150;
	
	public abstract void eat();
	
	/* Here below don't need to write the public access modifier and abstract keyword.
	as we writing inside the interface by default access modifier is public and keyword as abstract.
	You can think like those are optional
	*/
	
	void sleep();
	
	/*
	 In java 8 introduced that is interface can consist the default methods and static methods
	 Why static methods are introduced?
	 Ans : To get the info regarding the interface, If we have some constants related to the our application then
	 we can set them using interface and static methods can be accessible through only interface where it is written 
	 */
	
	//Static methods in java 
	static void interface_Info() {
		System.out.println("this is an Animal interface");
	}
	
	/*
	 What is default method here : it is an concrete method(Complete method). 
	 Why Default methods in java?
	 Ans : To add something into instance without breaking anything of the implemented class.
	 */
	
	//The below can possible after java 9 Note this one
	private void Singing() {
		System.out.println("Animal can sing");
	}
	default void running() {
		Singing();
		//We can also here call the methods which are defined into the implemented class as given below which method
		//Calls based on the object
		this.eat();
		
		System.out.println("The animal is running........");
	}
	
	/*
	 In default method we can provide the arguments as well
	 */
	default void calculation(int ...a) {
		System.out.println("The sum of the given number is : ");
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum += a[i];
		}
		System.out.println("The sum of the given number is : "+sum);
	}
}
