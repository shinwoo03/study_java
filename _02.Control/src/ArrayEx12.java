
public class ArrayEx12 {
	public static void main(String[] args) {
//		int no[] = {10, 20, 30, 40};
//		System.out.println(no.length);
//		System.out.println(no[0]);
//		System.out.println(no[1]);
//		System.out.println(no[2]);
//		for(int i=0; i<no.length; i++) { //숫자에 픽스 시키면 갯수가 줄어들때 오류가 나기 때문에 no의 길이 즉, no.length가 들어가면 오류x
//			System.out.println( no[i] ); //[]안의 변수가 들어가야 한다.
//		}
		
		int no [] [] = { {10, 20, 30, 40}, {1, 2, 3, 4} , {1, 2, 3, 4} };
//		System.out.println(no.length); //no의 요소가 2개 이므로 2개가 출력된다.
//		System.out.println(no[0].length); //0의 갯수 4개 -> 4개 출력
//		System.out.println(no[1].length); //1의 갯수 4개 -> 4개 출력
		
		
		for(int i=0; i<no.length; i++) {
			// System.out.println(i);
		//	System.out.println(no[i]); //{10, 20, 30, 40} 배열이라 주소가 출력됨
			System.out.print((i+1)+"행 : ");
			for(int j=0; j<no[i].length; j++) {
				System.out.print(no[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
