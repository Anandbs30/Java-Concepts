package V33_MultiThreadding.WhyweUSERunnableInterfaceAndThreadClass;


//Here below you are trying to do multiple inheritance but that is not possible for the class level in java 
//Thats why we have Runnable interface which consist only one method that is Run.
//public class B extends A, Thread you can't do this
public class B extends A implements Runnable{

	@Override
	public void run() {
		System.out.println("The king");
		
	}

}
