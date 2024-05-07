import java.util.Scanner;

public class Homewokr {
public static void main(String[] args) {
//	키보드로 나이를 입력하자.
//	제시문 : 당신의 나이는?
//	입력한 나이에 따라서 연령대 출력하기
//	유아, 소아,청소년, 성
	// 유아 6세미만, 소아 : 12세 미만, 청소년 : 19세 미만, 그외는 성인
	
	
	//데이터타입 변수명 = 데이터    
	Scanner scan = new Scanner( System.in );
	System.out.println("당신의 나이는?");
	
	int age = scan.nextInt();
	/*
	if (age < 6 ) {
		System.out.printf("%d는 유아 입니다. \n", age);
		
	}else if (age < 12){
		System.out.printf("%d는 소아 입니다. \n", age );
	}else if (age <19){
			System.out.printf("%d는 청소년 입니다. \n" , age);
	} else { 
		System.out.printf("%d는 성인입니다. \n", age);
	}
	*/
	String range ;
	if (age < 6) {
		range = "유아" ;
	}else if (age < 12) {
		range = "소아";
	} else if (age < 19) {
	range = "청소년";
	//}else if (age >= 19) { -->이건 문법상 틀림.
	
	}else {
		range = "성인";
	}
	System.out.printf("%d세는 %s", age, range);
	
	
	
}

}

