package day3;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Shape s = new Rectangle (10,20);
		System.out.println("Area of Rectangle : " + s.findArea());
		s = new Circle (10.5);
		System.out.println("Area of Circle : " + s.findArea());
	}

}
