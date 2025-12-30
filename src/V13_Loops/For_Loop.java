package V13_Loops;

public class For_Loop {
	public static void main(String[] args) {
		System.out.println("For Loop");
		
		//Syntax
		/*
			for(initialization; Condition; update value){
				Code
			}
		*/
		
		//Print table of 2
		int a = 7;
		for(int i = 1; i<=10;i++) {
			System.out.println(a+" * "+i +" = "+(a * i));
		}
		
		/*
		 1
		 10
		 100
		 1000
		 10000
		 100000
		 */
		for(int j = 1; j<=100000;j = j*10 ) {
			System.out.println(j);
		}
		
		//Or defining the multiple variable and there condition and also we can update value
		for(int k = 1, l = 1;l<=6; k = k * 10, l++ ) {
			System.out.println(k);
		}
		
		//Sum of first 10 natural number
		int sum = 0;
		for(int d = 1; d<=10;d++) {
			sum += d;
		}
		System.out.println(sum);
	}
}
