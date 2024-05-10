
public class LoopEx08 {
public static void main(String[] args) {
	//2단~9단 출력하기
	//조건 다음과 같이 각 단에서 X3, X6, X9는 출력하지 않기
	
	for (int no=2; no<=9; no++) {
	// 	System.out.printf("2 X %d = %d \n", no, 2*no);    2단 출력하기.
		System.out.printf("%d단 출력하기 \n", no);
		
		for (int dan=1; dan<=9; dan++) {
			if (dan % 3 == 0) continue; 
			System.out.printf("%d X %d = %d \n", no , dan, dan*no);
		
	}
	}
	
	
}
}
