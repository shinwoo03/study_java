package test1;
//1. 다음과 같이 클래스 A가 정의되어 있을 때 코드를 작성하여 프로그램을 완성하기오.
class A{
	int m ;
	void method () {
		System.out.println("A클래스의 m값 : " + m);
	}
}



public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
		
		a.method();
	}
	
}
