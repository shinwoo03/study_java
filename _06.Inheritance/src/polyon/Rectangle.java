package polyon;

public class Rectangle extends Shape {
	//너비
	int width;
	Rectangle(int width, int height){
		super(height);
		this.width = width;
	}
	//높이
	//넓이를 구한다
	 double getArea() {
		 return width * height;
	 }
}
