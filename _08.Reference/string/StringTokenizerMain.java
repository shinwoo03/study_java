package string;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		//문자열을 구성하는 단위를 token 이라고 한다.
		StringTokenizer token = new StringTokenizer("자바 CSS HTML SCRIPT");
		//토큰분리 기준 : default 공백문자
		//문자열을 불리하는데 사용하는 클래스
		//토큰분리 기능 : nextToken()
		
		while( token.hasMoreTokens() ) { //다음 토큰이 있다면
			String subject = token.nextToken();
			System.out.println( subject );
		}
		
		
		
		
//		String subject = token.nextToken();
//		System.out.println(subject);
//		subject = token.nextToken();
//		System.out.println(subject);
//		subject = token.nextToken();
//		System.out.println(subject);
//		subject = token.nextToken();
//		System.out.println(subject);
		
		
		
		
		
		
	}

}
