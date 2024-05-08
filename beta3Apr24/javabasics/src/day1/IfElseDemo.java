package day1;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		//Method 1
		if ( x < y &&  x < z) {
			if ( y < z )
				System.out.println(x + " < " + y + " < " + z);
			else
				System.out.println(x + " < " + z + " < " + y);
		}
		else if (y < z) {
			if ( x < z)
				System.out.println(y + " < " + x + " < " + z);
			else
				System.out.println(y + " < " + z + " < " + x);
		}
		else if (x < y)
			System.out.println(z + " < " + x + " < " + y);
		else
			System.out.println(z + " < " + y + " < " + x);
	}
}
/*
 * 10 15 12
 * 10 < 12 < 15
 */
