
public class Score {
	public static void main(String[] args) {
		String names[] = { "홍길동", "박문수", "심청", "장화", "홍련" };
		int[] scores = {85, 95, 65, 75, 95};
		
		//각 학생의 성적 출력하기
		//홍길동 성적
		for(int idx=0; idx<names.length; idx++) {
			if ( names[idx].equals("홍길동") ) {
				System.out.println( scores[idx]);
			}
		}
		//장화 성적
		int score = Students(names, scores, "장화");
		System.out.println("장화의 성적 : " + score);
		
	}
	
	//학생의 성적 반환(리턴) 메소드
	static int Students(String[] names, int[] scores, String who ) {
		int score = 0;
		for(int idx=0; idx<names.length; idx++) {
			if ( names[idx].equals(who) ) {
			score = scores[idx];
			}
		}
		return score;
	}
	
	
	
	
}
