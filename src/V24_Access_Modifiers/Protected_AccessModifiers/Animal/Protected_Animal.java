package V24_Access_Modifiers.Protected_AccessModifiers.Animal;

public class Protected_Animal {
	private String name;
	protected String sound;
	
	//Constructor with the Parameters
	
	public Protected_Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void makeSound() {
		System.out.println(name +" makes a sound : "+sound);
	}
	
	protected void changeSound(String newSound) {
		this.sound = newSound;
	}
}
