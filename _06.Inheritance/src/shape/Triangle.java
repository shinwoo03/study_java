package shape;

public class Triangle implements Shapable {
	
	int sideLength;
	Triangle(int sideLength){
		this.sideLength = sideLength;
	}
	
	
	public double getArea() {
		//밑변 * 높이 * 1/2
		//높이 (sideLength*sideLength)
		return sideLength * sideLength * 0.8;
	}
	public double  getAround() {
		return sideLength*3;
	}
}
