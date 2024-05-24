package d0524;

public class RectangleMain {
	public static void main(String[] args) {
		//가로세로 4 * 2인 사각형 만들기
		Rectangle r = new Rectangle (4,2);
		System.out.printf("가로 %d, 세로%d인 사각형 \n",r.getWidth(), r.getHeight());
		System.out.println("사각형의 넓이 : " + r.calculateArea());
		System.out.println("사각형의 둘레 : " + r.calculateAround());
		
		
		
		
		
	}

}
