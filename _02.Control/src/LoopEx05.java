
public class LoopEx05 {
	public static void main(String[] args) {
		//직각삼각형
		//		*					1회 - 1회 (반복) 출력
		//		**					2회 - 2회 (반복) 출력
		//		***					3회 - 3회 (반복) 출력
		//		****				4회 - 4회 (반복) 출력
		//		*****				5회 - 5회 (반복) 출력
		for (int row=1; row<=5; row++) {
			System.out.print("*");
//			System.out.println();
			for (int col=1; col<=row; col++) {
				System.out.print("*");				
			}
			System.out.println();
		}

	
	
	
	
	
	
	
	
	
	}
}
