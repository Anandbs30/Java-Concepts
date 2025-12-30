package V14_Java_Arrays;

public class V14_1D_Arrays {
	public static void main(String[] args) {

		//Note : int a = 10; means here the value of a is 10 and it stored into stack
		//Note : int[] a = new arr[5]; here this is creating an new object so its storing into heap AND THE STARTING INDEX ADDRESS SAVED INTO STACK
		int[] ar = {1, 2, 3, 4, 5};
		for(int i =0; i<ar.length;i++) {
			System.out.print(ar[i]);
			if(i<ar.length-1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nThis is the array address : "+ar);//output : [I@58d25a40
		//[I@58d25a40 : here [ denotes array I means data type as Integer and its address hashingCode
		
		//we can print array elements using forEach loop
		boolean b  = true;
		for(int e : ar) {
			if(!b) {
				System.out.print(",");
			}
			System.out.print(e);
			b = false;
		}
		
		//Q : Search an element in an array
		int n = 5;
		for(int i : ar) {
			if(i == n) {
				System.out.println("\nFound : "+n);
			}
		}
		
		//Q : Max number
		int max = Integer.MIN_VALUE;
		int[] arr = {2, 12, 4322, -32, 22};
		for(int i :arr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("The maximum value is : "+max);
		
		//Q : Print reverse array
		System.out.println("reversed array is : ");
		for(int i = arr.length-1; i>=0;i--) {
			System.out.print(arr[i]);
			if(i-1>=0) {
				System.out.print(", ");
			}
		}
		
		//Q : Print sum of array
		int sum = 0;
		for(int j : arr) {
			sum += j;
		}
		System.out.println("\nThe sum of the array elements is : "+sum);
	}
}
