package day1;

import java.util.Scanner;

public class InterestCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char interestType;
		int principal;
		double rate, time, interest;
		System.out.print("Principal : " );
		principal = in.nextInt();  // scanf("%d", &n)
		System.out.print("Rate of Interest : " );
		rate = in.nextDouble();
		System.out.print("Number of years : " );		
		time = in.nextDouble();
		System.out.print("[C]ompound Interest/[S]impleInterest ? :");
		interestType = in.next().charAt(0);
		
		if (interestType=='C' || interestType =='c') {
			interest = principal * Math.pow(1+rate/100, time)-principal;
			System.out.println("Compound Interest : " + interest);
		}
		else {
			interest = principal * rate/100*time;
			System.out.println("Compound Interest : " + interest);
		}
	}
}
/*
 * if (<condition>){
 * 	<true_statement>
 * }
 * else{
 * 	<false_statement>
 * }
 * 
 */




