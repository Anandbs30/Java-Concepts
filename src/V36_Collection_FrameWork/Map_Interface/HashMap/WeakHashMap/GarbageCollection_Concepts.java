package V36_Collection_FrameWork.Map_Interface.HashMap.WeakHashMap;

import java.lang.ref.WeakReference;

class Phone{
	private String brand;
	private String model;
	
	public Phone(String b, String m) {
		this.brand = b;
		this.model = m;
	}

	
	//Self written
	@Override
	public String toString() {
		return "Phone : brand = "+brand+" and it's model = "+model;
	}
	
//	Generated : 
//	@Override
//	public String toString() {
//		return "Phone  : brand=" + brand + ", model=" + model;
//	}
	
	
}
public class GarbageCollection_Concepts {
	public static void main(String[] args) {
		//the below reference p1 or syntax below is known as the strong reference.
		Phone p1 = new Phone("Samsung", "S24 ultra");//This data is stored into the heap memory.
		//here p1 is an reference and using that we are printing the phone brand and model.
		//The p1 is pointing to the constructor values as Samsung and S24 ultra.
		System.out.println(p1);
		p1 = null;//this means we are removing the pointer p1 from constructor value and pointing it to the null.
		//after the above line the constructor value Samsung and S24 ultra are not in use so here garbage collector comes into picture and remove these.
		//The constructor data is removed by jvm by checking the reference.
		// System.gc(); // this means we are calling garbage collection method manually but note that once reference is not there then the garbage
		//collection automatically happen through the   JVM
		System.out.println(p1);//this will print null
		
		
		//Weak reference to do this one we have to use the WeakReference<> class using this we can create the weakReferences.
		WeakReference<Phone> p2 = new WeakReference<Phone>(new Phone("Apple", "17 Pro Max"));
		System.out.println(p2.get());
		System.gc();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
		
		//After 10 second this needs to print null as its an weak Reference but here JVM printing the values to make print as null then we have to suggest
		//to JVM for the Garbage Collection here we are doing this for an testing purpose. So directly we are not making variable as Null here.
		//So here to making null p2 JVM have some logics and conditions that will check internally and then it will make p2 as null.
		//Just suggesting to the JVM by calling System.gc(); method. refer line number 47 through this p2 become null in line 58 print statement.
		//after 10 second.
		System.out.println(p2.get());
	}
}
