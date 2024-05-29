package abstract1;

// final
//people은 추상이라 선언못함.
abstract public class People {
	//이름, 나이
		String name;
		int age;
		
		//먹는다
		void eat() {
			System.out.println( name + " 먹는다");
		}
		//잠을잔다
		void sleep() {
			System.out.println( name + " 잠을 잔다");
		}
		
		abstract void go();
		
		
}
