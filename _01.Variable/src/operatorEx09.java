import java.util.Scanner;

public class operatorEx09 {
	public static void main(String[] args) {
		//키보드로 입력받은 성적이 Pass, Fail 인지 출력하기
		
		Scanner scan = new Scanner ( System.in );
		System.out.println("성적이 Pass, Fail 인지 출력하시오.");
		
		
		int no ;
		no = scan.nextInt();
		String odd = no >= 60 ? "Pass" : "Fail";
		System.out.printf("성적 : %d점 %s \n",no,odd);
		
		
		//입력한 성적에 대한 학점 출력하기
		//90점 이상 : A학점
		//80점 이상 : B학점
		//70점 이상 : C학점
		//60점 이상 : D학점
		//그외 : F학점
		String grade = no >= 90 ? "A" 
					: (no >= 80 ? "B" 
							: (no >= 70 ? "C" 
									: (no >= 60 ? "D" : "F")));
		System.out.printf("성적 : %d점 -> %s학점",no,grade);
				
		
		
		
		
		
	}
}
