package V14_Java_Arrays;

public class V14_2D_Arrays {
	public static void main(String[] args) {
		int[][] ar = new int[2][3];
		int[][] arr = {{1, 2, 3, 4}, {4, 3, 2, 1},{5, 6, 7, 8}};
		//Print 2D array elements using for each loop
		for(int i[] : arr) {
			for(int j : i) {
				System.out.print(j+", ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Print 2d Array elements using For loop
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				if(j<arr[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		
		
		
		//Array with different array length called as Jagged array 4x3
		char arrr[][] = {{'a', 'b', 'c'},{'a', 'b', 'c'},{'a', 'b', 'c'}, {'a', 'b', 'c'}};
		for(int i = 0; i<arrr.length;i++) {
			for(int j = 0; j<arrr[i].length;j++) {
				System.out.print(arrr[i][j]);
				if(j<arrr[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
