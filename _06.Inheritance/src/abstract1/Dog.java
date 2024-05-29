package abstract1;

public class Dog extends Animal {
//	String kind;
	Dog(String kind){
//		this.kind = kind;
		super(kind);
	}
	
	void sound() {
		System.out.println(kind + "멍멍!");
	}
	
}
