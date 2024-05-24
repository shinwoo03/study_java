package d0524;

public class Rectangle {
	//너비, 높이
	private int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	
	
	//넓이를 구한다
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	//둘레를 구한다.
	int calculateAround() {
		return (width + height) *2 ;
	
	}
	
	

}
