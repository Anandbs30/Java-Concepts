package V35_Generics.How_Generic_Works_Internally_OR_Type_Erasure;

public class Type_Erasure {
	public static void main(String[] args) {
		
		/*
		 * After compilation the compiler will check the type and remove the generic info The process is known as the Type Erasure	 
		 * Below code is before Compilation
		 */
		Box<String> stringBox = new Box<>();
		stringBox.setValue("AnandBS");
		String value = stringBox.getValue();
		System.out.println("The value is : "+value);
		
		
		
		/*The below Code is after compilation and here the Compiler is removed the Generic info 
		 * and Used Object as reference and internally used String casting
		 */
		Box stringBox1 = new Box();
		stringBox1.setValue("AnandBS");
		Object value1 = (String)stringBox1.getValue();
		System.out.println("The value is : "+value1);
	}
}
