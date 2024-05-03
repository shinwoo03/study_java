import java.util.Scanner;

public class operateEx10 {
	public static void main(String[] args) {
	//나이를 입력받아 유아, 소아, 청소년, 성인으로 구분해 출력하기
	//유아 : 6세미만
	//소아 : 12세 미만
	//청소년 : 19세 미만
	//그외는 성인
		Scanner scan = new Scanner (System.in);
		System.out.println("나이를 구별하시오.");
		
		int no;
		no = scan.nextInt();
		String old = no < 6 ? "유아" 
				:(no < 12 ? "소아"
						:(no < 19 ? "청소년" : "성인"));
		System.out.printf("나이 : %d살 -> %s",no, old);
		
				
						

	
	
	
	}

}
