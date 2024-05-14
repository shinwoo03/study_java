
public class ArrayEx05 {
	public static void main(String[] args) {
	//1. 정수 5개를 저장할 배열을 선언하고,
	//2. 각 배열요소에 10,20,30,40,50을 저장하기 - for문
	//3. 각 배열요소의 합을 구하여 출력하기 - for문
	
		int no[];
		no = new int[5];
		int sum = 0;
//각 데이터를 담는 초기화
//		no[0] = 10; idx 0 , no 10 
//		no[1] = 20; idx 1, no 20
//		no[2] = 30; idx 2, no 30
//		no[3] = 40; idx 3, no 40
//		no[4] = 50; idx 4, no 50
		
		for (int idx=0; idx<no.length; idx++) {
//		= for (int idx=0; idx<=no.length-1; idx++) {
			no[idx] = (idx+1) * 10 ;
			System.out.println(no[idx]);
			
			sum += no[idx]; //<==> sum = sum + no[idx];
			
		}
		System.out.printf("합 : %d \n", sum);
		
		
		
		
		
		
		
		
		
		
				
}
}
