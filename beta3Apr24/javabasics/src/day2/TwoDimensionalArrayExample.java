package day2;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
//		int[][] arr;
//		int[] []arr1;
//		int [][]arr2;
//		int []arr3[];
//		int arr4[][];
		int[][] arr; 
		//Jagged array example
		arr = new int[5][]; //creating rows dimension
		arr[0] = new int[4]; // first row having 4 columns
		arr[1] = new int[3]; //second row having 3 columns
		arr[2] = new int[5]; // third row having 5 columns
		arr[3] = new int[2]; //fourth row having 2 columns
		arr[4] = new int[1]; //fifth row having 1 column 
	}
}
