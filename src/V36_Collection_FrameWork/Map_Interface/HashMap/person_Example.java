package V36_Collection_FrameWork.Map_Interface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import V21_Inheritance.MultipleInheritance.MainClass;

//Here how it works based on the 
class Person{
	private String name;
	private int id;
	
	public Person(String p_Name, int p_id) {
		this.name = p_Name;
		this.id = p_id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		//To generate the HashCode as well we have to send the Name and Id So if the both are same with the any related previous data then use previous.
		//Values hashCode as it is. To do this we have to use the Objects class which provide the hash method where we can pass the attributes.
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		// CUSTOMIZING THE FILTRATION HERE.
		if(this == obj) {
			return true;
		}if(obj == null) {
			return false;
		}if(getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person)obj;
		//Here while checking the name part some times will get an nullpointer exception to avoid that we have to use Objects Class 
		return id == other.getId() && Objects.equals(name , other.getName());
	}

	@Override
	public String toString() {
		// CUSTOMIZING THE PRINT METHOD.
		return "id : "+id+", name : "+name;
	}
	
	
}

public class person_Example {
	public static void main(String[] args) {
		HashMap<Person, String> map = new HashMap<>();
		Person p1 = new Person("Anand", 30);
		Person p2 = new Person("Lalita", 48);
		Person p3 = new Person("Anand", 30);
		
		map.put(p1, "Engineer");
		map.put(p2, "Doctor");
		//Here in this we thought that the value will be updated of p1 but not happened bcz here object have different memory address so this is an 
		//another value 
		//If you want to change the data or replace this with the p1 then we have to customize the .equal() and hashCode() methods.
		//The above customized methods are present in the Person class
		//To customize them we have to go into Person class click on the class -> source -> override/implement -> click equals() and hashCode().
		map.put(p3, "Manager");  
		
		System.out.println("The size of the map is : "+map.size());//initially size is 3 after customizing the .equals() and .HashCode() method ans is 2.
		System.out.println("The value of the p1 is : "+map.get(p1));//initially p1 : Engineer 
		System.out.println("The value of the p3 is : "+map.get(p3));//initially p3 : Manager but after customizing the .equals() and .HashCode() method ans : Engineer.
		System.out.println(p1);
		
		//Here below we storing the student name and their respective marks. 
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Anand", 90);//HashCode1 --> index1
		map1.put("Lalita", 99);//HashCode2 --> index2
		//Here below Key is same as Anand, So HashCode1 --> index1 comes after this .equal() method will check and then if key, 
		//HashCode and index are same then that will replace the value 90 to 93.  
		map1.put("Anand", 93);//HashCode1 --> index1
	}
}
