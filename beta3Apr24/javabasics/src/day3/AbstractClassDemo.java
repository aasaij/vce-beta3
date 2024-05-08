package day3;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Shape s = new Rectangle(10,20);
		System.out.println("Area of Rectangle : " + s.findArea());
	}
}
