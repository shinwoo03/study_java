
public class ArrayEx01 {
	public static void main(String[] args) {
	//정수 데이터 5개를 담을 수 있는 배열변수 선언
		//int[] no = new int [5];
		//int no[] = new int [5];
		int[] no;//배열변수선언
		no = new int[5]; //배열생성
		
		
		no[0] = 1; //각 데이터를 담는 초기화
		no[1] = 2;
		no[2] = 3;
		no[3] = 4;
		no[4] = 5;
		System.out.println(no);
//		System.out.println(no[0]);
//		System.out.println(no[1]);
//		System.out.println(no[2]);
//		System.out.println(no[3]);
//		System.out.println(no[4]);
		for (int idx=0; idx<no.length; idx++) {	
			//System.out.println(idx + no[idx]);
			System.out.printf("인덱스 %d : %d\n",idx, no[idx]);
		
		}
		
		
		//초기화와 함께 배열선언
		//int no1 = 1;
		int num[] = {10, 20, 30, 40, 50, 60};
		System.out.println(num);
		System.out.println(num[4]);
		
		//배열크기 : length
		System.out.println("no의 길이 : " + no.length);
		System.out.println("num의 길이 : " + num.length);
		
		
		
		
		
		
		
		
		
}
}
