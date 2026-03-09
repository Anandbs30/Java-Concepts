package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyOperations {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		Stream<String> filter = names.stream().filter(name->{
			System.out.println("Filtering names : "+name);
			return name.length()>3;
		});
		
		System.out.println("Before terminal operations");
		
		
		//if you comment the below code then the here the output we get only : Before terminal operations 
		//We don't get the Filtering names : because until terminal operation is not there till that it doesn't print the stream values.
		
		List<String> collect = filter.collect(Collectors.toList());
		
		System.out.println("After terminal operation : ");
		System.out.println(collect);
		
		
	}
}
