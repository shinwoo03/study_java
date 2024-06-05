
public class operatorEx07 {
	public static void main(String[] args) {
		//삼항연산자(조건연산자) : 조건을 물어봤을 때 ? =>  참인경우 데이터 , 거짓인경우 데이터
		int no= 10;
		boolean tf = no == 10 ? true : false;
		System.out.println(tf);
		
		int tj = no ==10 ? 1 : 0; //no의 데이터가 true이기 때문에 참이어서 결과값이 1임.
		System.out.println(tj);
		
		
		String result = no > 10 ? "no는 10보다 크다" : "no는 10보다 크지 않다";
			System.out.println(result);
		
			int score = 45;
			//Pass : 60점 이상, Fail : 60점 미만
			result = score >= 60 ? "Pass" : "Fail";
			System.out.printf("%d점 : %s \n", score, result);
				
		//수가 짝수/홀수인지 판단 : 2로 나눈 나머지가 0 : 짝수, 1 : 홀수
			no  =53 ;
			result = no % 2 ==0 ? "짝수" : "홀수";
			System.out.printf("%d는 %s \n", no, result);
		
		
		
		
	}
}
