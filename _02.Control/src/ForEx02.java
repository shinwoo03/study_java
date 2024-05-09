import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		//1부터 입력한 수까지 출력하기
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int no = s.nextInt();
		for(int i=1; i<=no; i++) {
			System.out.println(i);
		}
		
	}
}
