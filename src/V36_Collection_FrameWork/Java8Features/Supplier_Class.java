package V36_Collection_FrameWork.Java8Features;

import java.util.function.Supplier;

//The Supplier is an interface which is take nothing but provide an output. 
public class Supplier_Class {
	public static void main(String[] args) {
		Supplier<String> sp = ()-> "Hello World!";
		System.out.println(sp.get());
	}
}
