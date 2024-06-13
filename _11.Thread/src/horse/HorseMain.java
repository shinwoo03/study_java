package horse;

public class HorseMain {
	public static void main(String[] args) {
		
		
//		경주마 5마리가 100미터 달리기 경주를 하는 멀티쓰레드 프로그램 만들기
//		쓰레드가 5개 메인 하나
//		1. Thread 클래스 상속받아 Horse 클래스 선언
//		2. 처리내용 : 
//		   20미터 간격으로 현재 지나치는 지점과 경주마 이름 출력하기
//		   20미터 통과시마다 1초정도 sleep(1000) 지정하기
//		   100미터 지점을 통과하면 어떤 경주마가 몇 등으로 도착했는지를 출력하기
//		3. 공유 : rank 순위 - 동기화처리하기.
		
		ShareRank share = new ShareRank();
		
		HorseThread horse1 = new HorseThread("강철여걸", share);
		HorseThread horse2 = new HorseThread("마하비상", share);
		HorseThread horse3 = new HorseThread("당대초월", share);
		HorseThread horse4 = new HorseThread("빛의순간", share);
		HorseThread horse5 = new HorseThread("청산질주", share);
		
		horse1.start();
		horse2.start();
		horse3.start();
		horse4.start();
		horse5.start();
		
		
		
	}

}
