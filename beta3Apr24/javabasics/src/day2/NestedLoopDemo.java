package day2;
//5
//1			1
//12		2
//123		3
//1234		4
//12345		5
public class NestedLoopDemo {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i<=n; i++) { /// rows
			for (int j = 1; j<=i; j++) //cols
//				System.out.print(j);
				System.out.print((char)(64+j));
			System.out.println();
		}		
	}
}
