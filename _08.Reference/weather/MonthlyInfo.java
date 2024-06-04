package weather;

import cloth.Season;

public class MonthlyInfo {
	int month;
	MonthlyInfo(int month){
		this.month = month;
	}
	
	
	//월별 계절 표현, 날씨 표현
	String getSeason() {
		String season;
		switch(month) {
		case 3: case 4: case 5: //봄
			season = Season.SPRING.getName();
			break;
		case 6: case 7: case 8: //여름
			season = Season.SUMMER.getName();
			break;
		case 9: case 10: case 11: //가을
			season = Season.FALL.getName();
			break;
		case 12: case 1: case 2: default: //겨울
			season = Season.WINTER.getName();
			break;
		}
		return season;
	}
	
	String getWeather() {
		String weather;
		switch(month) {
		case 3: case 4: case 5: //봄
			weather = Weather.CLOUD.getName();
			break;
		case 6: case 7: case 8: //여름
			weather = Weather.SUN.getName();
			break;
		case 9: case 10: case 11: //가을
			weather = Weather.WIND.getName();
			break;
		case 12: case 1: case 2: default: //겨울
			weather = Weather.SNOW.getName();
			break;
			
		}
		return weather;
	}
	
	
}
