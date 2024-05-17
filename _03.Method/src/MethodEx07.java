
public class MethodEx07 {
	static void between2(int no1, int no2) {
		//no1:1, no2:5
		
		//no1:5, no2:1
		//두 데이터를 바꾼다
		
		if (no1 > no2) {
			int no3;
		no3 = no1;
		no1 = no2;
		no2 = no3;
		}
		for(int no = no1; no<=no2; no++ ) {
			System.out.print( no + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	//첫번째 수 부터 두번째 수까지의 정수를 출력하는 처리
	static void between(int no1, int no2) {
		if(no1 > no2) {
			for(int no=no1; no>=no2; no--) {
				System.out.print(no + " ");
			}
			
		}else {
		//no1:1, no2:5
		for(int no = no1; no<=no2; no++ ) {
			System.out.print( no + " ");
		}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		
		// 1~5까지의 수 출력하기
		between2(1,5);
		between2(5,1);
		System.out.println("--------");
		between(5,1);
		//잘못 입력 했을 때는 어떻게 해야할까
		between(1,5);
		
		// 10 ~ 25 까지의 수 출력하기
		between(10,25);
		
		// 5~9까지의 수 출력하기
		between(5,9);
		
		
		
		
		
		
		
	}

}
