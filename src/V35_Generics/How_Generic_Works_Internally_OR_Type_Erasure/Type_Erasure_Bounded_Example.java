package V35_Generics.How_Generic_Works_Internally_OR_Type_Erasure;

public class Type_Erasure_Bounded_Example {
	public static void main(String[] args) {
		
		//This is before Compilation
//		NumberBox<Integer> i = new NumberBox();
//		i.setNumber(30);
//		Integer number = i.getNumber();
//		System.out.println(number);
		
		//This is after compilation code
		NumberBox j = new NumberBox();
		j.setNumber(30);
		Number number2 = (Integer)j.getNumber();
	}
}

/*
 * class NumberBox<T extends Number>{
 * 
 * private T number;
 * 
 * public T getNumber() { return number; }
 * 
 * public void setNumber(T number) { this.number = number; }
 * 
 * }
 */


//Basically after Compilation code become like this and if you used any Boundation then that class becomes instead of the Object
class NumberBox{
	
	private Number number;

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}
	
}

