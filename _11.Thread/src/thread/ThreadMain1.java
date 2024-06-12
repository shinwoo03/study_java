package thread;

public class ThreadMain1 {
	public static void main(String[] args) {
		
		
		DigitThread thread = new DigitThread();
		thread.start(); //쓰레드 클래스의 run() 메소드가 실행됌.
		
		
		//알파벳 문자를 출력하기
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		
	
		
		
	}
}
