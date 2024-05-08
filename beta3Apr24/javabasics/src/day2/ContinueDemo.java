package day2;

public class ContinueDemo {

	public static void main(String[] args) {
		outerLoop: // label
		for (int j = 1; j<=5; j++) {
			for (int i= 1; i<=10; i++) {
				if (i % 3 == 0)
//					continue;
//					continue outerLoop;
					return;
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
