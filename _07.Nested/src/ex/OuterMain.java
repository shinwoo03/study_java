package ex;

public class OuterMain {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		System.out.println(out.filed);
		
		//Outer의 인스턴스 멤버 중 Inner1 생성하기
		Outer.Inner1 inner1 = new Outer().new Inner1();
		System.out.println( inner1.field );
		inner1.innerMethod();
		
		
//		new Outer();
		Outer.Inner2 inner2 = new Outer.Inner2();
		System.out.println(inner2.field);
		inner2.innerMethod();
		
	}


}
