package day2;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {

	public static void main(String[] args) {
//		String[] nameList;
//		
//		nameList = new String[10];
		String[] nameList = {"Venu", "Surya", "Zoya", "Bharathwaj"};
		//Sorting names in ascending order
		Arrays.sort(nameList);	
		System.out.println("Ascending Order :");
		for (int i =0; i<nameList.length;i++)
			System.out.println(nameList[i]);
		//Sorting names in descending order
		Arrays.sort(nameList, Comparator.reverseOrder());
		//printing the names using enhanced for loop --> for each
		System.out.println("Descending Order :");
		for (String name : nameList)
			System.out.println(name.toUpperCase());

	}

}
