package day3;

public class Rectangle extends Shape {
	double len, bred;
	
	public Rectangle(double len, double bred) {
		this.len = len;
		this.bred = bred;
	}
	
	@Override
	double findArea() {
		return len * bred;
	}

}
