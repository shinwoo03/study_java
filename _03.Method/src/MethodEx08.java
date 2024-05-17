
public class MethodEx08 {
	public static void main(String[] args) {
		
		//체질량 지수(BMI:성인 대상) = 체중(kg) / 신장
		// 1. 18.5이하 : 저체중
//	      2. 18.8~23 : 정상
//	      3. 23~25 : 과체중
//	      4. 25~30 : 비만
//	      5. 30이상 : 고도비만
		
		double height=173.4, weight=55.9 ;	
		//홍길동의 키, 체중 정보
		double bmi = bmi(height, weight);
		System.out.printf("홍길동[키:%.1f, 체중:%.1f]의 지수 : %.1f \n" , height, weight,bmi);
		System.out.println(bmi(bmi));
		//심청의 키, 체중 정보
		height=187.4;
		weight=88.9;
		bmi = bmi(height, weight);
		System.out.printf("심청[키:%.1f, 체중:%.1f]의 지수 : %.1f \n" , height, weight,bmi);
		System.out.println(bmi(bmi));
	}
	//메소드 오버로딩
	//파라미터의 갯수가 다르게 하거나, 테이터 타입을 다르게 하여 동일한 이름의 메소드를 여러개 선언하는것.
	//BMI지수에 따른 값 계산하는 메소드
	static String bmi ( double bmi ) {
		String name;
		if(bmi <= 18.5) {
			name = "저체중";
		}else if ( 18.5 < bmi && bmi <= 23) {
			
			name = "정상";
		}else if ( 23 < bmi && bmi <= 25) {
			name = "과체중";
		}else if ( 25 < bmi && bmi <= 30) {
			name = "비만";
			
		}else {
			name = "고도비만";
			
		}
		return name;
	}
	
	
	//BMI지수 계산하는 메소드
	static double bmi(double h, double w) {
		h *= 0.01;
		double bmi = w / ( h * h );
		
		return bmi;
		
	}
	
	
}
