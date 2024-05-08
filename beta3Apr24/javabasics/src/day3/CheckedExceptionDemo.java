package day3;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			char ch = (char)System.in.read();
			System.out.println(ch);
		}catch(java.io.IOException ex) {
			System.out.println("IOException!");
		}
		System.out.println("Thank you for talking always inside class");
		System.out.println("Because you are all Engineers!");
	}

}
