package video;

public class SMIThread extends Thread {

	@Override
	public void run() {
		//자막 출력하기 : 비디오 쓰레드가 먼저 실행되도록 0.01초 대기하기
		try {
			Thread.sleep(10); //0.01초
		}catch(InterruptedException e) {
		}	
		String[] subtitle = {"하나", "둘", "셋", "넷", "다섯"};
		for ( String title : subtitle) {
			System.out.println("(자막)" + title);
			try {
			Thread.sleep(300);
			}catch(InterruptedException e) {
			}	
		}
		
	}

	
	
	
}
