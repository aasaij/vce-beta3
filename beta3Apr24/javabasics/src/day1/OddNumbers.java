package day1;
//Program to print Odd Numbers from 1 to N
public class OddNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n = new java.util.Scanner(System.in).nextInt();
		//Printing odd numbers from 1 ... N
//		for (int i = 1; i<=n;i+=2) {
//			System.out.println(i);
//		}
		//Printing odd numbers from N ... 1
		for (int i = n%2==0?--n:n;i>=1; i-=2) {
			System.out.println(i);	
		}	
	}
}
//Quiz Link : https://bit.ly/44wQnyQ

//Attendance : https://bit.ly/VV-030524
//Trainer : Tambi
//Session : AN

		
	
	
