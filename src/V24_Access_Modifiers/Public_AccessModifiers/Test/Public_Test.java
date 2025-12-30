package V24_Access_Modifiers.Public_AccessModifiers.Test;
import V24_Access_Modifiers.Public_AccessModifiers.School.Public_Student;

public class Public_Test {
	public static void main(String[] args) {
		Public_Student std = new Public_Student();
		
		//Public access modifiers where we can access the fields, methods or classes, Constructor
		std.age = 12;
		std.name = "AnandBS";
		System.out.println("Student name is : "+std.name);
		System.out.println("Student age is : "+std.age);
		//Also we can access the methods which are public
		std.sayHello();
	}
}
