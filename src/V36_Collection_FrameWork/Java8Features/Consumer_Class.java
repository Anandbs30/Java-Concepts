package V36_Collection_FrameWork.Java8Features;

import java.util.function.Consumer;

/*
 * It is an Functional interface and which have the accept(); as an abstract method.
 * Which takes something but not return anything as the accept(); method is void.  
 */
public class Consumer_Class {
	public static void main(String[] args) {
		Consumer<Integer> c = x -> System.out.println(x);
		c.accept(25);
	}
}
