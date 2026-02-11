package V36_Collection_FrameWork.Collection_Interface.List.ArrayList.ArrayLst_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student_Main {
	public static void main(String[] args) {
		
		
		
		ArrayList<Student_Example> std = new ArrayList<>();
		std.add(new Student_Example("Lalita", 3.9));
		std.add(new Student_Example("Kaveri", 4.5));
		std.add(new Student_Example("Mangal", 4.8));
		std.add(new Student_Example("Anand", 3.9));
		std.add(new Student_Example("Basagouda", 4.9));
		/*if we pass here as null then that means that it needs to follow the natural sorting 
		 * but here we get exception as Student doesn't know for the natural sorting which field it needs to be take.
		 * So here we have to use the class based or based on the  Lambda Expression for the sorting
		 * NOTE if some of the student have same GPA then the first inserted value will be returned
		 */
		
		/*
		 * System.out.println("Descending order : "); std.sort((a, b)->{ if(b.getGpa() -
		 * a.getGpa()>0) { return 1; }else if(b.getGpa() - a.getGpa()<0){ return -1;
		 * }else { return 0; } });
		 * 
		 * 
		 * for(Student_Example na : std) {
		 * System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
		 * }
		 * 
		 * 
		 * System.out.println("Ascending order : "); std.sort((a, b)->{ if(a.getGpa() -
		 * b.getGpa()>0) { return 1; }else if(a.getGpa() - b.getGpa()<0){ return -1;
		 * }else { return 0; } });
		 * 
		 * System.out.println("Ascending order : "); std.sort((a, b)->{ if(a.getGpa() -
		 * b.getGpa()>0) { return 1; }else if(a.getGpa() - b.getGpa()<0){ return -1;
		 * }else { return 0; } });
		 * 
		 * 
		 * for(Student_Example na : std) {
		 * System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
		 * }
		 */
		
		//Here ascending sort we are initially considering the gpa and then we want to compare the names where GPA is same.
		System.out.println("Ascending order : "); std.sort((a, b)->{ if(a.getGpa() -
				 b.getGpa()>0) { return 1; }else if(a.getGpa() - b.getGpa()<0){ return -1;
				 }else { return a.getName().compareTo(b.getName()); } });
		
		for(Student_Example na : std) {
			 System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
			 }
		
		//Sorting using Comparator which uses the method reference.
		Comparator<Student_Example> comparing = Comparator.comparing(Student_Example::getGpa);
		System.out.println("\nSorting using the Comparator and Method reference of java 8 concepts Ascending order : ");
		std.sort(comparing);
		for(Student_Example na : std) {
			System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
		}
		
		Comparator<Student_Example> comparing1 = Comparator.comparing(Student_Example::getGpa).reversed();
		System.out.println("\nSorting using the Comparator and Method reference of java 8 concepts Descending order : ");
		std.sort(comparing1);
		for(Student_Example na : std) {
			System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
		}
		
		
		Comparator<Student_Example> comparing2 = Comparator.comparing(Student_Example::getGpa).reversed().thenComparing(Student_Example::getName);
		System.out.println("\nSorting using the Comparator and Method reference of java 8 concepts Descending order : ");
		std.sort(comparing2);
		for(Student_Example na : std) {
			System.out.println("Student name : "+na.getName()+" and GPA : "+na.getGpa());
		}
		
		//We can also pass the collections.
		Collections.sort(std, comparing1);
	}
}
