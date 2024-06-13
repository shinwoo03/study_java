package share;

public class AroundThread extends Thread {
	ShareData share;
	int radius;
	
	public AroundThread(ShareData share, int radius) {
		this.share = share;
		this.radius = radius;
	}

	@Override
	public void run() {
		//원둘레를 계산하는 처리
		if(! share.finished) {
			try {
				synchronized(share) {
					share.wait();
			}
			}catch(InterruptedException e) {
			}
		}
		double around= 2 * share.pi * radius;
		System.out.printf("반지름 %d인 원둘레 : %f \n", radius, around);
		
	}
	
	
}
