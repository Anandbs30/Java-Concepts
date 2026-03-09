package V36_Collection_FrameWork.Java8Features.Streams.Collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Examples_Class {
	public static void main(String[] args) {
		//Example 1 : Collecting elements by there  length
		List<String> ex1 = Arrays.asList("Anna", "Bob", "Alexander", "Brain", "Alice", "Anand");
		System.out.println("Collected the elements based on there lenght : "+ex1.stream().collect(Collectors.groupingBy(String::length)));
		
		//Example 2 : Counting word occurrences
		String statement = "hello world hello java world";
		System.out.println("Counting word occurrences : "
							+Arrays.stream(statement.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting())));
		
		//Example 3 : Partitioning even and odd numbers
		
		List<Integer> ex3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Separating the even and odd numbers : "+ex3.stream().collect(Collectors.partitioningBy(x->x%2==0)));
		
		//Example 4 : Summing values in a map
		
		Map<String, Integer> items = new HashMap<>();
		items.put("Apple", 10);
		items.put("Banana", 20);
		items.put("Orange", 15);
		
		//we can sum the int values in 2 ways
		//1 way 
		System.out.println("The all elements count is : "+items.values().stream().reduce(Integer::sum));//output : Optional[45]
		System.out.println("The all elements count using Collectors function : "+items.values().stream().collect(Collectors.summingInt(x->x)));//output : 45
		
		//Example 5 : Creating a Map from Stream elements 
		//Here in the below we have to use the toMap means here we don't need to do any transformation or operation just we have to map the values with keys
		//here below key is the element length.
		//This will used when you have direct values and you have to map with the keys then only.
		List<String> fruits = Arrays.asList("Apple", "Banana", "Chery");
		System.out.println(fruits.stream().collect(Collectors.toMap(x->x.toUpperCase(), x->x.length())));
		
		//Example 6 : Merge function its an binary operator which will take two integers and return sum of those integers.
		List<String> fruitsDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println(fruitsDuplicates.stream().collect(Collectors.toMap(x->x, v->1,(a, b)->a+b)));
		
		
	}
}
