package day3;

public class Point2D {
//	int x, y; //default access specifier
	private int x, y;
	//constructor with parameters
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	@Override //--> Overriding toString() of Object class
	public String toString() {
		return x + "," + y;
	}

}
