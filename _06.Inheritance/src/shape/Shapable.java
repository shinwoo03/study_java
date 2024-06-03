package shape;

public interface Shapable {
	
//	각각 도형의 기능 : 넓이를 구한다, 둘레를 구한다 등등 -> 추상메소드로 선언
	//상속받을 클래스(원/삼각형/사각형)의 종류에 따라 넓이계산처리가 다르다
	
	abstract double  getArea();
	abstract double  getAround();
//	public static final int no=0;
	

}
