package abstract1;

public class Chicken  extends Animal {
//	String kind;
	Chicken(String kind){
		super(kind);
//		this.kind = kind;
	}
	
	void sound() {
		System.out.println(kind + "꼬끼오~");
	}
	
}
