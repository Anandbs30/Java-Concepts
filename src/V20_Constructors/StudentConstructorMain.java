package V20_Constructors;

public class StudentConstructorMain {
	public static void main(String[] args) {
		StudentConstructor defaultConstructor = new StudentConstructor();
		System.out.println("Default constructor with setted default values in the default constructor : ");
		//Through this we get the default values of data types.
		//Default constructor we can set the default values as well
		
		System.out.println(defaultConstructor.getId());
		System.out.println(defaultConstructor.getName());
		System.out.println(defaultConstructor.getLastName());
		
//		we can also set the values for the fields
		System.out.println("\nDefault constructor with setted default values using setter method : ");
		defaultConstructor.setId(12);
		defaultConstructor.setName("Satish");
		defaultConstructor.setLastName("Kamate");
		System.out.println(defaultConstructor.getId());
		System.out.println(defaultConstructor.getName());
		System.out.println(defaultConstructor.getLastName());
	
		//Now we are using parameterized constructor.
		//If we use the parameterized constructor then default constructor not work.
		System.out.println("\nParameterized constructor values : ");
		StudentConstructor parameterizedConstructor = new StudentConstructor("Kaveri", "B Shiraganve", 21);
		System.out.println(parameterizedConstructor.getName());
		System.out.println(parameterizedConstructor.getLastName());
		System.out.println(parameterizedConstructor.getId());
		
//		we can also set the values for the fields
		System.out.println("\nParameterized constructor with setted values using setter method : ");
		parameterizedConstructor.setId(12);
		parameterizedConstructor.setName("Satish");
		parameterizedConstructor.setLastName("Kamate");
		System.out.println(parameterizedConstructor.getName());
		System.out.println(parameterizedConstructor.getLastName());
		System.out.println(parameterizedConstructor.getId());
		

	}

}
