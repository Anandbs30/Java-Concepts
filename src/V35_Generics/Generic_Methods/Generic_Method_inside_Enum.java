package V35_Generics.Generic_Methods;

enum Operations{
	ADD, SUBSTRACT, MULTIPLY, DIVIDE;
	
	public <T extends Number> double apply(T a, T b) {
			switch(this) {
			case ADD : 
				return a.doubleValue() + b.doubleValue();
			case SUBSTRACT : 
				return a.doubleValue() - b.doubleValue();
			case MULTIPLY : 
				return a.doubleValue() * b.doubleValue();
			case DIVIDE : 
				return a.doubleValue() / b.doubleValue();
			default : 
				throw new AssertionError("Unknow operation : "+this);
			}
	}
}

public class Generic_Method_inside_Enum {
	public static void main(String[] args) {
		double sum = Operations.ADD.apply(12, 30);
		System.out.println("Sum of two numbers is : "+sum);
		double sub = Operations.SUBSTRACT.apply(12, 30);
		System.out.println("Sum of two numbers is : "+sub);
		double multi = Operations.MULTIPLY.apply(12, 30);
		System.out.println("Sum of two numbers is : "+multi);
		double div = Operations.DIVIDE.apply(12, 30);
		System.out.println("Sum of two numbers is : "+div);
	}
}
