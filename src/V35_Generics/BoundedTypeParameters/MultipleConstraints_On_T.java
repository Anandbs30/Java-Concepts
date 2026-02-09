package V35_Generics.BoundedTypeParameters;

interface Printable{
	void print();
}

interface Hello{
	void greeting();
}

class MyNumbers extends Number implements Printable, Hello{
	
	private final int values;
	
	public MyNumbers(int val) {
		this.values=val;
	}

	//Implemented the interface method.
	@Override
	public void print() {
		System.out.println("My Number is : "+values);
		
	}

	@Override
	public void greeting() {
		System.out.println("Hey hi Hello!! my badge number is : "+values);
		
	}
	
	//Implemented the Number class Methods
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return values;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return values;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return values;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return values;
	}
	
}
/*
 * Here we are making bound on the MultipleConstraints_On_T generic with multiple things which is extends the Number class and implementing an interface.
 * And also we need to know about that is Firstly we have to Extend the the class and then need to implement an interface if we make reveres then will get
 * an error stating that The type Number is not an interface; it cannot be specified as a bounded parameter, that means we can't Bound like that.
 * Reason behind this is Java doesn't Support multiple inheritance on class level and its possible on interface level so due to this we need to provide 
 * firstly class then we can provide multiple interfaces.  
 * Here below making bound on the T then whether we use the interface or Class here we have to use only extends keyword.(extend keyword works only)
 */
class MultipleConstraints_On_T1<T extends Number & Printable & Hello> {
	private T item;
	
	public MultipleConstraints_On_T1(T item) {
		this.item = item;
	}
	
	public void Display() {
		item.print();
	}
	
	public void Greet() {
		item.greeting();
	}
	
	public T getItem() {
		return item;
	}
}

public class MultipleConstraints_On_T{
	public static void main(String[] args) {
		MyNumbers n = new MyNumbers(30);
		MultipleConstraints_On_T1<MyNumbers> m = new MultipleConstraints_On_T1<>(n);
		m.Display();
		m.Greet();
	}
	
}
