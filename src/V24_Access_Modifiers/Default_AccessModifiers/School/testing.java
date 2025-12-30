package V24_Access_Modifiers.Default_AccessModifiers.School;

public class testing {
	public static void main(String[] args) {
		Default_School dsc = new Default_School();
		dsc.sayBye();
		dsc.sayHi();
		dsc.age = 21;
		dsc.name = "AnandBS";
		System.out.println("My name is : "+dsc.name);
		System.out.println("My ae is : "+dsc.age	);
	}
	
	
}
