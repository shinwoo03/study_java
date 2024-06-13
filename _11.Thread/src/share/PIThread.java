package share;

public class PIThread extends Thread {
	ShareData share;
	
	PIThread(ShareData share){
		this.share = share;
	}
	
	@Override
	public void run() {
		double total = 0;
		for (int no=1; no<1000000000; no+=2) {
			if(no/2 % 2 == 0)	total +=1.0 / no;
			else				total -=1.0 / no;
		}
		total *= 4; //계산된 원주율 값
		share.pi = total;
		share.finished = true;
		
		//계산처리 다 했음을 알려주는 처리(공유역역을 다 처리 ) : notify
		synchronized(share) {
			share.notifyAll();
		}
		System.out.println("원주율 계산 완료");
		
		
		
	}

}
