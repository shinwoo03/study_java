package animal2;

public class Animal {
	//품종
	String name;
	
	Animal(){
		System.out.println("Animal생성자");
	}
	Animal(String name){
		this.name= name;
	}
	
	
	
	
	
	//먹는다
	void eat() {
		System.out.println( name + "가 밥을 먹는다" );
	}
	
	//잠을잔다
	void sleep() {
		System.out.println( name + "가 잠을 잔다" );
	}
	
	
}
