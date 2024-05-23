
public class Car {
	//필드 : 소유주, 차종, 속도
	String owner, model;
	int speed;
	
	
	//메소드 : 출발한다, 멈춘다, 가속한다, 감속한다
	//출발한다
	void start() {
		System.out.println("시동걸기");
	}
	//멈춘다
	void stop() {
		System.out.println("정지상태");
	}
	//가속한다 : 가속이 40씩 증가
//	void stepAccel () {
//		speed += 50;
//		if ( speed >= 250) {
//			speed = 250;
//			System.out.println("일정 속도 유지");
//		}
//	}
	void stepAccel (int num) {
		speed += num;
		if ( speed >= 200) {
			speed = 200;
			System.out.println("일정 속도 유지");
		}
	}
	//감속한다. : 30씩 감속
	void stepBreak (int num) {
		speed -= num;
		if ( speed < 0 ) speed = 0;
	
	}
}
