
public class ForEx01 {
	public static void main(String[] args) {
		//1~10까지 출력
	for (int no = 1; no <= 10; no++) {
		System.out.println(no);
	}
	
	//*을 5개 출력 : *****
	for ( int no=10; no<=14; no++) {
		System.out.print("*");
		
	}
	//1~100까지의 합 출력
	int sum = 0;
	for (int no=1; no<=100; no++) {
		sum += no; //sum = sum + no;
		System.out.println("\n 합 : " + sum);
	}
	
	
	//1~10까지의 수 중 짝수만 출력
	for( int no=1; no<=10; no++) {
		if ( no % 2 ==0 ) {
			System.out.println(no);
		}
	}
	//1~10까지의 수 중 홀수만 출력
	for(int no=1; no<=10; no++) {
		if ( no % 2 == 1) {
			System.out.println(no);
		}
	}
	
	
	//반복 실행 중 반복문을 빠져나가려면 break;
	//반복 실행 중 다음 반복으로 넘어가려면 continue;
	
	
	//1~10까지의 수 중 짝수만 출력
	for( int no=1; no<=10; no++) {
		if ( no % 2 ==1 ) {//홀수이면 이후 처리를 하지않고 다음 반복문을 처리하자
		continue;
		}	System.out.println(no);
		
	}
	//1~10까지의 수 중 홀수만 출력
	for(int no=1; no<=10; no++) {
		//짝수이면 다음 반복문으로 넘어가자
		if (no%2==0) continue;
		System.out.println(no);
	}
	
	
	
	
	}
}
