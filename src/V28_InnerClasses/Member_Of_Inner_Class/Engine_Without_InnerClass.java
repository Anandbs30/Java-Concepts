package V28_InnerClasses.Member_Of_Inner_Class;

public class Engine_Without_InnerClass {
	/*here we can't access the Car fields or attributes directly so here we need to create object of call and need to
	pass that into the class constructor as given below.
	*/
	
	private Car_WithoutInnerclass car;
	
	public Engine_Without_InnerClass(Car_WithoutInnerclass car) {
		this.car = car;
	}
	
	void Start() {
		if(!car.isEngineOn()) {
			car.setEngineOn(true);
			System.out.println(car.getModel()+" The engine is Started!!");
		}else {
			System.out.println(car.getModel()+" The car is already started........");
		}
	}
	void Stop() {
		if(car.isEngineOn()) {
			car.setEngineOn(false);
			System.out.println(car.getModel()+" Car has been stoped!!");
		}else {
			System.out.println(car.getModel()+" The car is already stoped");
		}
	}
}
