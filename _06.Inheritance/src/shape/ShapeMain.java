package shape;

public class ShapeMain {
	public static void main(String[] args) {
	//원객체 생성, 넓이와 둘레 출력하기
	Circle c = new Circle(5);
	//청사각형객체 생성, 넓이와 둘레 출력하기
	Square s = new Square(5);
	//정삼각형객체 생성, 넓이와 둘레 출력하기
	Triangle t = new Triangle(5);
	shapeInfo( c );
	shapeInfo( s );
	shapeInfo( t );
	}
	
	static void shapeInfo(Shapable shape) {
		System.out.println("넓이 : " + shape.getArea());
		System.out.println("둘레 : " + shape.getAround());
		System.out.println("--------------------");
	}
	
	
}
