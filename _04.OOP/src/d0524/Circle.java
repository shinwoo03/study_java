package d0524;

public class Circle {
	//(필드) 접근제한자(접근제어자) : public, protected, default, private
	//private : 클래스내에서 접근 가능 (클래스를 벗어나면 사용못함) - 정보은닉
	private int radius; //반지름
	
	Circle(int radius){
		this.radius = radius;
		
	}
	//반지름을 담는 메소드 : setRadius () - setter메소드
	//반지름을 알려주는 메소드 : getRadius() - getter메소드
	int getRadius () {
		return radius;
	}
	
	
	//원 넓이를 구한다. 원 둘레를 구한다
	double calculateArea () {
		//3.14 * 반지름 * 반지름
		double area = 3.14* radius *radius ;
		return area;
	}
	
	double calculateAround() {
		//2*3.14*반지름
		double around = 2 * 3.14 * radius;
		return around;
	}
	
}
