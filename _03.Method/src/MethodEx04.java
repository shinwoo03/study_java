
public class MethodEx04 {

	//어떤수가 3의 배수인지 아닌지 판단하여 출력할 메소드 선언하고 호출하기.
	static String multiple ( int no ) {
		String result;
		if (no % 3 == 0) {
			result = "3의 배수이다";
		}else {
			result = "3의 배수가 아니다";
		}
		
		
		/*switch ( no % 3 ) {
		case 0:
			result = "3의 배수이다.";
			break;
		default : 
			result = "3의 배수가 아니다.";
			break;
		}*/
		
		return result;
	}
		
	public static void main(String[] args) {
		int no = 44;
		String result = multiple(no);
		
		System.out.println(result);






}
}
