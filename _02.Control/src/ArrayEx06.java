import java.util.Scanner;

public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//4과목 시험성적 입력하기 - 배열 사용하기
		//4과목의 평균 출력하기, 평균의 대한 학점 출력하기
		//과목의 이름 넣기
		String subjects[] = {"자바", "HTML","CSS","자바스크립트"};//= new String[4];
	
		int[] scores = new int[4]; //성적을 배열해줄 변수 선언
		System.out.println("각 과목의 성적을 입력하세요!");
		for (int idx=0; idx<subjects.length; idx++) {
			
			System.out.printf("%s :  \n", subjects[idx]);
			scores[idx] = scan.nextInt();
			
		}
		int total = 0;
		for(int idx=0; idx<subjects.length; idx++) {
			total +=scores[idx];
		}
		System.out.println("총점 : " + total);
		
		double avg = total / (double)scores.length; //>평균구하기< 소수점까지 나오게 하기 위해서 한쪽을 부동소수점으로 바꾸기
		System.out.printf("평균 : %.1f \n" , avg);
		 
		String grade;
		if (avg>= 90) {
			grade = "A";
		}else if (avg >= 80) { grade = "B";}
		else if (avg >= 70) { grade = "C";}
		else if (avg >= 60) { grade = "D";}
		else { grade = "F";}
			System.out.println("학점 : "+ grade);
		
		
		
		
		
		
		
		
		
	}
}
