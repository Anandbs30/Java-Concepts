package V27_InterFaces;

public class Interface_Dog implements Interface_Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating!!");
		this.sleep();
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping!!!");
	}

}
