package day4;

import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		int arr[] = {10,20,12,4,6,7,8,55,3,34,5,67};
		//Finding highest element in an Integer array
		System.out.println(Arrays.stream(arr).max().getAsInt());
		//Finding lowest element in an Integer array
		System.out.println(Arrays.stream(arr).min().getAsInt());
		//Finding average in an Integer array
		System.out.println(Arrays.stream(arr).average().getAsDouble());
		//displaying array element which are divisible by 5
		Arrays.stream(arr).filter(element -> element % 5 == 0).forEach(
				data -> System.out.println(data)
				);		
	}

}
