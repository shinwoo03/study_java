
public class ArrayEx09 {
	public static void main(String[] args) {
		String subjects[]
				= {"자바", "HTML","CSS","자바스크립트"};
		//각 과목명 출력하기
		for ( String subject : subjects ) {
			System.out.println(subject);
		}
		
		char alphabet [] = {'A', 'B', 'C', 'D','E'};
		//각 알파벳 출력하기
		for (char a : alphabet) {
			System.out.println( a );
		}
		
		double[] values = { 1.14, 3.14, 85.5 };
		for (double v : values) {
			System.out.println( v );
		}
		
		
}
}
