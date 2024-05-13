
public class ArrayEx03 {
	public static void main(String[] args) {
		//6과목 시험성적을 배열변수에 담고
		//시험 평균을 출력하기 평균= 합산 / 과목수
		int scores[] = { 75, 68, 88, 96, 89, 98 };
		int sum = 0;
		for (int idx=0; idx<scores.length; idx++) {
			sum += scores[idx]; //누적
			
		}
		System.out.println("시험성적 합계 : " + sum);
		int average = sum/scores.length;
		System.out.println("시험성적 평균 : " + average);
		System.out.printf("시험성적 평균 : %.2f" , sum/(double)scores.length);
		
	}
}
