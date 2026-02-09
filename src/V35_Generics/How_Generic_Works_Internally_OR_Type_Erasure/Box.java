package V35_Generics.How_Generic_Works_Internally_OR_Type_Erasure;


//Before Compilation code
 public class Box<T> {
 
	
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

//After Compilation Code will become
/*
public class Box {

	
	
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
*/