
public class OperatorEx02 {
	public static void main(String[] args) {
//		System.out.println("가나가"); // ln: line next
//		System.out.print( "가나가");
//		System.out.print( "가" + "나" + "=" + "다 " );
//		System.out.printf( "%s %c %s = %s", "가", '+', "나", "다" );
		
		//의도: 업무프로세스
//		//산술연산자: +, -, *, /, %
		int no1 = 10, no2 = 5, result;
		result = no1 + no2;
		String operator = "+";
		System.out.printf( "%d %s %d = %d \n", no1, operator, no2, result );
		
		result = no1 - no2;
		operator = "-";
		System.out.printf( "%d %s %d = %d \n", no1, operator, no2, result );
		
		result = no1 * no2;
		operator = "*";
		System.out.printf( "%d %s %d = %d \n", no1, operator, no2, result );
		
		result = no1 / no2;
		operator = "/";
		System.out.printf( "%d %s %d = %d \n", no1, operator, no2, result );
		
		result = no1 % no2;
		operator = "%";
		System.out.printf( "%d %s %d = %d \n", no1, operator, no2, result );
	}
}
