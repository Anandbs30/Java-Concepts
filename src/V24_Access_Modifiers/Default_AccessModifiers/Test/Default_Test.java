package V24_Access_Modifiers.Default_AccessModifiers.Test;

import V24_Access_Modifiers.Default_AccessModifiers.School.Default_School;

public class Default_Test {
	public static void main(String[] args) {
		Default_School dsc = new Default_School();
		//Here we can't access the field as its an default access modifiers so we can't access them into other package
//		dsc.age();
//		dsc.name();
		
		//We can access this one as it is public method
		dsc.sayBye();
//		dsc.sayHi();
	}
}
