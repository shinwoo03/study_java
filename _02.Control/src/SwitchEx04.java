import java.util.Scanner;

public class SwitchEx04 {
	public static void main(String[] args) {
	//각 월별 분기(6월 - 2분기) 출력하기
	//제시문 : 지금 몇 월 인가요?
	//출력 : 6월은 2분기 입니다.
		

	System.out.println("지금은 몇 월 인가요?");

	Scanner s = new Scanner (System.in);
			int month = s.nextInt();
	
	
	
//		if (month == 1 || month == 2 || month ==3) {
//			System.out.printf("%d는 %d분기 \n", month);
//		}
		
		
		
	switch ( month ) {
	case 1: case 2: case 3:
		System.out.printf("%d월은 1분기 \n", month);
	break;
	
	case 4: case 5: case 6:
		System.out.printf("%d월은 2분기 \n", month);
	break;
	
	case 7: case 8: case 9:
		System.out.printf("%d월은 3분기 \n", month);
	break;
	
	case 10: case 11: case 12:
		System.out.printf("%d월은 4분기 \n", month);
	break;
	default :
		System.out.printf("%d월은 없어유~!", month);
	}
	
		
		
		
}
}
