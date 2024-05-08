package day2;

public class MyDateTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//Creation of object for MyDate class
		MyDate d1 = new MyDate(); //Method 1
		if (d1.setDate(4, 5, 2024))
			System.out.println(d1.getDayOfWeek() + " "+ d1.getDay() +
					", "+d1.getMonth() +  " " + d1.getYear());
		else
			System.out.println("Invalid Date!");
		//Method 2 --> creation of object for MyDate class
		MyDate d2 =(MyDate)Class.forName("day2.MyDate").newInstance();
		d2.setDate(10, 10, 2024);
		System.out.println(d2);		
	}
}

//BankAccount
//acNumber : long
//acName : String
//balance : double
//acType : String
//
//createAccount(acNumber : long, acName : String, inital : double, acType : String) : void
//deposit(amount : double) : boolean;
//withdraw(amount : double) : boolean;

//Quiz Link : https://bit.ly/3QtY9DO
//
//Attendance Link : https://bit.ly/CC-040524
//Trainer : Tambi
//Session: AN

	


