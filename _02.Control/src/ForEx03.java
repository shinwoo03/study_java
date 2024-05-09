import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		//1부터 입력한 수까지 중 3의배수만 출력하기 - for문
		System.out.println("3의 배수는?");
		int no = s.nextInt();
		
		for (int i=1; i<=no; i++ ) {
			if ( i % 3 == 0) {
			System.out.print( i + " " );
			}
		}
		
		
}
}
