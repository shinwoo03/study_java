
public class MethodEx09 {
	public static void main(String[] args) {
		//학생들의 3과목 성적에 대한 평균과 학점 출력하기
		int kang [] = { 80, 98, 68 };
		int kim [] = { 95, 82, 78 };
		int park [] = { 75, 68, 95 };
		int han [] = { 95, 84, 67 };
		
		System.out.printf("강씨의 평균 : %.1f %s학점 \n" , average( kang ), grade(average( kang )));
		System.out.printf("김씨의 평균 : %.1f %s학점 \n" , average( kim ), grade(average( kim )));
		System.out.printf("박씨의 평균 : %.1f %s학점 \n" , average( park ), grade(average( park )));
		System.out.printf("한씨의 평균 : %.1f %s학점 \n" , average( han ), grade(average( han )));
}
	//학점을 계산하는 메소드
	static String grade(double score) {
		String grade;
		if(score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";	
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
	
		return grade;
	
	}
	
	//평균 계산 메소드
	static double average( int[] who ) {
		int sum = 0;
		for(int idx=0; idx<who.length; idx++) {
			sum += who[idx];
		}
		double avg = sum / (double) who.length;
		return avg;
	}

}
