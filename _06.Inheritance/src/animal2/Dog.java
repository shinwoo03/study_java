package animal2;

public class Dog extends Animal {

		
		Dog(String name){
			super(name);
		}
		
//		//먹는다
//		void eat() {
//			System.out.println( name + "가 밥을 먹는다" );
//		}
//		
//		//잠을잔다
//		void sleep() {
//			System.out.println( name + "가 잠을 잔다" );
//		}
		//땅위를 달린다
		void action() {
			System.out.println( name + "가 땅위를 달린다" );
		}
}
