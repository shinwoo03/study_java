package animal2;

public class Bird extends Animal {

		
		Bird(String name){
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
			//하늘을 난다
			void flying() {
				System.out.println( name + "가 하늘을 난다" );
			}
}
