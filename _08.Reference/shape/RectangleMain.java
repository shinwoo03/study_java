package shape;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,5);
		Rectangle r2 = new Rectangle(5,2);
		if( r1.equals( r2) ) {
			System.out.println("같은 사각형");
		}else {
			System.out.println("다른 사각형");
			
		}
	}
}