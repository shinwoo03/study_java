
public class SwitchEx05 {
	public static void main(String[] args) {
		//성적에 따른 학점 출력하기.
		int score = 100;
//		if (score >=90 ) {
//			System.out.println("90점은 A학점");
//	}
		
		
		
		//90~99 : A학점
		//80~89 : B학점
		//70~79 : C학점
		switch ( score / 10 ) {
		case 10: case 9:
			System.out.println(score + "점은 A학점");
			break;
		case 8:
			System.out.println(score + "점은 B학점");
			break;
		case 7:
			System.out.println(score + "점은 C학점");
			break;
		case 6:
			System.out.println(score + "점은 D학점");
			break;
			default :
				System.out.println(score + "점은 F입니다.");
		}
}
}
	
	
