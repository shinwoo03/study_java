
public class operatoEx04 {

	public static void main(String[] args) {
		//복합대입연산자 : +=, -=, *=, /=, %= (적기 귀찮으니까 간략하게 하기 위함!)
		//대입연산자 : =
		int no;
		no = 10;
		
		no = no + 5; //기본연산 + 대입연산
		System.out.println( no );
		
		no += 5; //no = no + 5
		System.out.println(no);
		
		no -= 20;
		System.out.println(no);
		
		
		no = 5;
		no *= 3;
		System.out.println(no);
		
		no /= 3;
		System.out.println(no);
		
		no %= 5;
		System.out.println(no);
		
		no = 1;
		//누적데이터를 담을 변수 선언
		int sum = 0;
		//1+1+1+1+1
//		sum = sum + no; //1
//		sum = sum + no; //2
//		sum = sum + no; //3
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		
		
		System.out.println("합 : " + sum);
		//프로그램 실행 : ctrl +f11 또는 f11
	
	}
}
