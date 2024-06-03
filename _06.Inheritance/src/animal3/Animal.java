package animal3;

abstract public class Animal {
// 품종, 생성자, 먹는다, 잠을잔다
	String kind;
	
	
	public Animal(String kind){
		this.kind = kind;
	}
	
	//먹는다
		void eat() {
			System.out.println( kind + "가 밥을 먹는다" );
		}
		
		//잠을잔다
		void sleep() {
			System.out.println( kind + "가 잠을 잔다" );
		}
		abstract void doWhat() ;
			//달린다, 하늘난다, 물속에서 헤엄친다 등등
			//구체화 시킬수 없기 때문에 추상
		
	
}
