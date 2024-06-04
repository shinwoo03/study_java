package string;

public class StringMain {
	public static void main(String[] args) {
		
		//같은 문자열은 중복 생성되지 않는다.
		String text1 = "안녕";
		String text2 = "안녕";
		if( text1 == text2 ) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		String text3 = new String("안녕");
		String text4 = new String("안녕");
		if( text3 == text4 ) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		if(text3.equals(text4)) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
		}
		
		
		String data = "같은";
		data += " ";
		data += "인스턴스";
		System.out.println(data);
		
		
	}
}
