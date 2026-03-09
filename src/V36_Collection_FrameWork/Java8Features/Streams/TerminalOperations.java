package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//1). Collect
		//So here below collect is an termination and which takes Collectors will collect the incoming elements and 
		//convert those into the a new List to store the collected elements.
		list.stream().skip(1).collect(Collectors.toList());
		
		//2) toList
		//In the above line we can write directly toList() which stores the elements and that List is unmodifiable.
		//Here below .toList() is an termination operator.
		list.stream().skip(3).toList();
		
		//3) forEach
		list.stream().forEach(System.out::println);
		
		
		//4) reduce : Combine elements to produce a single result. This is also called as accumulator.
		//Also here reduce takes and BinaryOperator means this will take the same types two elements and return the result of the same type.
		//Optional class this is an be like a box which can be consist the elements or not.
		Optional<Integer> reduce = list.stream().reduce((x, y)-> x+y);
		System.out.println("The sum of the elements is : "+reduce.get());
		
		//we can also convert this one in method reference
		Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);
		System.out.println("The sum of the elements using method reference is : "+reduce1.get());
		
		
		//5) count
		System.out.println("The list elements count is : "+list.stream().count());
		
		//6) anyMatch, allMatch, noneMatch
		//a) anyMatch
		boolean anyMatch = list.stream().anyMatch(x -> x%2==0);
		//if any of the list element is match the above given condition then this will return true.
		System.out.println("The above given condition is satisfying :"+anyMatch);
		
		//b) allMatch
		//here the given condition needs to pass all the elements which are present into the list 
		boolean allMatch = list.stream().allMatch(x->x%2==0);
		System.out.println("All the elements are matches the above given condition : "+allMatch);
		
		//c) noneMatch
		//The noneMatch is return true when no one elements are satisfy the given condition
		boolean noneMatch = list.stream().noneMatch(x->x%2==0);
		System.out.println("All the elements are not matches the above given condition : "+noneMatch);
		
		//7) findFirst, findAny
		//NOTE : Here findFirst, findAny operations are returns the optional class.
		
		//NOTE : anyMatch, allMatch, noneMatch, findFirst, findAny THESE ARE SHORT CIRCUIT METHODS.
		//SHORT CIRCUIT MEANS IF AT THE POINT WHENEVER THESE CONDITIONS GET MATCH OR GETFIRST THEN THESE WILL STOP THE REST OF THE ELEMENT PROCESSING.
		System.out.println("The first element of the list is : "+list.stream().findFirst().get());
		System.out.println("The any element of the list is : "+list.stream().findAny().get());
		
		//EXAMPLE : FILTERING AND COLLECTING THE NAMES
		List<String> list1 = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda", "Ameet");
		
		long count = list1.stream().filter(x->x.length()>5).count();
		System.out.println("The elements which have length higher than the 5 count is : "+count);
		
		
		//EXAMPLE : SQUARING AND SORTING NUMBERS.
		List<Integer> asList = Arrays.asList(2, 4, 6, 8, 3);
		List<Integer> collect = asList.stream().map(x->x*x).sorted().toList();
		collect.forEach(System.out::println);
		
		
		//EXAMPLE : SUMMING VALUES.
		List<Integer> nums = Arrays.asList(2, 4, 6, 8, 3);
		System.out.println("Sum of the element is "+nums.stream().reduce(Integer::sum).get());
		
		//EXAMPLE : COUNTING OCCURANCE OF THE A CHARACTER
		
		String sentence = "Hello world";
		char[] charArray = sentence.toCharArray();
		
		//we can't do like this as we know that the stream() is doesn't have char method in it due to this reason below we are getting an error.
//		Arrays.stream(charArray);//The method stream(T[]) in the type Arrays is not applicable for the arguments (char[])
		
		//we have an method .chars() which creates stream of integer type means here this will return the as ascii value means respective char integer.
		//which is bounded with that number.
		
		IntStream chars = sentence.chars();
		//here below we are comparing with the l and x consist the integer then here java internally understand that is here it is checking with the ascii value.
		System.out.println("The l occurance count is : "+chars.filter(x->x == 'l').count());
		
		
		//Stateless and stateful
		
		//STATEFUL : THE OPERATION WHICH KNOWS ABOUT ALL THE ELEMENTS. LIKE EXAMPLE : IF YOU ARE MAKING A LIST OF ELEMENT SORTING OR FETCHING DISTINCT
		//THEN THERE ALL THE ELEMENTS THAT NEED TO KNOW THEN ONLY SORTING HAPPENS AND DISTINCT ELEMENT WILL BE FETCHED.
		//STATELESS : THIS IS NOT WORRY ABOUT THE OTHER ELEMENT THIS WILL TAKE CARE ABOUT ONLY CURRENT ELEMENT ONLY, LIKE EXAMPLE : WE ARE USING MAP AND
		//CALCULATING THE SQURE OF THE ELEMENT THEN WHICHEVER ELEMENT IT IS MAKING SQUARE THIS WILL CARE ABOUT THAT ONLY.
		
		//8) TOARRAY :
		//If you want to convert any stream into array as well as you want to terminate that then you have to use the toArray(); operation.
		Object[] array = Stream.of(1, 2, 3).toArray();
		System.out.println("The array elements are : "+array);
		
		//9) MIN/MAX
		System.out.println("Min value of the list is : "+Stream.of(1, 2, 3).min(Comparator.naturalOrder()));//Optional[1]
		System.out.println("Max value of the list is : "+Stream.of(1, 2, 3).max(Comparator.naturalOrder()));//Optional[3]
		
		//NOTE : STREAM CANNOT BE REUSED AFTER A TERMINAL OPERATION HAS BEEN CALLED, IF YOU USED THEN YOU WILL GET ERROR AS STREAM IS CLOSED OR USED.
		//example :
		
		List<String> names = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda", "Ameet");
		Stream<String> name = names.stream();
		name.forEach(System.out::println);
//		List<String> list2 = name.map(x->x.toUpperCase()).toList();//here will get an error stating that : stream has already been operated upon or closed
//		System.out.println(list2);
		
		//10) forEachOrdered : Wherever you use the parallelStream and want to access or print the elements in order then use the forEachhOrdered.
		List<Integer> asNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		asNumbers.parallelStream().forEach(System.out::println);//the out is not in ordered
		System.out.println("Printing elements using forEachOrdered : ");
		asNumbers.parallelStream().forEachOrdered(System.out::println);//the out is in ordered

	}
}
