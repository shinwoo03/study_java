
public class ArrayEx11 {
	public static void main(String[] args) {
	
//		3행 4열		
//		0	1	2	3
		
//	0	1	2	3	4
//	1	2	4	6	8
//	2	3	6	9	12

	      int[][] no = new int[3][4];
	      
	      //1행(0) 1 2 3 4
//	      for(int col=0; col<no[0].length; col++) {
//	         no[0][col] = 1*(col+1); //col + 1;
//	         System.out.printf( "(%d,%d) : %d \n", 0, col,no[0][col] );
//	      }
//		//2행(1) | 2	  4   6   8
//		 for (int col=0; col<no[1].length; col++) {
//			 no[1][col] = 2*(col+1); // 2 * col + 2; 
//			 System.out.printf( "(%d,%d) : %d \n", 1, col,no[1][col] );
//		 }
//		
//		//3행(2) | 3  6  9  12
//		 for (int col=0; col<no[2].length; col++) {
//			 no[2][col] = 3*(col+1); //3* col+3
//			 System.out.printf( "(%d,%d) : %d \n", 2, col,no[2][col] );
//		 }
//		
		for (int row=0; row<no.length; row++) { //length는 no의배열변수의 길이
			//각 행 출력
			for (int col=0; col<no[row].length; col++) {
				no[row][col] = (row+1)*(col+1); //3* col+3
//				System.out.printf( "(%d,%d) : %d \n", row, col,no[row][col] );
			}
		
		}
		
		//2차원 배열의 데이터 출력하기
		for (int i=0; i<no.length; i++) {
//			System.out.println( no[i] );
			for(int j=0; j<no[i].length; j++) {
				System.out.print( no[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
