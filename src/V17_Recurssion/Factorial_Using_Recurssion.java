package V17_Recurssion;


public class Factorial_Using_Recurssion {
	
	public static int factorial_Recurssion(int a) {
			if(a == 0 || a == 1) {
				return 1;
			}
			return a * factorial_Recurssion(a-1);
	}
	public static void main(String[] args) {
		System.out.println("The factorial number of 5 using recurssion : "+factorial_Recurssion(5));
	}
}
