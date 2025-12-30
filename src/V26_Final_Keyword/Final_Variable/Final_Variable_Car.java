package V26_Final_Keyword.Final_Variable;

public class Final_Variable_Car {
	//here below we stated that the maxSpeed is final that means we can't change the maxSpeed value where we use this.
	//But we can provide maxSpeed as 120 below once its setted then we can modify this one.
	//Not : if we stating a variable as final then we need to initialize with a value otherwise will get error
	private final int maxSpeed = 80;
	
	/*
	 example if we are not defining any value for the variable newMaxSpeed then we can set value using static block
	 as given below
	 
	 private static final int newMaxSpeed;
	 static{
	 newMaxSpeed = 120;
	 }
	 
	 OR we can initialize value using constructor as well
	 public Final_Variable_Car(){
	 	newMaxSpeed = 180;
	 }
	 
	 */
	private int speed = 20;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate(int newspeed) {
		if(newspeed<maxSpeed) {
			System.out.println("The car new given speed is : "+newspeed);
		}else if(speed<=maxSpeed){
			speed += newspeed;
			System.out.println("The car current speed is : "+speed+" more than the maxspeed");
		}else{
			System.out.println("The given speed : "+newspeed+" is more than the maxSpeed");
		}
	}
}
