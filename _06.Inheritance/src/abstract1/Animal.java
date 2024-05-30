package abstract1;


//구체화 할 수 없는 추상메소드 : abstract 클래스
//abstract (추상) 클래스는 구체화 할 수 없다 : 객체생성 불가
// ---> 상속을 통해서만 생성이 가능하다
abstract public class Animal {
	String kind;
	
	Animal(String kind){
		this.kind = kind;
	}
	
	//구체적으로 처리를 할 수 없다면 본체{} 없이 ;으로 메소드를 선언  
	
	abstract void sound(); //{ 추상
//		System.out.println( kind + "소리를 낸다");
	//}
	
}
