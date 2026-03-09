package V36_Collection_FrameWork.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
/*
 * When to use ParallelStream?
 * -> ParallelStream are most effective for the cpu-intensive or large data set where task are independent.
 * 	  They may add overhead for simple tasks or small data set.
 */
public class ParallelStream_Class {
	public static void main(String[] args) {
		//ParallelStream is an type of the Stream that enables Parallel processing of elements.
		//Means this allows multiple threads to process parts of the stream simultaneously.
		//Due to multiple threads are working parallel here this can significantly improve performance for large data sets.
		//Here work is distributed across multiple threads.
		long startTime = System.currentTimeMillis();
		List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
		List<Long> list2 = list.stream().map(ParallelStream_Class::factorial).toList();
		long endTime = System.currentTimeMillis();
		System.out.println("To perform given operation using sequential stream it took time : "+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		list = Stream.iterate(1, x -> x+1).limit(20000).toList();
		list2 = list.parallelStream().map(ParallelStream_Class::factorial).toList();
		endTime = System.currentTimeMillis();
		System.out.println("To perform given operation using parallel stream it took time : "+(endTime - startTime)+"ms");
		
		//If we use ParallelStream where the previous element is depending on each other then how it will return wrong result
		//Considering [1, 2, 3, 4, 5] output required is sum of each elements [1, 2, 6, 20, 15] this is known as cumulative sum.
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = 0;
		//below we will get an error stating that inside lambda expression you are modifying the value of some here lambda expression will use only
		//final variables.
//		asList.stream().map(x -> {
//			int i = x + sum;
//			sum = i;
//			return i;
//		});
		List<Integer> asList1 = Arrays.asList(1, 2, 3, 4, 5);
		//here to resolve above issue we will use the AtomicInteger which have some methods.
		AtomicInteger sum1 = new AtomicInteger(0);
		
		List<Integer> list3 = asList1.stream().map(sum1::addAndGet).toList();
		System.out.println("Through the stream will get the answer as we are expected as [1, 3, 6, 10, 15] : "+list3);//output : [1, 3, 6, 10, 15]
		
		//but if we use the parallel stream then what happen.
		
		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4, 5);
		//here to resolve above issue we will use the AtomicInteger which have some methods.
		AtomicInteger sum2 = new AtomicInteger(0);
		
		List<Integer> list4 = asList2.parallelStream().map(sum2::addAndGet).toList();
		System.out.println("Through the parallel stream will get the answer as we are expected as [1, 3, 6, 10, 15] : "+list4);//output : [15, 14, 12, 9, 5]
	
		//We can use the sequential() to make after parallel stream result into sequential to calculate and make better result.
		//sequential() we use after the termination operations. lie map(), filter() etc.
		list2 = list.parallelStream().map(ParallelStream_Class::factorial).sequential().toList();
	}
	
	private static long factorial(int n) {
		long result = 1;
		for(int i = 2; i<=n;i++) {
			result *= i;
		}
		return result;
	}
}
