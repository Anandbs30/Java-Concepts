package V24_Access_Modifiers.Protected_AccessModifiers.Dog;

import V24_Access_Modifiers.Protected_AccessModifiers.Animal.Protected_Dog_samePackage;

public class Protected_Test {
	public static void main(String[] args) {
		Protected_Dog_samePackage dog = new Protected_Dog_samePackage("Bob");
		dog.makeSound();
		dog.setDogSound("Woof");
		dog.makeSound();
//		dog.changeSound("Woofjns");//we can't access this method here as its not a sub class and same package
	}
}
