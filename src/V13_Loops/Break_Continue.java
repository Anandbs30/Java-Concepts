package V13_Loops;

public class Break_Continue {
	public static void main(String[] args) {
		int a = 1;
//Using While Loop		
		//Break 
		while(a <= 10) {
			System.out.println(a);
			if(a == 6) {
				break;
			}
			a++;
		}
		System.out.println();
		int b = 1;
		//Continue
		while(b <= 10) {
			if(b == 3) {
				b++;
				continue;
			}
			System.out.println(b);
			b++;
		}
		System.out.println();
//Using for loop
		//Break
		for(int i = 1;i<=10;i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		//Continue
		for(int j = 1;j<=10; j++) {
			if(j == 7) {
				continue;
			}
			System.out.println(j);
		}
	}
}
