package V13_Loops;

public class Do_While_Loop {
	public static void main(String[] args) {
		System.out.println("Do-While Loop");
		//Syntax
		/*
		Do{
			//work or print the line and value increment or decrement
		}while(Condition check);
		*/
		
		//Print 1 to 50 number
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a<=50);
	}
}
