package V36_Collection_FrameWork.Java8Features;

import java.util.function.Function;

/*
 * Function is an Functional interface, which have only one abstract method which is apply();
 * Predicate only check the condition Here Function will work on something. This will take something and after processing provide answer.
 * 
 * Function<T, R> So here it says that T is an Input type and R is state that the return type.
 */
public class Function_Class {
	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = x -> x * 2;
		Function<Integer, Integer> tripleIt = x -> x * 3;
		System.out.println("Provide an element which the Function doubles : "+doubleIt.apply(4));
		System.out.println("Provide an element firstly its doubled and using that doubled result will become triple using andThen method: "
		+doubleIt.andThen(tripleIt).apply(4));
		System.out.println("Provide an element firstly its tripple and using that triple result will become double using compose method : "
		+doubleIt.compose(tripleIt).apply(4));
		
		//Function have an default method identity(); which returns the given input as it is.
		//The usecase of the identity() method will be explained in the Stream topic.
		Function<Integer, Integer> result = Function.identity();
		System.out.println(result.apply(5));
	}
}
