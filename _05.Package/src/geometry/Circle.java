package geometry;


public class Circle {
	public int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}