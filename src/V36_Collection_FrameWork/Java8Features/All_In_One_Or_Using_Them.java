package V36_Collection_FrameWork.Java8Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class All_In_One_Or_Using_Them {
	public static void main(String[] args) {
		//This will check the condition and provide the true false values.
		Predicate<Integer> p = x -> x % 2 == 0;
		
		//This will take an integer and perform math functionality like add, sub, multiplication, etc..and returns the result.
		Function<Integer, Integer> f = x -> x * x;
		
		//Note : Here we are providing the Integer, Integer as two times and this is seems like duplicate.
		//To avoid that java provided the UnaryOperator interface which is also extends the Function and which have same methods as Function have.
		UnaryOperator<Integer> uo = s -> s * s;
		System.out.println("The square of the given number is : "+uo.apply(4));
		
		
		//This will take something but not return anything. or print that.
		Consumer<Integer> c = x -> System.out.println(x);
		
		//This will return something without taking anything.
		Supplier<Integer> s = () -> 100;
		
		
		//So here in the if condition as we know Predicate required an integer, To provide an integer to the predicate here below we are calling 
		//Supplier for the integer using .get(); method. Supplier will provide an integer So using that predicate will check the condition as
		//provided in the lambda expression. Once the test method return value as true the if block goes under.
		if(p.test(s.get())) {
			//Here as We know Consumer need an integer to print, So here using function.apply where calculation is happens but that as well need
			//an integer so inside that apply function we are calling the supplier.get(); as this consist the integer.
			//Once that return integer then using that integer function will perform the given condition then that will return an integer using that
			//consumer.accept function will print the integer.
			c.accept(f.apply(s.get()));
		}
		
		//Just take a look on the Predicate, Consumer and Supplier which have only one Argument so we have other methods as given below.
		//BiPredicate, BiConsumer and BiFunction These will take the two argument.	
		
		//1) BiPredicate : Where this will take two arguments.
		BiPredicate<Integer, Integer> bp = (x, y) -> (x + y) % 2 ==0;
		
		System.out.println("The two given number sum is even or not : "+bp.test(4, 5));//False
		System.out.println("The two given number sum is even or not : "+bp.test(7, 5));//True
		
		
		//2) BiConsumer : Here this will take two argument and print them.
		BiConsumer<Integer, Integer> bc = (x, y) -> {
			System.out.println("The value of the x is : "+x);
			System.out.println("The value of the y is : "+y);
		};
		
		bc.accept(7, 5);
		
		//3) BiFunction : Here this will two argument and also we have to provide an return type as well.
		BiFunction<String, String, Integer> bf = (x, y) -> (x.length() + y.length());
		
		//In the above we are passing 3 thing String, String, Integer instead of the BiFunction we can use the BinaryOperator.
		//below we provided the Integer and saying that using this calculate the sum of two numbers and return result.
		BinaryOperator<Integer> bo = (x, y) -> (x + y);
		System.out.println("Some of the two numbers is : "+bo.apply(3, 9));
		
		
		System.out.println("The length of the two given string is : "+bf.apply("Anand", "basagouda"));
	}
}
