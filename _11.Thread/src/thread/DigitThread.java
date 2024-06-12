package thread;

public class DigitThread extends Thread{

	@Override
	public void run() {
		//1~10의 숫자를 출력하기
		for(int no=1; no<=10; no++) {
		System.out.print(no);
				}
	}

}
