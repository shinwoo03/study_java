package abstract1;

public class PeopleMain {
	public static void main(String[] args) {

		
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.age = 15;
		hong.studentNo = "240501";
		hong.eat();
		hong.go();
		hong.sleep();
		System.out.println("----------");
		
		Worker sim = new Worker();
		sim.name = "심청";
		sim.age = 30;
		sim.workerNo = "201002";
		sim.eat();
		sim.go();
		sim.sleep();
		
		
	}
}
