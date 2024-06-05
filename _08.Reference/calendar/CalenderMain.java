package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderMain {
	public static void main(String[] args) {
		
		//날짜, 시각과 관련된 클래스 : Calendar, GregorianCalendar
		Calendar c;
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get( Calendar.YEAR );
		System.out.println(year);
		int month = gc.get( Calendar.MONTH ) + 1; //1~12
		System.out.println(month);
		int date = gc.get( Calendar.DATE ); 
		System.out.println(date);
		
		int ampm = gc.get( Calendar.AM_PM);
		System.out.println(ampm == 0 ? "오전" : "오후");
		
		int hour = gc.get( Calendar.HOUR ); 
		System.out.println(hour);
		int minute = gc.get( Calendar.MINUTE ); 
		System.out.println(minute);
		int second = gc.get( Calendar.SECOND ); 
		System.out.println(second);
		
		
		//날짜 지정하기
		gc = new GregorianCalendar(2024,10,5);
		gc = new GregorianCalendar();
		System.out.println(gc.get( Calendar.YEAR ) );
		System.out.println( day( gc.get( Calendar.DAY_OF_WEEK ) ) );
		//일:0 ...토:6
		
		//날짜를 원하는 형태로 포맷시키기
		Date now = gc.getTime(); //현재 날짜/시각정보
		System.out.println( now );
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일a hh: mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  HH: mm:ss");
		System.out.println(sdf.format(now));
		
		System.out.println(sdf.format(new Date()));
	}
	
	static String day ( int no ) {
		String day ;
		switch (no) {
		case 1: day = "일"; break;
		case 2: day = "월"; break;
		case 3: day = "화"; break;
		case 4: day = "수"; break;
		case 5: day = "목"; break;
		case 6: day = "금"; break;
		default: day = "토"; break;
		}
		return day;
	}
	
	
	
}
