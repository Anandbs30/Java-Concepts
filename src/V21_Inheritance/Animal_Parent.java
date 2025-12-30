package V21_Inheritance;

public class Animal_Parent {
	
	private String name;
	private int age;
	
	public Animal_Parent() {
		System.out.println("This is Animal_Parent Class");
	}
	
	public Animal_Parent(int age, String name) {
		this.age = age;
		this.name= name;
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
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Vegiterian");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayHello1() {
		System.out.println("Hello I am Animal");
	}
}
