package polyon;

public class Triangle extends Shape {
	//밑변
	int bottom;
	
	//높이
	//넓이를 구한다.
	Triangle(int bottom, int height){
		super(height);
		this.bottom = bottom;
	}
	double getArea() {
		return bottom * height *0.5;
	}
	
}
