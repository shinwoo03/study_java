import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		//1부터 키보드로 입력받은 수까지의 합 출력하기.
		//1부터 키보드로 입력받은 수까지의 데이터를 담을 배열변수 사용하기.
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 어떤 수까지의 합을 구할건가요?");
		int end = scan.nextInt();
		int  no []= new int [end];
		for (int idx=0; idx<no.length; idx++) {
			no[idx] = idx + 1;
			
		}
		//ex) 10 입력시
		//idx 0	  1  2  ....  9	
		//no  1	  2  3  ....  10
		int sum = 0;
		for(int idx=0; idx<no.length; idx++) {
			sum+= no[idx];
		}
		System.out.printf("1부터 %d까지의 합은 %d \n", end, sum);
		
		//위 배열변수에 담긴 데이터 중에서 짝수만 출력하기
		System.out.println("-----짝수만 출력-----");
		for (int idx=0; idx<no.length; idx++) {
			//홀수이면 이후 처리하지 않기 -> 짝수나오는거임.
			if ( no[idx]%2==1) continue;
				System.out.println(no[idx]);
				
//			짝수일때만 출력if ( no[idx]%2==0) {
//				System.out.println(no[idx]);
				
			}
			System.out.println("----------------");
			System.out.println("짝수 index 의 값만 출력하기");
			for (int idx=0; idx<no.length; idx++) {
				if( idx % 2 == 0) {
					System.out.println(no[idx]);
				}
			}
		
			System.out.println("----------------");
			for(int idx=0; idx<no.length; idx+=2) { //2씩 증가시키는 것.
				System.out.println(no[idx]);
				
			}
		
		
	}	
	}

