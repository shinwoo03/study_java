package animal2;


public class AnimalMain {
	public static void main(String[] args) {
		
		Animal a = new Animal("호랑이");
	
		a.eat();
		a.sleep();
		System.out.println("--------");
		
		Dog d = new Dog("시바");
		
		d.eat();
		d.sleep();
		d.action();
		System.out.println("--------");
		
		Bird b = new Bird("앵무새");
		b.eat();
		b.sleep();
		b.flying();
		
		
		
		
		
	}
}
