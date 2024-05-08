package day2;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		while(n != 0) {
//			int digit = n % 10;
			sum = sum * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(sum);
	}
}

/*
 * while (<condition>){
 * 	<statements>
 * }
 */

