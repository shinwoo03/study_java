
public class DoWhileEx01 {
	public static void main(String[] args) {
		
//		1~10까지 출력
		int no = 1;
		do {
			System.out.println(no); //no는 10
			++no; //여기서 no는 11
		}while (no<=10);
		System.out.println("-------");
		
		
		//10~1까지 출력
		//no = 11
		do {
			--no;
			if (no == 0) break;
			System.out.println(no);
			
		}while(no >= 1);
		
		//반복문을 빠져나가기 위한 명령문 : break;
		
		
	}
}
