package V24_Access_Modifiers.Private_AccessModifiers.Test;

import V24_Access_Modifiers.Private_AccessModifiers.Student.Private_Student;

public class Private_Test {
	public static void main(String[] args) {
		/*
		 This is private access modifiers where we can access the method, class, fields and constructor inside the created class only
		 Otherwise if we defined the fields as private then we need to add getters and setters to access them.
		 If we make the constructor as private then we can't create the object of that class.
		 If we defined methods as private then we can't access those methods.
		 */
		Private_Student privateStd = new Private_Student();
		privateStd.setAge(21);
		privateStd.setName("ANANDBS The king");
		System.out.println();
		System.out.println();
		privateStd.sayHello();
		Private_Student.sayBye();
		
		
		
		//Singleton object checking
		Private_School.getInstance();
		System.out.println(Private_School.getInstance());
		System.out.println(Private_School.getInstance());
		System.out.println(Private_School.getInstance());
		System.out.println(Private_School.getInstance());
		System.out.println(Private_School.getInstance());
		System.out.println(Private_School.getInstance());
		
	}
}
