package V36_Collection_FrameWork.Map_Interface.HashMap.Comparable;

import java.util.Objects;

public class Student_Class implements Comparable<Student_Class>{
	private String name;
	private double gpa;
	
	Student_Class(String n, double gpa) {
		this.name = n;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return gpa;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Student_Class s = (Student_Class) o;
		
		return Double.compare(gpa, s.gpa) == 0 && Objects.equals(name, s.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, gpa);
	}
	//Here is the logic where it is sorting the Student based on the GPQ and the below logic will work for the Descending order as it is return +ve value
	//if you want to sort Ascending then reverse  the logic as that will return -ve value as given below
	//return Double.compare(this.getGPA(), o.getGPA());
	@Override
	public int compareTo(Student_Class o) {
		return Double.compare(o.getGPA(), this.getGPA());//For Descending order
//		return Double.compare(this.getGPA(), o.getGPA());//For Ascending order
	}
	
	@Override
	public String toString() {
		return "Name : "+name+", GPA : "+gpa;
	}
}
