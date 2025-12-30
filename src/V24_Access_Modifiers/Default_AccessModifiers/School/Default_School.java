package V24_Access_Modifiers.Default_AccessModifiers.School;
/*
 We can't able to access these field or the method which are default access modifiers as they can access into same package.
 */
public class Default_School {
	String name;
	int age;
	
	public void sayBye() {
		System.out.println("Bye!!!");
	}
	
	//you can't access this into another package but you can access it in a same package
	static void sayHi() {
		System.out.println("Hey Hi");
	}
}
