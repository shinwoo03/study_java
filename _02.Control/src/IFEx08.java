
public class IFEx08 {
public static void main(String[] args) {
	//				일반인	청소년	어린이
	//	  일반버스    1,250원	1000원	500원
	// 어린이(만6세~만12세), 청소년(만13세~만18세), 일반(만19세이상)
	// 나이에 따른 요금 출력하기
	int age = 5; // 나이변수
	int charge = 0 ; // 요금변수
	String ageGroup;
	if ( age >= 19 ) {
		charge = 1250;
		ageGroup = "일반인";
	} else if (age >=13) {
		charge = 1000;
		ageGroup = "청소년";
	} else if (age >=6 ) {
		charge = 500;
		ageGroup = "어린이";
	}else {
		//charge = 0; -->여기서 초기화를 시켜도 된다.
		ageGroup = "유아";
	}
	
	
	System.out.printf("나이 %d세인 고객님의 버스요금(%s)은 %d원 입니다. \n", age,ageGroup, charge);
}
}
