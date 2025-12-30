package V13_Loops;

public class Nested_For_Loop {
	public static void main(String[] args) {
		int res = 0;
		for(int i = 1; i<=10;i++) {
			for(int j = 1; j<=10; j++) {
				res++;
			}
		}
		System.out.println(res);
		
		//Q :  Print Pattern
		/*
		 
		 * 
		 * *
		 * * *
		 * * * *
		 
		 */
		for(int k = 0; k < 4;k++) {
			for(int l = 0;l <= k;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
