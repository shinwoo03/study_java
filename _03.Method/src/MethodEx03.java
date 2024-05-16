
public class MethodEx03 {
	//어떤 수가 짝수인지 홀수인지 판단하여 그 결과를 리턴하는 메소드 선언하기.
	static String oddEven(int no) {
		String result = ""; // = "";초기화를 하던가
		switch ( no % 2 ) {
		case 0: 
			result = "짝수";
			break;
		default : //case 1:
			result = "홀수";
			break;
		}
	

	
		/*		if (no % 2 == 0) {
//			System.out.println("짝수");
			result = "짝수";
		}else {//if (no % 2 == 1) else로 처리를 하던가
//			System.out.println("홀수");
			result = "홀수";
		}*/
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		//화면이라고 생각하자
		int no = 5;
		String result = oddEven (no);
		System.out.println( no + " : " + result );
//		if (no % 2 == 0) {
//			System.out.println("짝수");
//		}else if (no % 2 ==1) {
//			System.out.println("홀수");
//		}
//		
//		no = 10;
//		if (no % 2 == 0) {
//			System.out.println("짝수");
//		}else if (no % 2 ==1) {
//			System.out.println("홀수");
//		}

		no=10;
		result = oddEven(no);
		System.out.println( no + " : " + result );
	
	
	}
	
	
}
