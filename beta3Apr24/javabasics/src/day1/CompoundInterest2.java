package day1;

import java.util.Scanner;

public class CompoundInterest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int principal;
		double rate, time, interestAmount;
		System.out.print("Principal Amount : ");
		principal = in.nextInt();
		System.out.print("Rate of Interest : ");
		rate = in.nextDouble();
		System.out.print("Number of years : ");
		time = in.nextDouble();
		in.close();
		interestAmount = principal * Math.pow(1 + rate / 100, time);
		System.out.println(String.format("Compound Interest : %.2f", interestAmount));
	}

}
//Quiz Link : https://bit.ly/3wlimVs
//
//Attendance Link : https://bit.ly/VV-030524
//Trainer : Tambi
//Session : FN


