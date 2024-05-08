package day3;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	double findArea() {
		return Math.PI  * radius * radius;
	}
}
