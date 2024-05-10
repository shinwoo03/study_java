
public class SwitchEx01 {
	public static void main(String[] args) {
	//홀수/짝수인지 판단하기
		int no = 8;
		switch ( no % 2 ) {
		case 0: //if (no % 2 == 0) {}
			System.out.println( no + "짝수");
			break;
		case 1: //else if (no % 2 ==1) {}
			System.out.println( no + "홀수");
			break;
		}
	
		//if ( no % 2 == 0) {}
		// else if ( no % 2 == 0) {}
		// if (no % 2 == 0) {}
		// else {}
		
		
//		switch ( no % 2 ) {
//		case 1: //if (no % 2 == 1) {}
//			System.out.println( no + "홀수");
//			break;
//		default : //else if (no % 2 ==0) {}
//			System.out.println( no + "짝수");
//			break; //여기는 없어도 된다
		
		
		
		}
		
		
}

