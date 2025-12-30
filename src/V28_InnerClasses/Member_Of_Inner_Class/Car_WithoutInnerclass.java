package V28_InnerClasses.Member_Of_Inner_Class;

public class Car_WithoutInnerclass {
	private String model;
	private boolean isEngineOn;
	
	public Car_WithoutInnerclass(String model_name) {
		this.model = model_name;
		this.isEngineOn = false;
	}

	public String getModel() {
		return model;
	}

	public boolean isEngineOn() {
		return isEngineOn;
	}

	public void setEngineOn(boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}
}
