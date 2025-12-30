package V25_Static_Keyword;

public class Student1 {
	private static int id;
	private static String name;
	private static int age;
	//We can set the default values for the fields
	public static int pocketMoney = 100;
	
	static {
		System.out.println("Well come to the school Student1");
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student1.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Student1.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Student1.age = age;
	}
	
}
