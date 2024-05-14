
public class ArrayEx07 {
	public static void main(String[] args) {
		int no[] = {10, 20, 30, 40, 50, 60};
		for(int i=0; i<no.length; i++) {
			System.out.println( no[i] );
		}
		
		for ( int n : no) { //향상된 for 문의 형태
			System.out.println( n );
		}
		
		
		//no의 값을 합한 결과 출력하기.
//		int sum= 0;
//		for(int i=0; i<no.length; i++) {
//			sum += no[i];
//		}
//		System.out.println("합 : "+ sum);
	
		//향상된 for 문으로 변경하기.
		
		int sum = 0;
		for ( int i : no) { //no의 값이{10, 20, 30, 40, 50, 60} i에 담긴다.
			sum += i;
		System.out.println(sum);
		
			
		}
		
		
		
		
	}
}
