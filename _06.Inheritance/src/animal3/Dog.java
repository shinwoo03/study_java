package animal3;

public class Dog extends Animal {
	//품종, 생성자, 먹는다, 잠을잔다, 땅위를 달린다.
	
	
	public Dog(String kind){
		super(kind);
	}
	
	void doWhat () {
		System.out.println(kind + "달린다");
	}

}
