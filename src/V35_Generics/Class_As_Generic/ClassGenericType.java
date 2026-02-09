package V35_Generics.Class_As_Generic;
/*
 * Naming Convention : 
 * 	T : Type
 *  E : Element (used in collections)
 *  K : Key (Used in maps)
 *  V : Value (Used in maps)
 *  N : Numbers
 */
public class ClassGenericType {
	public static void main(String[] args) {
		Box_One_Parameter<String> b = new Box_One_Parameter<>();
		b.setObj("Anand");
		b.setObj("Managal");
		String obj = b.getObj();
		System.out.println(obj);
		
		Multiple_Parameter<Integer, String> mp = new Multiple_Parameter<>(30, "Age");
		
		System.out.println("Age : "+mp.getKey());
		System.out.println("Name : "+mp.getValue());
	}
}
