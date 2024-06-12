package share;

public class PrintThread extends Thread {
	ShareData share;
	
	PrintThread(ShareData share){
		this.share = share;
	}
	
	

	@Override
	public void run() {
		//원주율 출력
		System.out.println("원주율 : " + share.pi);
	}

}
