package polygon;

public class Square {
	public int sideLength;
	public Square(int sideLength){
		this.sideLength = sideLength;
	}
	public int getArea() {
		return sideLength * sideLength;
	}
}