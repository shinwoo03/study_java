
public class ArrayEx02 {
	public static void main(String[] args) {
		//길이가 10인 배열변수를 선언하고, 거기에 3의 배수를 담기 : 3,6,9....
		int [] no = new int[10];
		//		  	   idx
//		no[0] = 3*1;	0
//		no[1] = 3*2;	1
//		no[2] = 3*3;	2
		for (int idx = 0; idx<no.length; idx++) {
			no[idx] = 3 * (idx+1);
		}
		
		//배열 데이터 출력하기
			for(int idx=0; idx<no.length; idx++) {
				System.out.printf("인덱스:[%d], %d \n", idx, no[idx]);
		}	
		
		
	}
}
