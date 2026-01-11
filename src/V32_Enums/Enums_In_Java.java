package V32_Enums;

import java.time.temporal.WeekFields;

/*
 What are Enums?
 Ans : Enums are Basically Enumeration in that we are listing the things, If a string is required repeatedly then will use the enums to store constants.
 Instant of creating or printing every time a single thing here will store those into a class and use them repeatedly.
 */
public class Enums_In_Java {
	
	//Here also we can create Enum
	public enum months{
		//provide here Months jan to dec
	}
	public static void main(String[] args) {
		System.out.println("USing class print friday : "+Day_Class.FRIDAY);
		
		//Here we can create the interface as well
		System.out.println("Using interface print tuesday : "+Day_Class_Interface.TUESDAY);
		
		//we have another way to do same thing which is direct creating the Enum in this we need to provide values by comma separated
		System.out.println("Using Enum to print thursday : "+Week_days.THURSDAY);
		
	
		Week_days saturday = Week_days.SATURDAY;
		//we can fetch the index of SATURDAY as well using method ordinal
		System.out.println("The index where SATURDAY is stored on enum : "+saturday.ordinal());
		
		
		//If you want the name in lower case then
		System.out.println("The SATURDAY in lower case : "+saturday.name().toLowerCase());
		
		//To check given string is present or not then use valueOf() method
		
//		System.out.println(Week_days.valueOf("ANAND"));//This will give Exception if String value is not present then.
		
		//To get all enums use the vlaues() method
		Week_days[] values = Week_days.values();
		for(Week_days val : values) {
			System.out.println(val);
		}
		
		//We can create a method inside Enum 
		
		Week_days days = Week_days.FRIDAY;
		days.display();
		
		Week_days week = Week_days.THURSDAY;
		
		//To print day in lower case just generate the getter method for the field inside Week_days enum
		System.out.println("Given day inside lower case : "+week.getLower());
		
		//calling customized constructor
		
		System.out.println("Custome constructor : "+week.getStatement());
	}
}
