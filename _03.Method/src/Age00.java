import java.util.Scanner;

public class Age00 {
	public static void main(String[] args) {
//		실습
//		학생명과 나이를 각각 배열로 담자.
		String names[] = { "홍길동", "박문수", "심청", "장화", "홍련" }; 
		int[] ages = { 20, 50, 18, 22, 25 };
		
//		키보드로 이름 입력시 해당 나이를 출력하기
		Scanner scan = new Scanner(System.in);
//		제시문: 누구 나이를 알고 싶나요?
		System.out.print("누구 나이를 알고 싶나요?");
		String name = scan.next();
		
//		결과: 홍길동의 나이: 28세
		int age = howOldAreYou(names, name, ages);
		if( age > 0)
			System.out.printf("%s의 나이: %d세 \n", name, age );
		else
			System.out.println( name + "씨는 정보가 없습니다");
		
		int idx = howOldAreYou(names, name);
		if( idx >=0 )
			System.out.printf("%s의 나이: %d세 \n", name, 
								idx==-1 ? 0 : ages[idx] );
		else
			System.out.println( name + "씨는 정보가 없습니다");
			
	}
	
	
	static int howOldAreYou(String names[], String name) {
		int index = -1;
		for(int idx=0; idx<names.length; idx++) {
			if( names[idx].equals( name ) ) {
				index = idx;
				break;
			}
		}
		return index;
	}
	
	//선언할 메소드: 나이를 반환하는 메소드
	static int howOldAreYou(String[] n, String name, int[] ages) {
		int age = 0;
		for(int idx=0; idx<n.length; idx++) {
			if( n[idx].equals( name ) ) {
				//System.out.println( ages[idx] );
				age = ages[idx];
				break;
			}
		}		
		return age;
	}
	
	
}