package day4;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> studentList = new HashMap<>();
		studentList.put("048", "Surya");
		studentList.put("009", "Bharathwaj");
		studentList.put("304", "Suresh");
		studentList.put("304", "Suresh Y");
		studentList.put("305", "Suresh Y");
		studentList.put("041", "Santhosh");
		studentList.put("306", "Suresh");
		
//		System.out.println(studentList);
		
//		studentList.forEach(
//				(rollnumber, name) -> System.out.println(rollnumber + " -> " + name)
//				);
		studentList.forEach(
				(rollnumber, name) -> {
					if (name.endsWith("h"))
						System.out.println(rollnumber + " -> " +name.toUpperCase());
				}				
				);
	}
}
//Quiz Link : : https://bit.ly/4dqfbfT

//Attendance : https://bit.ly/PA-070524
//Trainer : Tambi
//Session : AN



