package horse;

public class HorseThread extends Thread {
	
	String name;
	ShareRank share;
	
	
	public HorseThread(String name, ShareRank share) {
		this.name = name;
		this.share = share;
	}





	@Override
	public void run() {
		//100미터 달리기
		//20미터 지점마다 누군지 어디달리고 있는지 출력하기
		int no;
		for(no=0; no<=100; no++) { //보폭1m
			//20m마다 출력하기
			if(no%20==0) {
				System.out.printf("%s : %d지점 통과  \n",  name, no);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			
			}
			
		}	
		
		//100미터 지점을 통과하면 어떤 말이 몇등으로 도착했는지를 출력하기.
		//100미터 지점일때
		synchronized(share) {
		++share.rank;
		System.out.printf("%s : %d등~! \n", name, share.rank );
		}
	}
	
	

}
