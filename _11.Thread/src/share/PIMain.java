package share;

public class PIMain {
	public static void main(String[] args) {
		
		ShareData share = new ShareData();
		
		PIThread pi = new PIThread(share);
		PrintThread print = new PrintThread(share);
//		pi.share = share;
//		print.share = share;
		
		pi.start();
		print.start();
		
		
		
	}

}
