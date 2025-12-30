package V12_ConditionStatementsIfElseIf;

public class Logical_Operators {
	public static void main(String[] args) {
		//If we have the more than one condition then we need to use the logical operators to get combined result.
		//There are 3 types
		
//		 1) Logical AND = &&
//		 example
		
		int marks = 35;
		int age = 18;
		System.out.println(marks >= 32 && age == 18);//this will return True as both condition True
//		 2) Logical OR = ||
		System.out.println(marks >= 32 || age == 18);//Here this will return the True as its required one true.
//		 3) Logical NOT = !
		System.out.println(!(marks >= 32 || age == 18));//This will return as False basically this will reverse the condition		
		boolean a = 2<3;//ture
		boolean b = 3<=2;//false
		
		System.out.println(a);//true
		System.out.println(b);//false
		System.out.println(a && b);//false
		System.out.println(a || b);//true
	}
}
