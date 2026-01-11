package V32_Enums;

public enum Week_days {
	//The below defined week days are the instances of the Week_days
	//Note : Here if we write anythong method, fields defining and etc after the Listing of Enums if you write first fields or 
	//method then that will provide you an compile time error.
	//We can define constructor here
	SUNDAY("Sunday", "Nothing today"), 
	MONDAY("Monday", "Nothing today as well"), 
	TUESDAY("Tuesday","2Nothing today as well"), 
	WEDNESDAY("Wednesday", "3Nothing today as well"), 
	THURSDAY("Thursday","4Nothing today as well"), 
	FRIDAY("Friday","5Nothing today as well"), 
	SATURDAY("Saturday","6Nothing today as well");
	
	private Week_days(String lower_case) {
		System.out.println("Calling constructor of the enum!!");
		this.lower = lower_case;
	}
	
	private Week_days(String lower_case, String statement) {
		System.out.println("Calling constructor of the enum!!");
		this.lower = lower_case;
		this.statement = statement;
	}
	//Defining the field
	private String lower;
	private String statement;
	
	
	
	public String getLower() {
		return lower;
	}
	public String getStatement() {
		return statement;
	}
	

	
	//We can customize the constructor and enums as well
	



	//Before creating the method add semicolon in above to tell jvm that listing is over
	public void display() {
		 System.out.println("Today day is : "+this.name());
	}
}

/*
 While compiling the above code become as given below and the below indexing is added through the compiler if we change above then thats index got changes :
 public final class Week_days extends java.lang.Enum<Week_days>{
	public static final Week_days SUNDAY = new Week_days("SUNDAY", 0); 
 	public static final Week_days MONDAY = new Week_days("MONDAY", 1);
	public static final Week_days TUESDAY = new Week_days("TUESDAY", 2);
	public static final Week_days WEDNESDAY = new Week_days("WEDNESDAY", 3);
	public static final Week_days THURSDAY = new Week_days("THURSDAY", 4);
	public static final Week_days FRIDAY = new Week_days("FRIDAY", 5);
	public static final Week_days SATURDAY = new Week_days("SATURDAY", 6);
 	private static final Week_days[] values = {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
 	private Week_days(String name, int ordinal){
 	   super(name, ordinal);
 	   }
 	public static Week_days[] values(){
 		return VALUES.clone();
 	}
 	public static Week_days vlaueOf(String name){
 		for(Week_days day : VALUES){
 			if(day.name().equals(name)){
 				return day;
 			}
 		}
 		throw new IllegalArgumentException("No enum constant "+ name);
 	}
 	}
 */
