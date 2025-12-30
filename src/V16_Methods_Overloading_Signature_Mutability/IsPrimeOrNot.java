package V16_Methods_Overloading_Signature_Mutability;


public class IsPrimeOrNot {
	public static void main(String[] args) {
		System.out.println(isPrime(12));
		System.out.println(isPrime(21));
		System.out.println(isPrime(11));
		System.out.println(isPrime(17));
		System.out.println(isPrime(13));
		System.out.println(isPrime(3));
	}
	
	public static boolean isPrime(int c) {
		if (c < 2) return false;
		int res = 0;
		for(int i = 1; i<= c / 2;i++) {
			if(c % i == 0) {
				res++;
			}
		}
		return res == 1;
	}
}
