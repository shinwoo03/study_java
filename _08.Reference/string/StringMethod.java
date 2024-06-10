package string;

public class StringMethod {
	public static void main(String[] args) {
		String text = "혼자 공부하는 자바";
		System.out.println("문자열의 길이: " + text.length() );
		//문자열의 일부: substring
		System.out.println( text.substring(3, 5) );
		System.out.println( text.substring(3) );
		
		//특정문자열이 있는 시작위치: indexOf
		System.out.println( text.indexOf("공부") );
		
//		String email = "hong@naver.com";     // hong  -> naver.com
//			   email = "admin@hrd.go.kr";    // admin -> hrd.go.kr
//			   email = "240604yo@gmail.com"; // 240604yo -> gmail.com
			   
		String emails[] = {   "hong@naver.com"
							, "admin@hrd.go.kr"
							, "240604yo@gmail.com" 	};
		
		for(String email  : emails ) {
			//이메일 아이디만 출력하기: 처음부터 @앞에까지
			System.out.println( email.substring(0, email.indexOf("@")) );
			//이메일 서비스만 출력하기: @다음부터 문자열 끝까지
			System.out.println( email.substring(email.indexOf("@")+1 ) );
			System.out.println( email.substring(email.indexOf("@")+1, email.length() ) );
		}
		
		String lastName = "홍", firstName = "길동";
		System.out.println(  lastName.concat( firstName ) ); //문자열결합 
		
		String name = " 홍길동  ";
		System.out.println( name.trim() ); //공백제거
		
		//특정 문자열을 바꿔서 반환
		System.out.println( text.replace("자", "ja") );
		
		String phone = "010-1234-5678-12345";
		phone = "02-1234-5678-12345";
		phone = "062-1234-5678-12345";
		// lastIndexOf : 시작위치를 오른쪽에서부터 찾아 그 위치를 반환 
		System.out.println( phone.substring(phone.lastIndexOf("-")+1) ); //개인번호
		System.out.println( phone.substring( 0, phone.indexOf("-") ) );  //지역번호
		
		phone = "062-1234.5678";
		String phones[] = phone.split("-"); //특정 구분자를 기준으로 문자열을 분리하기
		for(String p : phones ) {
			System.out.println(p);
		}
		
		//배열로 된 문자열을 특정 구분자를 넣어 하나의 문자열로 만들기
		System.out.println( String.join(".", phones) ); 
	}
}