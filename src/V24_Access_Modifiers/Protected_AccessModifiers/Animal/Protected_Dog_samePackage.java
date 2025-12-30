package V24_Access_Modifiers.Protected_AccessModifiers.Animal;

public class Protected_Dog_samePackage extends Protected_Animal{

	public Protected_Dog_samePackage(String name) {
		super(name, "Bark");//This will call first
	}
	
	public void wagTail() {
		System.out.println(getName()+" is wagging its tail.....");
	}

	private String getName() {
		return getClass().getSimpleName();//This will return the class name 
	}
	
	public void setDogSound(String newSound) {
		this.sound = newSound;
	}
}
