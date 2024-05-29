package math;

import polygon.Rectangle;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3);
		System.out.println("가로 "+ r.width);
		System.out.println("세로 "+ r.height);
		System.out.println("사각형넓이 "+ r.getArea());
	}
	
}