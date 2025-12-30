package V12_ConditionStatementsIfElseIf;

import java.util.Scanner;

//Using Relational and Logical operator here we are performing the Conditional statement check
public class Conditional_Statement {
	public static void main(String[] args) {
//		System.out.println("Using given age data checking the prson is adult or not");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age to check adult or not");
//		int age = sc.nextInt();
//		if(age>=18) {
//			System.out.println("You are adult");
//		}else {
//			System.out.println("You are child");
//		}
		
		//Q2 person have age 20 and he needs to pass exam by gathering the 33 marks out of the 100
		//If its match both age and marks factor then print Congratulations otherwise better luck next time
		/*int ag = 20;
		int marks = 34;
		if(ag <= 20 && marks>=33) {
			System.out.println("Congratulations!!");
		}else {
			if(ag>20) {
				System.out.println("Your age is more than 20 years");
			}
			else if(marks < 33) {
				System.out.println("Marks are below passing criteria of 33");
			}
			System.out.println("Better luck!!");
		}*/

//The below concept is know as if else ladder		
		//Q3 Grade based on the marks
		/*
		 * int m = 90; if(m >= 90) { System.out.println("Grade A"); }else if(m >= 75) {
		 * System.out.println("Grade B"); }else if(m >= 60) {
		 * System.out.println("Grade C"); }else { System.out.println("Grade D"); }
		 */
		
		//Q4 Print week days based on the input number 
		System.out.println("Enter a number withing 1 to 7 to print week days : ");
		int a = sc.nextInt();
//		if(a >=1 && a<=7) {
//			if(a == 1) {
//				System.out.println("Monday");
//			}
//			else if(a == 2) {
//				System.out.println("Tuesday");
//			}
//			else if(a == 3) {
//				System.out.println("Wednesday");
//			}else if(a == 4) {
//				System.out.println("Thursday");
//			}else if(a == 5) {
//				System.out.println("Friday");
//			}else if(a == 6) {
//				System.out.println("Saturday");
//			}else if(a == 7) {
//				System.out.println("Sunday");
//			}
//		}else {
//			System.out.println("Invalid Input!! \nPlease try again and Enter within 1 to 7 number");
//		}
		
//Difference between multiple else if(if else ladder) vs Switch case
		//ANS : basically in the else if where all the cases are check and if condition is satisfied the it will execute
		//But in the switch case that will directly pass to the particularly condition directly based on the case
		//And in the ladder or if else case if the condition is satisfied then that block will executes and break automatically
		//But in the Switch case we need to add the Break key word to break the condition otherwise it will print all conditions
		//Until that gets the Break
		
		//Same thing using Switch case
		switch(a) {
		case 1 : {
			System.out.println("Monday");
			break;
		}
		case 2 : {
			System.out.println("Tuesday");
			break;
		}
		case 3 : {
			System.out.println("Wednesday");
			break;
		}
		case 4 : {
			System.out.println("Thursday");
			break;
		}
		case 5 : {
			System.out.println("Friday");
			break;
		}
		case 6 : {
			System.out.println("Saturday");
			break;
		}
		case 7 : {
			System.out.println("Sunday");
			break;
		}
		default : 
			System.out.println("Invalid Input!! \nPlease try again and Enter within 1 to 7 number");
		}
		//NOTE : We can use switch case on String after java 7 versions
		//We can use the switch case given data types : byte, short, int, char, String, Enum(onstunts)
	}
}
