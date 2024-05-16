
public class MethodEx01 {
	public static void main(String[] args) {
//		//String test[] = {"홍길동"};
//		System.out.println(args);
//		//배열에 담긴 데이터 출력하기
//		for ( String name : args) {
//			System.out.println(name);
//		}
//		
		//System.out.println("************");
		printsymbol();
		System.out.println("Hello, Java~");
		printsymbol("?",10);
		
		printsymbol(20, "&");
		System.out.println("Hello, View~");
		printsymbol("+");
		
	}
	
	//메소드 오버로딩 : 똑같은 이름의 메소드를 파라미터의 갯수를 다르게 하거나 
	//              파라미터의 갯수가 같더라도 데이터타입을 다르게 하여 선언하는 것
	//지정한 기호를 지정한 갯수만큼 출력하는 메소드
	static void printsymbol(String symbol, int no) { //(int no, String symbol)도 가능
		for(int i=1; i<=no; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	
	static void printsymbol(int no, String symbol ) { //(int no, String symbol)도 가능
		for(int i=1; i<=no; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	
	
	
	
	
		//지정한 기호를 고정되어 있는 13개 출력하는 메소드
		static void printsymbol(String symbol) {
		for (int i=1; i<=13; i++) {
			System.out.print( symbol );
		}
		System.out.println();
	}
	
	
	//지정한 갯수만큼 별을 출력하는 메소드
	static void printsymbol(int no) {
		for(int i=1; i<=no; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	//별을 13개 출력하는 메소드
		static void printsymbol() {
//		System.out.println("************"); //별 *3개 출력
		for (int i=1; i<14; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
