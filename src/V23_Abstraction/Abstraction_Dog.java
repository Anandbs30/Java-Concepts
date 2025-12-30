package V23_Abstraction;


/*
 Below after extending we get error stating that we have to implement Abstract_Animal class methods or we have to mark
 this class as abstract if we don't provide the Abstract_Animal class sayHello method body.
 */
public class Abstraction_Dog extends Abstraction_Animal{

	
	/*
	 As we here implemented the method of the Abstraction_Animal class sayHello method and provided the body so here
	 we don't need to make the class as abstract.
	 */
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
	}
	
	public void theKing() {
		System.out.println("Nothing.");
	}
	
	public void sleep() {
		System.out.println("WOOOOOOOOOOOF");
	}

}
