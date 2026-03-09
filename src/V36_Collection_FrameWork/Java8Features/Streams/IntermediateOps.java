package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//After converting what we have to do with that stream like filter, map etc, methods.

public class IntermediateOps {
	public static void main(String[] args) {
		//Intermediate operations are transform a stream into another stream.
		//And they are lazy, means they don't be execute until any terminal operation is invoked.
		
		//1) FILTER : 
		List<String> names = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda", "Ameet");
		//Below transformed a stream into another stream.
		Stream<String> filter = names.stream().filter(x -> x.startsWith("A"));
		
		//No execution as we know until any terminal operation is invoked so till above line no terminal operations are used.
		//What are terminal operation so after the filter we have to print them, collect or count these are the terminal operations.
//		System.out.println("Count of the names starts with A is : "+filter.count());
		//we can print the elements after collecting them into an List.
//		filter.collect(Collectors.toList()).forEach(System.out::println);
		
		//We can also print directly these.
		filter.forEach(System.out::println);
		System.out.println();
		
		//2) MAP : 
		//map will accept the function where it have to perform an condition.
		System.out.println("The list values into upper case");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		//3) SORT : 
		//Sorting stream.
		System.out.println("\nThe list elements in sorted natural sorting : ");
		names.stream().sorted().forEach(System.out::println);
		
		System.out.println("\nThe list elements in sorted in reverse order : ");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		//Reverse order based on the string length
		System.out.println("\nSorted in revers order based on their length : ");
		names.stream().sorted((a, b) -> b.length() - a.length()).forEach(System.out::println);
		
		System.out.println("\nSorted in Ascending order based on their length : ");
		names.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
		
		
		//4) DISTINCT : 
		//To fetch unique elements we use Distinct function.
		List<String> nameswithduplicates = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda", "Anand", "Mangal");
		
		System.out.println("\nThe Distinct elements are : ");
		nameswithduplicates.stream().distinct().forEach(System.out::println);
		
		//5) LIMIT : 
		//Limit function.
		System.out.println("\nLimit function : ");
		Stream.iterate(2, x->x*2).limit(20).forEach(System.out::println);
		
		//6) SKIP : 
		//Skip some of the things its work like continue.
		System.out.println("\nSkip function : ");
		long count = Stream.iterate(2, x->x*2).skip(10).limit(20).count();
		System.out.println(count);
		
		//7) PEEK : 
		//Perform be like forEach but this is an Intermediate operation. not termination operator.
		//Performs an action on each element as it is consumed.
		System.out.println("\nPEEK operation");
		long count2 = Stream.iterate(1, x->x+2).skip(10).limit(20).peek(System.out::println).count();
		System.out.println("The count is : "+count2);
		
		//8) FLATMAP : 
		//Handle streams of collections, lists or arrays where each element is itself an collection.
		//It does flatten nested structures (e,g,. lists within lists) so that they can be processed as a single sequence of elements.
		//MAP does transform and FLAT does nested into a single stream.
		//SO FLATMAP : Transform and Flatten elements at the same time, as its an combination of MAP & FLAT.
		
		System.out.println("FLAT MAP : ");
		//This below is list of list be like 2d array 2*3
		List<List<String>> asList = Arrays.asList(
				Arrays.asList("Anand", "Kaveri"),
				Arrays.asList("Mangal", "Lalita"),
				Arrays.asList("Basagouda", "Shiraganve")
				);
		
		//Now want to print an element of asList Kaveri
		System.out.println("The value of 2d array from index 0,1 is : "+asList.get(0).get(1));
		
		//using flatmap to make them transform and flatten 
		System.out.println(asList.
				stream().
				flatMap(list -> list.stream()).
				map(String::toUpperCase).
				toList());
		
		List<String> asList2 = Arrays.asList("Hey Hi Good Morning", "This is the nice thing to visit here!!", "Visit again for the solutions and new learnings.");
		System.out.println(asList2.
				stream().//note : asList3.split(" ") this will return the Arrays but we required the stream so using Arrays.stream method we converted into stream.
				flatMap(asList3->Arrays.stream(asList3.split(" "))).
				map(String::toUpperCase).
				toList());
		
		
	}
}
