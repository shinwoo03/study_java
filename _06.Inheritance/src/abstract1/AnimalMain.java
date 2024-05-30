package abstract1;

public class AnimalMain {
	public static void main(String[] args) {
		
		Dog dog = new Dog("진돗개 ");
		sound(dog);
//		dog.sound();
		
		Cat cat = new Cat ("코숏 ");
		sound(cat);
//		cat.sound();
		
		Chicken chicken = new Chicken("금계 ");
		sound(chicken);
//		chicken.sound();
		
		Animal dog2 = new Dog("시츄 ");
		sound(dog2);
//		dog2.sound();
		
		Animal cat2 = new Cat("러시안블루");
		sound(cat2);
//		cat2.sound();
		
	}
	
	static void sound(Animal animal) {
		animal.sound();
	}
	
	
}
