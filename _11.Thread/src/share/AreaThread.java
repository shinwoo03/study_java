package share;

public class AreaThread extends Thread {
	//원넓이를 계산하는 처리
	ShareData share;
	int radius;

	public AreaThread(ShareData share, int radius) {
		this.share = share;
		this.radius = radius;
	}

	@Override
	public void run() {
		
		if(!share.finished) {
			synchronized(share) {
				try {
					share.wait();
				} catch (InterruptedException e) {
				}
			}
		}
		
		double area = share.pi * radius * radius;
		System.out.printf("반지름 %d인 원넓이 : %f \n", radius, area);
		
	}
	

}
