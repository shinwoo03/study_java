package runnable;

public class DigitRunnable implements Runnable {

	@Override
	public void run() {
		for(int no=1; no<=10; no++) {
			System.out.println(no);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
	}

}
