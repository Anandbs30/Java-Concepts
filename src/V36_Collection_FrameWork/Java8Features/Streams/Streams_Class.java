package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * What is stream?
 * A sequence of elements supporting various operations like functional and declarative. Also which consists the lot of methods. 
 * -> On any collection if you want to do any Functional or declarative manner to do that we have to convert collection into streams.
 * Stream is an feature which is introduced in java 8.
 * Using this feature we can process the collections of data in a functional(we can apply lambda expression) and declarative manner.
 * Stream simplify the code(means without this previously we processed data using loop and if else condition so it is reduce that).
 * This will uses the Functional programming.
 * Improves Readability and Maintainability.
 * Enables Easy parallelism : Means here without dealing with the Mutithreading complexity we can achieve parallelism using streams.
 */
public class Streams_Class {
	public static void main(String[] args) {
		System.out.println("Learning the Streams!!!");
		
		//HOW TO USE THE STREAMS?
		//WHENEVER WE USE STREAMS WE NEED TO HAVE SOURCE, INTER MEDIATE OPERATION WILL BE HAAPENS ON THEM, AFTER THESE TERMINAL OPERATION NEEDS
		//TO BE DONE ON THE SAME. THESE ABOVE ALL THE TERMINOLOGIES WILL BE EXPLAINED BELOW.
		List<Integer> nums = Arrays.asList(2, 4, 5, 6, 7, 8,4, 9, 1, 3, 5);
		//Here nums is an Source for the streams. 
		
		//Q : Count the even numbers
		//Here below .filter(x -> x % 2==0) this is an INTER MEDIATE OPERATION. Not filter is except predicate means which have takes something and
		//Check condition and return true false.
		System.out.println("The even number count is : "+nums.stream().filter(x -> x % 2 ==0).count());
		
		//There are multiple ways to create Streams.
		
//		1). From Collection
		List<String> names = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda");
		Stream<String> stream = names.stream();
		
//		2). From Arrays. (if you have an String[] array and you want to convert that into streams).
		
		String[] array = {"Anand", "Kaveri", "Mangal", "Lalita", "Basagouda"};
		Stream<String> stream1 = Arrays.stream(array);
		
		//Q : fetch length of each word
		//if you want to print directly then
//		stream1.map(String::length).forEach(System.out::println);
		
		//if you want to store them into an list use below.
		List<Integer> collect = stream1.map(String::length).collect(Collectors.toList());
		System.out.println(collect);
		
//		3). we can create directly
		Stream<String> of = Stream.of("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda");
		
//		4). Infinite : we can create infinite stream.
		Stream<Integer> stream2 = Stream.generate(()->1);//This means stream is infinite and that consist 1's till infinite.
		
		//we can apply the limit on this
		Stream<Integer> limit = Stream.generate(()->30).limit(10);
		limit.forEach(System.out::println);
		
		//Another way to create infinite stream. below 1 is an initial point. remove .limit() method to make it as infinite.
		Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(10);
		iterate.forEach(System.out::println);//this will print 1 to 10 as we provided limit in the above.
		
		List<Integer> collect2 = Stream.iterate(2, x -> x * 2).limit(10).collect(Collectors.toList());
		System.out.println(collect2);
		
		
	}
}
