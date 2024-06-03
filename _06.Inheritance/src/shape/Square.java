package shape;

public class Square implements Shapable {
	
	int sideLength;
	Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	public double getArea() {
		return sideLength * sideLength;
	
	}
	
	
	public double getAround() {
		return sideLength * 4;
	}

}
