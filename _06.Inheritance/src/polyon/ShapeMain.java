package polyon;

public class ShapeMain {
	public static void main(String[] args) {
		//사각형만들기 : 3X4
		Rectangle r = new Rectangle (3, 4);
		System.out.printf("너비, 높이 : %d, %d \n" , r.width, r.height);
		System.out.println("사각형넓이 : " + r.getArea());
		
		//삼각형만들기 : 3X4
		Triangle t = new Triangle (3, 4);
		System.out.printf("밑변, 높이 : %d, %d \n" , t.bottom, t.height);
		System.out.println("심각형넓이 : " + t.getArea());
		
		
		
		
	}
}
