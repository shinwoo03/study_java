package d0524;

public class RectangleError {
	//너비, 높이
	private int width, height;
	
	RectangleError(int width, int height) throws Exception{
		if(width <= 0 || height <=0) {
			throw new Exception("너비나 높이는 0이하 안됌!!");
		}
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
