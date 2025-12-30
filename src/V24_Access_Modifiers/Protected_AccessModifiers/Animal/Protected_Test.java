package V24_Access_Modifiers.Protected_AccessModifiers.Animal;

public class Protected_Test {
	public static void main(String[] args) {
		Protected_Dog_samePackage dog = new Protected_Dog_samePackage("Bob");
		dog.makeSound();
		dog.setDogSound("Woof");
		dog.makeSound();
		dog.changeSound("Woofjns");
		dog.makeSound();
	}
}
