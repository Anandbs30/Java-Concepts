package V28_InnerClasses.Member_Of_Inner_Class;

import V28_InnerClasses.Member_Of_Inner_Class.Member_Of_Inner_Class_Car.Engine;

public class Member_Of_Inner_Class_Main {
	public static void main(String[] args) {
		Member_Of_Inner_Class_Car car = new  Member_Of_Inner_Class_Car("Tata Punch");
		Member_Of_Inner_Class_Car.Engine engine = car.new Engine();	
		engine.start();
		engine.stop();
	}
}
