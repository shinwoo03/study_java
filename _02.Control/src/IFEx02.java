
public class IFEx02 {
public static void main(String[] args) {
	//어떤 수가 홀수/짝수인지 출력하기
	int no = 4;
	//2로 나눈 나머지가 0이면 짝수
	//2로 나눈 나머지가 1이면 홀수
	if( no % 2 ==0 ) {
		System.out.println(no + "는 짝수");
	}
	
	if (no % 2 == 1) {
		System.out.println(no + "는 홀수");
	}
	
	
	
	

	
	//실습하기
	//성적이 Pass/Fail(기준 60점) 인지 출력하기 -> if문
	//내성적이 60점 이상이면 Pass 
	//내성적이 60점 미만이면 Fail 
	// >= 이상, <= 이하
	
	int score = 45;
	if (score >=60 ) {
		System.out.printf("내 성적 : %d점! Pass \n", score );
	}
	if (score < 60) {
		System.out.printf("내 성적 : %d점 Fail \n", score);
	}
	
	System.out.println("finished");
	
	
	
	
}
}
