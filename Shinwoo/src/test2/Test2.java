package test2;

public class Test2 {
	public static void main(String[] args) {
		int a=3, b=5;
		
		int result = 0;
		
		if (a > b) {
			result = a - b;
			
		}else if (a < b) {
			
			result = a + b;
			
		}else if ( a == b ) {
			result = a * b;
		}
		
		System.out.println( result );
		
		
	}

}
