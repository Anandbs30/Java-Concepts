package V36_Collection_FrameWork.Collection_Interface.List.ArrayList.ArrayLst_Example;

public class Student_Example {
	private String name;
	
	private double gpa;
	
	public Student_Example(String std_name, double std_gpa) {
		this.name = std_name;
		this.gpa = std_gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double  getGpa() {
		return gpa;
	}
}
