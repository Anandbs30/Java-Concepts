package V21_Inheritance;

//Instead of writing same thing we can use the inheritance concept.
//here to get same fields using extrends Animal_Parent class
public class Dog_Child extends Animal_Parent{
	
	
	//This Dog also have same fields like Animal_Parent class
//	private String name;
//	private int age;
	
	private String nickName;
	
	public Dog_Child() {
		//The super needs to be first 
		super();
		System.out.println("This is Dog_Child class");
		//we can add below here super, we get an error
//Error/issue		super(age, name);
	}
	
	public Dog_Child(int age, String name) {
		super(age, name);
		System.out.println("This is parameterized constructor of Dog_Child class ");
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void eat() {
		System.out.println("Non-Vegiterian!!");
	}
	
	public void sayHello1() {
		System.out.println("Helo I am Dog");
	}
}
