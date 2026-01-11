package V31_Math_Method;

/*
 This math class is used to calculate the square, max, min and sum etc which are related to the maths
 */

public class Math_Methods {
	//Initially we use to return the max value through the if condition
	public static int maxNumber(int a, int b) {
		if(a<b) {
			return b;
		}else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		System.out.println("The max number between x and y is : "+maxNumber(x, y));
		 
		//We can use Math.max Math class max method then that will also return same and here we don't need to create separate method.
		System.out.println("The max number between x and y is : "+Math.max(x, y));
		//Like above we can fetch the minimum number as well and etc 
		System.out.println("The min number between x and y is : "+Math.min(x, y));
		
		//If we have and -ve number and we want as positive then we have to multiply with -ve but Math have method abs this will do same
		int z = -30;
		
		System.out.println("Possitive number of -ve z is : "+Math.abs(z));
		
		//Ceiling means in math if we provided 1.12 as double value then this will check its next value here 1.12<=1 not, so 1.12<2 so ans is 2
		double c = 2.5;
		System.out.println("Ceiling of given c vlaue is : "+Math.ceil(c));
		System.out.println("Flooring of given c value is : "+Math.floor(c));
		System.out.println("Round of given c value is : "+Math.round(c));//this will check closest value ex : 2.4 then ans : 2, 2.5 then ans : 3
		
		int d = 12;
		System.out.println("square value of the given d is : "+Math.sqrt(d));
		System.out.println("Power of the given d is : "+Math.pow(d, 2));
		
		System.out.println("Log value of the 10 is : "+Math.log10(10));//Log and its value if same then ans : 1 ex : Log5(5) ans : 1
		System.out.println("Adding 1 into pi value : "+(1+Math.PI));
		System.out.println("Generating randome number : "+Math.random());//this will generate 0.0 to 0.9
		//If you want exact Integer number then
		//Here below i have multiplied with 11 because to get a number as 
		//Math.random will provide us as min 0 and max 0.999999 if we multiplied with 11 then will get exact number.
		System.out.println("Generating randome integer number : "+(int)(Math.random()*11));
		
	}

}
