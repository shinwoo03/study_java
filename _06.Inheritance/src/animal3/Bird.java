package animal3;

public class Bird extends Animal {
	//품종, 생성자 먹는다, 잠을잔다, 하늘을 난다.
	
	public Bird(String kind){
		super(kind);
	}
	
	
	void doWhat() {
		System.out.println(kind + "하늘을 난다");
	}
}
