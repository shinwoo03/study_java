package share;

public class PrintThread extends Thread {
	ShareData share;
	
	PrintThread(ShareData share){
		this.share = share;
	}
	
	

	@Override
	public void run() {
		if( ! share.finished )
		try {
			//notify가 오기를 기다리자
			synchronized(share) {
				share.wait(); //공유영역의 wait();
			}
		}catch(InterruptedException e) {
			
		}
		
		//원주율 출력
		System.out.println("원주율 : " + share.pi);
	}

}
