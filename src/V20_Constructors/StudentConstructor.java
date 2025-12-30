package V20_Constructors;
//Note Constructor by default return nothing means it is permanently void
public class StudentConstructor {
	private String name;
	private String lastName;
	private int id;
	
	//By default here is an constructor like below
	public StudentConstructor() {
		
	}
	
	//Using default constructor we can also set the default values as well as given below.
	//If you not set any value for the fields then the below values are reflect.
//	public StudentConstructor() {
//		name = "Anand";
//		lastName = "Shiraganve";
//		id = 30;
//	}
	//If you create parameterized constructor then you can't use default constructor without creating.
	public StudentConstructor(String name, String lastName, int id) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
