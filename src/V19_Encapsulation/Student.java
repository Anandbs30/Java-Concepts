package V19_Encapsulation;

public class Student {
	//Class is an blueprint of the behavior and it consist the Variables 
	
	//Static we can access this one anywhere in the class or program
			public static String name1;
			
	//Non-static means we can access then by creating the class object
			public int age;
	public static void main(String[] args) {
		
		
		//Local variable we can access this within a method where we defined it
		//This below one also known as properties/field/variable
		String name;
		
		
		//This is the static variable
		name1 = "Anand";
		
		//The below one is Non-static variable we can access directly need to create class object for the access
		Student std = new Student();
		std.age = 20;
		
		System.out.println("Student name is : "+name1);
		System.out.println("Student age is : "+std.age);
		
		//Variable as 3 types
		//Static, Non-static and local variable
		
		
		
		
		
	}

}
