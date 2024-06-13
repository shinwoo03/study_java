package account;

public class TransferAccount extends Thread {
	ShareAccount share;
	
	

	public TransferAccount(ShareAccount share) {
		this.share = share;
	}

	@Override
	public void run() {
		//계좌간 이체처리
		//홍 -> 박 : 10만원씩 이체 --> 두 통장의 잔고의 합계는 늘 같다.
		for (int no=1; no<=5; no++) {
			//임계영역(critical section)
			//문제가 발생하지 않도록 임계영역동기화(critical section synchronization) 하는 처리
			share.transfer( 100000 - 10000*(no-1) );
		}
		
	}
	
	
	
	
}
