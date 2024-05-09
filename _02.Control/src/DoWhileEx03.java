import java.util.Random;

public class DoWhileEx03 {
	public static void main(String[] args) {
		//주사위 던지기 게임 : 무승부 없음, 승자가 무조건 나와야함.
		//사용자와 컴퓨터가 주사위를 던져서 더 큰 수가 나오면 이기는 게임.
		//수가 랜덤하게 뽑혀지도록 할 기능을 가진 클래스 : Random
		
		Random r = new Random();
		int user = 0, pc = 1;
		
		do {
			System.out.println("주사위를 던지세요~!");
			user = r.nextInt(6)+1; //0~5+1 -> 1~6
			pc = r.nextInt(6)+1; //0~5+1 -> 1~6
			System.out.printf("사용자 : %d, 컴퓨터 : %d \n", user, pc);
		}while (user == pc);
		if (user > pc) {
			System.out.println( "사용자 승^^");
			
		}else {
			System.out.println( "컴퓨터 승~!" );
		}
		
		
		
	}
}
