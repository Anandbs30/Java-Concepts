package V35_Generics.Enums_In_Generics;


/*
 * Enums are by default Type safe.
 */
enum Day{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
public class Enums_in_generics {
	public static void main(String[] args) {
		Day day = Day.Monday;
		System.out.println(day);
		
		//We can't provide String here as it only accept enums. Due to this reason we will get an error.
//		Day d = "Monday";
	}
}
