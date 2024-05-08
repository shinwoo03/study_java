
public class SwitchEx02 {
	public static void main(String[] args) {
		//순위별 메달 출력하기
		
		int rank = 3;
		
		switch ( rank ) {
		case 1:
			System.out.println("1위는 금메달");
			break;
		case 2:
			System.out.println("2위는 은메달");
			break;
		case 3:
			System.out.println("3위는 동메달");
			break;
		}
	}
}
