import java.util.Scanner;

public class MethodEx05 {

	//1부터 키보드로 입력한 수까지의 합을 반환하는 메소드를 선언후
	static int sum (int no) {
		int sum = 0 ;
		for(int i=1; i<=no; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	

	
	
	
	public static void main(String[] args) { //화면이라고 생각하기
	
		System.out.println("몇까지의 합을 계산할 건가요???");
		Scanner scan = new Scanner(System.in);
	
		//1. 선언한 메소드를 호출하고
		int end = scan.nextInt();
		
		int result = sum ( end );
		
		//2. 합의 결과를 출력하기
		System.out.printf("1~%d 까지의 합 : %d \n", end, result);
		System.out.printf("1~%d 까지의 합 : %d \n", end, sum ( end ));
	//main 메소드에서
	//제시문 = 몇까지의 합을 계산할 건가요?
	
	
}
}
