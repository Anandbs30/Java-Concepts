package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams_Class {
	public static void main(String[] args) {
		
		//Wrapper classes
		Integer[] num = {1, 2, 3, 4, 5, 6, 7};
		//Here the type is Integer of the Stream
		Stream<Integer> stream2 = Arrays.stream(num);
		
		
		//Primitive data type
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		//Here the type of stream is IntStrea
		IntStream stream = Arrays.stream(nums);
		
		//IntStream also have so many methods. Note to run these methods we have to box them using boxed()
		//Boxed means basically we are converting the primitive data type into Wrapper classes.
		//Range()
		//Here in the output of below line will exclude the 5 and print 1, 2, 3, 4 only
		System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
		
		//rangeClosed() through this both initial value and end value given are included.
		//Output : 1, 2, 3, 4, 5
		System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));
		
		
		//IntStream.of be like Map.of()
		IntStream.of(1, 2, 3, 4, 5);
		
		//to generate the random double numbers, we can generate the int etc.
		DoubleStream doubles = new Random().doubles(3);
//		System.out.println(doubles.boxed().toList());
		
		IntStream mapToInt = doubles.mapToInt(x->(int)(x+1));
		System.out.println(mapToInt.sum());
	}
}
