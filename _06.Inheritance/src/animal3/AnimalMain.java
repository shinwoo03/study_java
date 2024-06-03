package animal3;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("진도");
		dog.eat();
		dog.doWhat();
		dog.sleep();
		
		Bird bird = new Bird("비둘기");
		bird.eat();
		bird.doWhat();
		bird.sleep();
	}
}
