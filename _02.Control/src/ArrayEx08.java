import java.util.Scanner;

public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1부터 키보드 입력받은 수까지의 값을 배열에 담기
		System.out.println("1부터 어떤 수까지 데이터를 담겠습니까?");
		int no = scan.nextInt();
		int [] values= new int[no];
		for (int idx=0; idx<values.length; idx++ ) {
//		= for (int idx=0; idx<no; idx++ ) 
			values[idx] = idx + 1;
		}
		//배열값 중 짝수만 출력하기
		for ( int v : values ) {
			if (v % 2 == 0) {
				System.out.println(v);
			}
		}
		
		
	}
}
