package V25_Static_Keyword;
/*
 In java static keyword is mainly used for the memory management : means?
 means if you defined any field or method as static then you don't need to create class object to access that.
 You can access method or fields directly
 we can apply static keyword on classes, fields(variables), blocks, nested classes and methods
 Note : The static method can not use non-static data members or call non-static method directly.
 Note : this and super cannot be used in static context, Because as we know this refers current object 
 and super refers parent class object but static is directly attached with the class.
 */
public class Static_Keyword {
	public static void main(String[] args) {
		Student std = new Student();
		std.name = "Anand";//This one i am accessing directly because its public
		//The below fields are private so we are setting values through the setter method.
		std.setId(30);
		std.setAge(21);
		
		System.out.println("My name is : "+std.name);
		System.out.println("My id is : "+std.getId());
		System.out.println("My age is : "+std.getAge());
		System.out.println("My pocket money is : "+std.pocketMoney);
		
		//But here i want to access these without creating object
		//In the Student1 class we defined fields using static keyword so we can access them without creating class
		//Object.
		System.out.println("\nPrinting static keyword student1 class fields values : \n");
		Student1.setId(12);
		Student1.setAge(30);
		Student1.setName("AnandBS");
		
		
		System.out.println("My id is : "+Student1.getId()+
						   "\nMy name is : "+Student1.getName()+
						   "\nMy age is : "+Student1.getAge()+
						   //The below field value is directly accessible as we set initially.
						   "\nMy pocket money is : "+Student1.pocketMoney);
	}
}
