import java.util.Scanner;

public class operatorEx08 {
	public static void main(String[] args) {
		//키보드로 입력받은 수로 처리 
		//import사용할수 있도록 허용을 한다, 자바파일로 가지고 온다.
		//import 단축키 : ctrl + shift + o
		//대문자로 시작하는건 class
		Scanner scan = new Scanner( System.in ); 
		//scan에는 생성한 것이 존재하는 위치(주소)가 담겨있다.
		//그 주소를 찾아가면 기능들을 사용할 수 있다.
		System.out.println("홀수/짝수 판단할 수를 입력하세요.");
		 
		
		//메소드명( 파라미터 )
		//생성자명( 파라미터 ) 데이터가 있을수도 있고 없을수도 있다.
		
		//수가 홀수/짝수 판단
		int no;
		no = scan.nextInt( ); //초기화
		String odd = no % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("%d : %s", no, odd);
		
		
		
		
	}
}
