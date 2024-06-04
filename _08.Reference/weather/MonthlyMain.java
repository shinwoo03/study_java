package weather;

import java.util.Scanner;

public class MonthlyMain {
	public static void main(String[] args) {
		//키보드로 월 을 입력하면
		//해당월의 계절과 날씨 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 월? ");
		int month = scan.nextInt();
		MonthlyInfo info = new MonthlyInfo (month);
		System.out.printf("%d월은 %s이고 날씨 특징은 %s", month, info.getSeason(), info.getWeather());
		
				
	}

}
