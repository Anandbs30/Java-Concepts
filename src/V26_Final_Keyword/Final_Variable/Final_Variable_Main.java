package V26_Final_Keyword.Final_Variable;

public class Final_Variable_Main {
	public static void main(String[] args) {
		Final_Variable_Car fvc = new Final_Variable_Car();
		fvc.accelerate(90);
		System.out.println("Max speed is : "+fvc.getMaxSpeed());
	}
}
