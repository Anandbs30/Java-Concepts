package V36_Collection_FrameWork.Java8Features;
/*
 * LAMBDAEXPRESSION : LambdaExpression is an anonymous function (no name, no return type, no access modifier)
 * 					  LambdaExpression is used to implement the Functional interface.
 * 
 * FUNCTIONAL INTERFACE : mens that interface have only one abstract method.
 * 						  Functional Interface hold the lambda Expression. EX : MathOperation sum2 = (a, b)-> a+b;
 */
public class LambdaExpression_Class {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("Hello");
		});
		
		t1.start();
		MathOperation sum = (int a, int b)->{
			return a+b;
		};
			
//		if the line of code is only one line then we can remove the {} braces and return type.
		MathOperation sum1 = (int a, int b)->a+b;
		
//		Compiler also understood that we know we can only implement the lambdaExpression on Functional where that have only one abstract method.
		//So we can also remove the permeative data type as int. 
		MathOperation sum2 = (a, b)-> a+b;
		MathOperation substract = (a, b) -> a-b;
		MathOperation multiplication = (a, b) -> a*b;
		MathOperation divide = (a, b) -> a/b;
		
		System.out.println("Sum of two elements is : "+sum2.operate(2, 6));
		System.out.println("Substraction of two elements is : "+substract.operate(2, 6));
		System.out.println("Multiplication of two elements is : "+multiplication.operate(2, 6));
		System.out.println("Divide of two elements is : "+divide.operate(6, 2));
	}		
	
}
interface MathOperation {
	int operate(int a, int b);
}