package V19_Encapsulation;

public class Main_Student {
	public static void main(String[] args) {
		my_Student mstd = new my_Student();
		mstd.setAge(21);
		System.out.println(mstd.getAge());
		mstd.setName("The King Anand B S");
		System.out.println(mstd.getName());
		mstd.setRollNumber(30);
		System.out.println(mstd.getRollNumber());
	}
}
