package day4;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //Non-generic
		list.add("Surya"); //adding string into list
		list.add(77); //adding an integer into list
		list.add(9.9); //adding double into list
		list.add(0, "Santhosh");
		System.out.println(list);

	}

}
