package V22_Polymorphism;


/*
 Basically poly means : many and morphism means : forms to in one word one method can act as multiple way
 	Polymorphism is an core concept of the OOPS(Object Oriented Programming System) that allows methods to do 
 	different things based on the object it is acting upon, even though the method name and its signature might 
 	be the same.
 	
 	In this there are two types
 	1) Compile time Polymorphism /(Method Overloading) : Using method overloading achieving the Compile time polymorphism.
 	2) Run time Polymorphism
 */

//Compile time polymorphis where a method is acts as many form thats known as polymorphism 
//And while compiling the code their decides which method needs to call.

class Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}
public class polymorphism_Main {
	
	public static void main(String[] args) {
		Calculator c =  new Calculator();
		//Here below this process is known as compile time polymorphism as here deciding 
		//which method needs to be called at the compile time
		System.out.println(c.add(1, 4));
		System.out.println(c.add(1, 4, 4));
		System.out.println(c.add(2.1, 1.2));
		
		//
		
	}

}
