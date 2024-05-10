
public class LoopEx06 {
public static void main(String[] args) {
	//역직각삼각형 (기준에 따라 식이 달라짐)
//	*****		1행 - 5열
//	****		2행 - 4열
//	***			3행 - 3열
//	**			4행 - 2열
//	*			5행 - 1열
	//행과 열 사이에 데이터를 보면 행과 열을 더하면 6
	//열=6-행
	
	//다섯번 행이 진행된다.
	for(int row=1; row<=5; row++) {
		for (int col=1; col<=6-row;col++) {
			
		
		System.out.print("*");}
		
		System.out.println();
		 //옆으로 붙이자
	//1행일때는 5번 반복해야 하니까
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		//이렇게 된다.
		//System.out.println(); //계산이 끝나면 한줄 내리자
	}
	
	//한개씩 줄어든다는 가정
	
	for(int row=1; row<=5; row++) {
		for (int col=5; col>=row; col--) {
			
		
		System.out.print("*");
		}
		System.out.println();
	
	
	
}
}
}