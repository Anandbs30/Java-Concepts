package V36_Collection_FrameWork.Java8Features;

import java.util.function.Predicate;

/*
 * Predicate is an functional interface, It is an boolean valued function. 
 * This will return true false.
 */
public class Predicate_Class {
	public static void main(String[] args) {
		
		//Here we are storing an condition into an variable that's known as Functional programming.
		Predicate<Integer> isEven = x -> x % 2 ==0;
		System.out.println("The given number is even or odd : "+isEven.test(4));
		Predicate<String> isStartsWithA = x -> x.startsWith("A");//Case sensitivity A and a are different here.
		System.out.println("The given word is starts with A : "+isStartsWithA.test("aNAND"));//False
		System.out.println("The given word is starts with A : "+isStartsWithA.test("ANAND"));//True
		
		Predicate<String> isEndssWithD = x -> x.endsWith("D");
		System.out.println("The given word is ends with D : "+isEndssWithD.test("ANAND"));//true
		
		
		//To avoid case sensitive issue we can use the .toLowerCase()
		Predicate<String> isStartsWithALowerCase = x -> x.toLowerCase().startsWith("a");//Case sensitivity A and a are different here.
		System.out.println("The given word is starts with a : "+isStartsWithALowerCase.test("Ax₹NAND"));//true
		//we can Combine the two predicates here also we have and, or cases as well.
		Predicate<String> and = isStartsWithA.and(isEndssWithD);
		System.out.println(and.test("ANAND"));
		
		
		
		
	}
}
