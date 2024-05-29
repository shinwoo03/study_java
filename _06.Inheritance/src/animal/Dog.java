package animal;

public class Dog extends Animal {
	//품종
	//품종
		String name;
		
		//먹는다
		void eat() {
			System.out.println( name + "가 밥을 먹는다" );
		}
		
		//잠을잔다
		void sleep() {
			System.out.println( name + "가 잠을 잔다" );
		}
		//땅위를 달린다
		void action() {
			System.out.println( name + "가 땅위를 달린다" );
		}
}
