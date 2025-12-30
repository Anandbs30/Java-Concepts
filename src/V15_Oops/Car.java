package V15_Oops;

public class Car {
	//Example as car
		String color;
		
		String brand;
		
		String model;
		
		int year;
		
		int speed;
		
		//Here below defining the methods means the behavior
		public void accelerate(int increment) {
			speed += increment;
			System.out.println(speed);
		}
		
		public void breake(int decrement) {
			speed -= decrement;
			if(speed<0) {
				speed = 0;
			}
			System.out.println(speed);
		}
}
