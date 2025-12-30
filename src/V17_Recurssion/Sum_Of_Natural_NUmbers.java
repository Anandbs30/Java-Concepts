package V17_Recurssion;

public class Sum_Of_Natural_NUmbers {
	public static int SumNatural(int n) {
		if(n == 0) {
			return 0;
		}
		return n + SumNatural(n-1);
	}
	public static void main(String[] args) {
		System.out.println(SumNatural(5));
	}
}
