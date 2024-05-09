import java.util.Random;

public class DoWhileEx04 {
	public static void main(String[] args) {
		//가위바위보 : 무승부 없음, 승자가 결정될때까지 가위바위보를 계속한다.
		//가위0>보2		바위1>가위0		보2>바위1
		
		Random r =new Random();
		int scissors = 0, rock = 1, paper = 2;
		int hong, park;
		
		do {
			System.out.println("rock scissors paper~!");
			hong = r.nextInt(3);
			park = r.nextInt(3);
			System.out.printf("홍길동 : %s, 박명수 : %s \n"
					,hong==0?"가위" : (hong==1? "바위" : "보")
					
					, park==0?"가위" : (park==1? "바위" : "보" ));
			
		}while (hong == park);
		
		if (hong == 0 && park==2 || hong == 1 && park==0 ||hong == 2 && park==1) {
			System.out.println("홍길동 승");
		}else  {
			System.out.println("박명수 승");
		}
		
		//기준은 누군가 한명이 이겨야함. 박명수가 이기던가 홍길동이 이기던가 기준을 어떻게 두느냐에 따라서 같음.
		System.out.println();
		
	}
}
