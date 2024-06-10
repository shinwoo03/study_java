package Wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		//기본데이터타입: 프리미티브타입 
		//레퍼런스(참조)타입 : Wrapper클래스
		//byte  short   int      long  float  double  char       boolean
		//Byte  Short   Integer  Long  Float  Double  Character  Boolean
		
		int sum = 0;
		for(String data : args ) {
			System.out.println( data );
			//문자열 10 -> 숫자 10
			sum += Integer.parseInt(data);  // 리턴타입 int  
			sum += Integer.valueOf(data);   // 리턴타입 Integer -> int : UnBoxing
		}
		System.out.println("sum> "+ sum);
		
		
		Byte b = new Byte( (byte)10 );
		System.out.println( b );
		
		Integer no = new Integer( 10 );
		System.out.println( no );
		int no1 = no; // Integer -> int : UnBoxing
		int no2 = no.intValue();
		
		Integer no3 = no2; // int --> Integer: Auto Boxing
		
		
		
		
	}
}
