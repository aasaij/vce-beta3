package day1;

//import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) throws IOException {
//		DataInputStream in = new DataInputStream(System.in);
		Scanner in = new Scanner(System.in);
		int principal;
		double rate, time, interest;
		System.out.print("Principal : " );
		principal = in.nextInt();
		System.out.print("Rate of Interest : " );
		rate = in.nextDouble();
		System.out.print("Number of years : " );		
		time = in.nextDouble();
		interest = principal * rate * time / 100;
		System.out.println("Simple Interest : " + interest);
	}

}
