package V35_Generics.Interface_As_Generic;

public class Main_Class {
	public static void main(String[] args) {
		//Object of the interface stated as String
		One_Parameter_Impl_Class opic = new One_Parameter_Impl_Class();
//		opic.add(30);//Compile time error here we can't able to provide Other than String.
		opic.add("AnandBS");
		System.out.println(opic.get());
		
		//Object of the Class Stated as generic here we can provide any kind data type which is stated in below.
		Making_IMPL_Class_Generic<Integer> micg = new Making_IMPL_Class_Generic<>();
				micg.add(30);
				System.out.println(micg.get());
	}
}
