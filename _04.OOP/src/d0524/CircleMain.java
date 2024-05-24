package d0524;

public class CircleMain {
	public static void main(String[] args) {
		//반지름이 10인 원 만들기
		int radius = 10;
		Circle c = new Circle ( radius );
		//원의 넓이 구하기
//		double area = c.calculateArea();
		System.out.println("원의 반지름 : " + c.getRadius());
//		c.radius = 5; //필드에 직접 접근해 데이터를 변경하지 못하게 접근제한하자
		System.out.println("원의 넓이 : " + c.calculateArea());
		
		
	}
	
	
}
