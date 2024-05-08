package day2;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice="";
		do {
			int n = in.nextInt();
			if ( n > 0)
				System.out.println("+ve");
			else if ( n < 0)
				System.out.println("-ve");
			else
				System.out.println("Zero");
			System.out.print("Want to check more [Y]es/[No]?");
			choice = in.next();
		}while(choice.equalsIgnoreCase("Y"));
	}
}
