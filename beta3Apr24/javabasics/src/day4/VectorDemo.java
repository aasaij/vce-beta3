package day4;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		list.add(10);
		list.add(20);
		list.add(23);
		list.add(20);
		list.add(0, 11);
		list.add(0,15);

//		System.out.println(list);
//		list.forEach(data -> System.out.println(data));
		//displaying the data which are divisible by 5
		list.stream()
			.filter(data -> data % 5 ==0)
			.forEach(data -> System.out.println(data));

	}

}
