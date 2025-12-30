package V30_Wrapper_Classes;

public class Testing {
public static void main(String[] args) {
	Student std1 = new Student();
	std1.id = 1;
	fun(std1);//Passing object address
	fun1(std1);
	System.out.println(std1.id);
}
//The above student variable is pointing an object address and that has been copied by passing the variable into fun
//method so now a is also pointing same address
public static void fun(Student a) {//Here in this function same value is copied
	Student std1 = new Student();
	std1.id = 2;
	//Here basically the object address of std1 is adding into a that is same so in the above print statement 1 will print.
	a= std1;
}
public static void fun1(Student b) {
	b.id = 3;//now we are accessing same object address and updating its value 1 to 3 now in the print statement will print 3
}
}
class Student{
	public int id;
}
