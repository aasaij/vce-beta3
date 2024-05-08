package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>(); //Generic
		nameList.add("Surya");
		nameList.add("Santhosh");
		nameList.add("Bharathwaj");
		nameList.add("Suresh");
		nameList.add("Harsha");
//		System.out.println(nameList);
//		Collections.sort(nameList);
//		nameList.sort(null); //Ascending order
//		System.out.println(nameList);
		//Traversing the list -- Method 1
//		System.out.println("Ascending Order");
//		for (String name : nameList) {
//			System.out.println(name.toUpperCase());
//		}
//		System.out.println("\nDescending Order");
//		Collections.sort(nameList, Comparator.reverseOrder());
//		nameList.sort(Comparator.reverseOrder()); //descending order
		//Traversing of List -- Method 2
		//forEach() of ArrayList
//		nameList.forEach(name -> System.out.println(name));
		nameList.add("CCC");
//		nameList.forEach(name -> System.out.println(name));	
		//Printing the names which ends with "a"
		nameList.stream()
			.filter(name -> name.endsWith("a"))
			.forEach(name -> System.out.println(name));
	}

}
