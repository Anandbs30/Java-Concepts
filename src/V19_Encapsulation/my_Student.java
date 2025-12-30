package V19_Encapsulation;

public class my_Student {
	
	//Here below we are set field as private that means you can't set or get values from these fields.
	//Instead of direct accessing the you can access using below get and set methods 
	private int rollNumber;
	private String name;
	private int age;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber<=0) {
			rollNumber = 0;
			System.out.println("Invalid rollNumber");
		}
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=0) {
			age = 0;
			System.out.println("Invalid age");
		}
		this.age = age;
	}
	
}
