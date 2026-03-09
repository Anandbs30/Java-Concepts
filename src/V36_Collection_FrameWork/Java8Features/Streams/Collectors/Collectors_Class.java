package V36_Collection_FrameWork.Java8Features.Streams.Collectors;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Collectors_Class {
	public static void main(String[] args) {
		//Collectors is an utility class
		//Which provides a set of methods too create a common collectors.
		List<String> names = Arrays.asList("Anand", "Kaveri", "Mangal", "Lalita", "Basagouda", "Ameet");
		//Here the toList() Returns unmodifiable list we can't modify this.
		
		//1). The out put is storing into the list using Collectors : Collecting to a List
		List<String> list = names.stream().filter(x->x.startsWith("A")).toList();
		System.out.println(list);
		
		
		//Here the collect(Collectors.toList()) Returns a mutable list (usually ArrayList) we can modify this.
		List<String> collect = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> nums = Arrays.asList(10, 2, 7, 6, 3, 4, 5, 6, 1, 3, 5, 7, 9, 2);
		
		//2). Collecting to Set
		//Basically below Collectors.toSet() only allow to store into collect2 variable as unique elements as we know set properties. 
		Set<Integer> collect2 = nums.stream().collect(Collectors.toSet());
		System.out.println("The unique values are : "+collect2);
		
		//3). Collecting a specific collection. We can use Any Collection part instead of the ArrayList<>().
		ArrayList<String> collect3 = names.stream().collect(Collectors.toCollection(()->new ArrayList<>()));
		
		
		//4). Joining Strings
		//Concatenates stream elements into a single String as given output below.
		System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));//output : ANAND, KAVERI, MANGAL, LALITA, BASAGOUDA, AMEET
		
		
		//5). Summarizing data
		//Generating statistical summary (count, sum, min, max, average)
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
		IntSummaryStatistics collect4 = numbers.stream().collect(Collectors.summarizingInt(x->x));
		
		System.out.println("Elements count : "+collect4.getCount());
		System.out.println("Elements sum : "+collect4.getSum());
		System.out.println("Elements average : "+collect4.getAverage());
		System.out.println("Max Element is : "+collect4.getMax());
		System.out.println("Min Elements is : "+collect4.getMin());
		
		//Calculating average directly : NOTE : we have methods as given below for averageinDouble like that we have methods to calculate sum, min, max, etc... 
		Double collect5 = numbers.stream().collect(Collectors.averagingDouble(x->x));
		System.out.println(collect5);
		
		//6). Grouping elements.
//		a). classifier is a variable name where normal grouping will be happen based on your lambda condition. 
		//Example : we have words in the below we have to group them accordingly their char count or length count.
		List<String> words = Arrays.asList("Hello", "world", "java", "stream", "Collection", "Anand", "Kavu");
		//Below line output : {4=[java], 5=[Hello, world], 6=[stream], 10=[Collection]}
		System.out.println("The words are gouped based on their length : \n"+words.stream().collect(Collectors.groupingBy(String::length)));
		
		//printing with size of the list.
		words.stream()
        .collect(Collectors.groupingBy(String::length))
        .forEach((length, list1) ->
            System.out.println(length + ", " + list1.size() + ", " + list1)
        );
		
		//b). Down Stream collector which goes under an a Collector as given below : downstream 
		//means whatever you did am grouping you want to again another segregation with that group elements using another grouping condition.
		System.out.println("Down Stream collector : \n"+words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
		
		//c). here we have a classifier, downstream and Map where we can store the elements into a new map as given below
		TreeMap<Integer,String> collect6 = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.joining(", ")));
		System.out.println("classifier, downstream and Map : \n"+collect6);//using this we can use the treeMap methods here.
		
		//7). Partitioning Elements : 
		//This Partitioning elements into two groups (true and false) based on a predicate.
		//Here this will make two groups where false where given condition is false and another is true where condition is passing
		//output : {false=[Hello, world, java, Anand, Kavu], true=[stream, Collection]}
		System.out.println("Partitioning Elements : \n"+words.stream().collect(Collectors.partitioningBy(x->x.length()>5)));
		
		
		//8). Mapping and Collecting
		//Applies the Mapping condition before collecting
		//Output : [HELLO, WORLD, JAVA, STREAM, COLLECTION, ANAND, KAVU]
		System.out.println("Mapping and the Collecting : \n"+words.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));
		
		
		
	}
}
