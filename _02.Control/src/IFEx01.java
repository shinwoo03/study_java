
public class IFEx01 {
public static void main(String[] args) {
	//두 수 중 어떤 수가 더 큰 수인지 판단하기
	//조건문 - if문
	//조건식의 결과(true/false)에 따라 처리를 하도록 할 명령문
	//if문 = if (조건식 { 조건식의 결과가 true인 경우에 처리}
	
	//두 수를 담을 변수 선언
	int no1, no2;
	no1 = 10;
	no2 = 20;
	
	if ( no1 > no2 ) {//10>20 : F
		System.out.printf("%d이 %d보다 더 큰 수 \n", no1, no2);
		System.out.println("여기가 실행됨");
	}
	if (no1 < no2) {//10<20 : T
		System.out.printf("%d이 %d보다 더 작은 수 \n", no1, no2);
		System.out.println("여기가 실행됨");
	}
	

	
	
	
	
}
	
	
	
}
