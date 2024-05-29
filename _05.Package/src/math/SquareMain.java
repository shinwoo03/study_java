package math;

import polygon.Square;

public class SquareMain {
	public static void main(String[] args) {
		Square s = new Square(5);
		System.out.println("한변의 길이 " + s.sideLength );
		System.out.println("정사각형 넓이 "+ s.getArea());
	}
}