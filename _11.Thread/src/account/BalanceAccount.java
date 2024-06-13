package account;

public class BalanceAccount extends Thread {
	ShareAccount share;
	
	public BalanceAccount(ShareAccount share) {
		this.share = share;
	}
	@Override
	public void run() {
		for (int no=1; no<=5; no++) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
	}

	}
}	
