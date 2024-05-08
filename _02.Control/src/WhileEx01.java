
public class WhileEx01 {
	public static void main(String[] args) {
		//Hello를 10번 출력
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		
		
		
		
		//1~10까지의 10회
		int no = 1;
		while ( no <= 10 ) { //1 <= 10 : T --> 11 <=10 :F
			System.out.println("Hello");
			no++;
		}
		//no의 1~10까지 출력하기
		no = 10;
		while (no <= 10) {//11<=10 : F 라서 실행을 하지 않는다.
			System.out.println(no);
			++no;
		}
		//10~1까지 출력하기
		no = 10;
		while ( no>=1 ) { //10 >=1 : T 계속 실행
			System.out.println( no );
			--no;
		}
		//*를 5개 출력하기 : *****
		no = 1;
		while (no <= 5) {
			System.out.print("*");
			++no;
		}
		
	
		
	}
}
