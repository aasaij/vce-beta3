package day1;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
//		System.out.println("Welcome to World of Java Prorgram");
//		Scanner in = new Scanner(System.in);
		int principal;
		double rate, time, interestAmount;
		principal = 10000;
		rate = 10.99;
		time = 6;
		interestAmount = principal * Math.pow(1 + rate / 100, time);
//		System.out.println("Compound Interest : " + interestAmount);
//		System.out.printf("Compound Interest : %.2f", interestAmount);
		System.out.println(String.format("Compound Interest : %.2f", interestAmount));
	}
}
/*
 * Scanner class methods
 * nextByte()
 * nextShort()
 * nextInt()
 * nextLong()
 * nextFloat()
 * nextDouble()
 * nextBoolean()
 * next() // read a word
 * nextLine() // read a sentence
 */
