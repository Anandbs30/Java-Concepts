package V28_InnerClasses.Member_Of_Inner_Class;

/*
 Here below the engine class is behaving as member of the car(Outer class).
 */
public class Member_Of_Inner_Class_Car {
	private String model;
	private boolean isEngineOn;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isEngineOn() {
		return isEngineOn;
	}

	public void setEngineOn(boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}

	public Member_Of_Inner_Class_Car(String model_name) {
		this.model = model_name;
		this.isEngineOn = false;
	}
	
	class Engine{
		void start() {
			if(!isEngineOn) {
				isEngineOn = true;
				System.out.println(model+" is started!!!!");
			}else {
				System.out.println(model+" is already started!!");
			}
		}
		void stop() {
			if(isEngineOn) {
				isEngineOn = false;
				System.out.println(model+" is engine is stopped.....");
			}else {
				System.out.println(model+" is already stopped<<<<");
			}
		}
	}
}
