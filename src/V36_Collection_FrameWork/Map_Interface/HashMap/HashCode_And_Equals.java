package V36_Collection_FrameWork.Map_Interface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
	private int id;
	private String name;
	
	public Student(int std_id, String std_name) {
		this.id = std_id;
		this.name = std_name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {//here checking the Current object and obj is equals or not.
			return true;
		}if(obj == null) {
			return false;
		}if(getClass()!= obj.getClass()) {
			return false;
		}
		Student st = (Student) obj;
		return id == st.getId() && Objects.equals(name, st.getName());
	}

	@Override
	public String toString() {
		
		return "id : "+id+", name : "+name;
	}
	
	
}


public class HashCode_And_Equals {
	public static void main(String[] args) {
		//now we are going to add the values like id, name and along with that there marks.
		Student s5 = new Student(39, "MangalBS");
		Student s1 = new Student(30, "AnandBS");
		Student s2 = new Student(21, "LalitaBS");
		Student s3 = new Student(12, "BAsagoudaBS");
		Student s4 = new Student(30, "AnandBS");
		
		HashMap<Student, Integer> std_marks = new HashMap<>();
		
		//So here below the s1 which is an Object of class here its HashCode will generated using its memory address.
		//To do this here as we know every class is implements Object and this consist the HashCode() method and .equals() method. 
		//Through the HashCode() method this will generate the HashCode using the class object memory address. and .equals() method will check weather the
		//Reference is correct or not.
		std_marks.put(s1, 90);//Here firstly HasCode1 generated --> index1
		std_marks.put(s2, 92);//Here firstly HasCode2 generated --> index2
		std_marks.put(s3, 88);//Here firstly HasCode3 generated --> index3
		std_marks.put(s4, 95);//Here firstly HasCode1 generated --> index1 --> check the given hashCode and present hashCode is matching if yes then replace value.
		std_marks.put(s5, 99);//Here firstly HasCode5 generated --> index5
		
		
		System.out.println("HashMap size : "+std_marks.size());
		System.out.println("Value for s1 : "+std_marks.get(s1));
		System.out.println("Value for s4 : "+std_marks.get(s4));
		
		
		
		Map<String, Integer> person = new HashMap<>();
		person.put("Anand", 20);//Here firstly HasCode1 generated --> index1
		person.put("Kaveri", 19);//Here firstly HashCode2 generated --> index2
		person.put("Anand", 18);//here HasCode1 generated --> index1 --> check the given hashCode and present hashCode is matching 
		//or not using .equals() method. if HashCode is matching then the old value will be replaced by new value. 
	
		
		
	}
}
