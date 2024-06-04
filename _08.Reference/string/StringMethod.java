package string;

public class StringMethod {
	public static void main(String[] args) {
		String text = "혼자 공부하는 자바";
		System.out.println("문자열의 길이 : " + text.length());
		//문자열의 일부 : substring
		System.out.println(text.substring(3, 5));
		System.out.println(text.substring(3));
		
		//특정문자열이 있는 시작위치 : indexOf
		System.out.println(text.indexOf("공부")); //숫자
		
//		String email = "hong@naver.com"; hong - naver.com 
//				email = "admin@hrd.go.kr"; admin - hrd.go.kr
//				email = "240604yo@gmail.com"; 240604yo - gmail.com
		
		String emails[] = { "hong@naver.com", "admin@hrd.go.kr", "240604yo@gmail.com" };
		
		
		
		for(String email : emails) {
			//이메일 아이디만 출력하기
			System.out.println(email.substring(0, email.indexOf("@")));
			
		}
		
		for(String email : emails) {
		//이메일 서비스만 출력하기 : @다음부터 문자열 끝까지 출력하기
		System.out.println(email.substring( email.indexOf("@")+1 ));
		System.out.println(email.substring( email.indexOf("@")+1, email.length() ));
		}
		
		String lastName = "홍", firstName = "길동" ;
		System.out.println( lastName.concat(firstName) );
		
		
		String name = " 홍길동";
		System.out.println( name.trim() ); //.trim() 공백제거
		
		//특정 문자열을 바꿔서 반환하는 메소드
		System.out.println(text.replace("자", "ja"));
		
		String phone = "010-1345-9999-12345";
		phone = "02-1345-9999-12345";
		phone = "062-1345-9999-12345";
		System.out.println( phone.substring( phone.lastIndexOf("-")+1 ) ); //개인번호
		System.out.println(phone.substring(0, phone.indexOf("-"))); //지역번호
		
		phone = "062-1234-5678";
		String phones[] = phone.split("-");
		for(String p : phones) {
			System.out.println(p);
		}
		System.out.println(String.join(".", phones));
		
		
		
		
	}
}
