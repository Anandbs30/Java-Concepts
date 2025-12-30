package V5_V6_DataTypes;

public class v6_VariableNames {
	public static void main(String[] args) {
		//Case sensitive : here myName and myname are different
		String myName = "Anand";
		String myname = "AnandBS";
		
		//While writing a variable names we can use the $, _ and numbers 1, 2, 3, etc as given below 
		//other than this we don't have to use any other special characters 
		//But we not use the numbers at the starting(beginning) of the variable name as given below 
		//IMP NOTE : Cannot use java keywords as variable names
		int my_Roll$Number1 = 30;
		int $myroll = 12;
		int _roll = 111;
		
//		int 1my_Roll = 21;
		System.out.println(_roll);
		
	}
}
