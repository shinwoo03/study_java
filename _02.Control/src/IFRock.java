import java.util.Random;

public class IFRock {
public static void main(String[] args) {
	Random r = new Random();
	//가위바위보
	//가위 : 0 바위 : 1 보 : 2
	int scissors = 0, rock = 1, paper = 2 ;
	System.out.println("가위 바위 보~!");
	//0~2의 세 수 중 하나 랜덤 추출
	//두 사람이 가위바위보를 해서 누가 이겼는지 출력하기
	
	int hong = r.nextInt(3);
	int sim = r.nextInt(3);
	
	System.out.printf("홍길동 : %s \n", hong==0 ? "가위": (hong ==1 ? "바위":"보"));
	
	System.out.printf("심청 : %s \n", sim==0 ? "가위": (sim ==1 ? "바위":"보"));
	
	//홍
	//가위0>보2, 바위1>가위0, 보2>바위1
	
	if (hong == sim) {
		System.out.println("무승부");
	}else if ( (hong ==0 && sim ==2) //a*b + a*b + a*b 
			|| hong ==1 && sim==0
			|| hong == 2 && sim ==1) {
		System.out.println("홍길동 승~!");
	}else {
		System.out.println("심청이 승~!");
	}
	
	
}
}
