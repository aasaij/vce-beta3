package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Namitha");
		list.add("Nayanthara");
		list.add("Srileela");
		list.add("Anushka");
		ArrayList<String> subList = new ArrayList<>();
		subList.add("Samantha");
		subList.add("Bharathwaj");
		subList.add("Trisha");
		list.addAll(subList);

////		list.forEach(name -> System.out.println());
//		System.out.println(list);
//		list.remove("Nayanthara");
//		System.out.println("*****************");
//		System.out.println(list);
//		System.out.println("*****************");
//		list.remove(0);
//		System.out.println(list);
////		list.forEach(name -> System.out.println());
//		//Removing the sublist
//		list.removeAll(subList);
//		System.out.println("*****************");
//		System.out.println(list);
//		list.removeIf(name -> name.endsWith("a"));
//		list.retainAll(subList);
//		System.out.println(list.size());
//		list.clear();
		
//		System.out.println(list);
		//Traversing the list using iterator() --> Uni-direction
//		Iterator<String> itr = list.iterator();
		//method 1
//		while (itr.hasNext())
//			System.out.println(itr.next());
		
		//method 2
//		itr.forEachRemaining(element -> System.out.println(element));
		//List iterator --> bi-direction
//		Traversing the list in reverse order using list iterator
		ListIterator<String> litr = list.listIterator(list.size());
		while (litr.hasPrevious())
			System.out.println(litr.previous());

	}

}
