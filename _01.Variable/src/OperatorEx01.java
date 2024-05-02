
public class OperatorEx01 {
	public static void main(String[] args) {
		//산술연산자: +, -, *, /, %
		int no1 = 10, no2 = 5;
		//로컬변수는 사용하려면 반드시 초기화해야만 한다
		int plus = no1 + no2;
		System.out.printf( "%d + %d = %d \n", no1, no2, plus );
		//라인복사붙여넣기: ctrl+alt+방향키(위/아래)
		//라인이동: alt+방향키(위/아래)
		int minus = no1 - no2;
		System.out.printf( "%d - %d = %d \n", no1, no2, minus );
		
		int multiply = no1 * no2;
		System.out.printf( "%d * %d = %d \n", no1, no2, multiply );
		
		int divide = no1 / no2;  //몫
		System.out.printf( "%d / %d = %d \n", no1, no2, divide );
		
		divide = no1 % no2;  //나머지
		System.out.printf( "%d %% %d = %d \n", no1, no2, divide );
		
		
	}
}
