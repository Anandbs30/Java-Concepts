package V28_InnerClasses.Member_Of_Inner_Class;

public class Main_Without_InnerClass {
	public static void main(String[] args) {
		
		//So here we have created an object of the car class and passed the name of the model
		Car_WithoutInnerclass car = new Car_WithoutInnerclass("Audi");
		//Here we created the object of the Engine class and also passed the car object.
		Engine_Without_InnerClass eng = new Engine_Without_InnerClass(car);
		//After this we are accessing the methods of the engine along with the car class attributes
		eng.Start();
		eng.Stop();
	}
}
