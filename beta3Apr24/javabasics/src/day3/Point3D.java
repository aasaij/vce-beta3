package day3;

public class Point3D extends Point2D {
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y); //calling base class constructor having two parameters
		this.z = z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	@Override
	// overriding toString() of Point2D class
	public String toString() {
		return super.toString() +"," + z;
	}
}
