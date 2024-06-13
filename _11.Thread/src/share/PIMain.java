package share;

public class PIMain {
	public static void main(String[] args) {
		
		ShareData share = new ShareData();
		
		PIThread pi = new PIThread(share);
		PrintThread print = new PrintThread(share);
		int radius = 5;
		AreaThread area = new AreaThread(share,radius);
		AroundThread around = new AroundThread(share, radius);
//		pi.share = share;
//		print.share = share;
		
		
		area.start();
		around.start();
		pi.start();
		print.start();
		
		
		
	}

}
