package V24_Access_Modifiers.Private_AccessModifiers.Student;

public class Private_Student {
	private int age;
	private String name;
	
	/*
	 * Note : If you have marked constructor as private then you can't create its object.
       Using this we can achieve the singleton
	private Private_Student() {
		
	}
	*/
	public void sayHello() {
		System.out.println("Hey Hi Here i am "+name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Note : If you create like below then you don't need to create the object of class to access it.
	//You can access it directly like : Private_Student.sayBye();
	public static void sayBye() {
		System.out.println("Byee.....");
	}
}
