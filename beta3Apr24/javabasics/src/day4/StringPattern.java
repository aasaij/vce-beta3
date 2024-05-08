package day4;
//Venu
//V
//Ve
//Ven
//Venu
public class StringPattern {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
//		for (int i = 1; i<=str.length();i++) {
//			System.out.println(str.substring(0, i));
//		}
		for (int i = 1; i<=str.length();i++) {
			System.out.println(str.substring(0, i)
					+" ".repeat((str.length()-i)*2)+ str.substring(0, i));
	}
		
	}
}
//
//   V
//  Ve
// Ven
//Venu

