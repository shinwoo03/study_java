
public class CarMain {
	public static void main(String[] args) {
		Car han = new Car ();
		han.owner= "한신우";
		han.model = "C-Class Sedan";
		System.out.printf("차주 : %s 차종 : %s \n", han.owner, han.model);
		
//		han.start();
//		stepAccel(40, han);
//		stepAccel(40, han);
//		stepAccel(40, han);
//		stepAccel(40, han);
//		stepAccel(40, han);
//		stepAccel(40, han);
//		stepAccel(40, han);
//		
//		stepBreak(40, han);
//		stepBreak(40, han);
//		stepBreak(40, han);
//		stepBreak(40, han);
//		stepBreak(40, han);
//		stepBreak(40, han);
//		stepBreak(40, han);
//		han.stepAccel();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepAccel();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepAccel();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepAccel();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepBreak();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepBreak();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepBreak();
//		System.out.println( "현재 속도 : " + han.speed );
//		
//		han.stepBreak();
//		System.out.println( "현재 속도 : " + han.speed );
//		
	
		
		stepDo(40, han, true);
		stepDo(50, han, true);
		stepDo(30, han, false);
		stepDo(50, han, true);
		stepDo(30, han, false);
		stepDo(30, han, false);
		stepDo(50, han, true);
		stepDo(50, han, true);
		stepDo(50, han, true);
		stepDo(30, han, false);
		stepDo(30, han, false);
		stepDo(30, han, false);
		stepDo(30, han, false);
		stepDo(30, han, false);
		stepDo(30, han, false);
			han.stop();
		
		
	}
	//가속하는거, 감속하는거, 둘다 같이하는 메소드 만들기
	
	
	static void stepDo(int speed, Car han, boolean accel) {
		if (accel) {
			han.stepAccel(speed);
		}else {
			han.stepBreak(speed);
		}
		System.out.printf(" %s (%d) : %d \n", accel? "가속" : "감속", speed, han.speed );
	}
	
	
	static void stepAccel (int speed, Car han) {
		han.stepAccel(speed);
		System.out.println("현재 속도 : " + han.speed);
	}
	
	static void stepBreak (int speed, Car han) {
		han.stepBreak(speed);
		System.out.println("현재 속도 : " + han.speed);
	}
	
	
	
	
}
