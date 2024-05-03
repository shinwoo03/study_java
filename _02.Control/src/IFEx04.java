
public class IFEx04 {
public static void main(String[] args) {
	
	//현재의 상황에 따라 다른 상황에 영향을 미칠수가 있다.
	//늦잠을 잤다 : 9시기상 입실  : 9시 20분
	//이번달 단위기간이 20일, 결석을 2번, 지각 2번했다.
	//만약 오늘 지각을 또 하면 결석이 3회가 된다. - 수당을 못받는다.
	//만약 오늘 지각을 안하면 결석이 2회가 된다. - 수당을 받는다.
	//지각을 안하려면 택시를 탄다.
	//택시를 탄다 / 못타는경우 : 택시기본요금 4300원
	int money = 4800;
	int late = 8;
	int arrive;
	
	System.out.println("현재 내 돈 : " + money);
	
	boolean card = true , phone = false;
	
//	if ( money >= 4300 ||card ||phone ) { 
//		System.out.println("택시를 탄다.");
//		arrive = 915;
//	
//	} else {
//		System.out.println("버스를 탄다.");
//		arrive = 940;
//	}
	
	if (money <4300 && card ==false && ! phone) {
		System.out.println("버스를 탄다");
		arrive = 940;
	} else {
		System.out.println("택시를 탄다.");
		arrive = 915;
	}
	
	System.out.println("도착시각 : " + arrive);
	
	// {}내에서 중복선언 불가
	
	
	//도착시각 <= 920 : 지각아님 - 지각
	if( arrive > 920 ) {
		//late = late + 1;
//		late +=1;
		++late;
		System.out.println("오늘 지각함 : 총 지각횟수 " + late);
		
		//지각횟수가 9회 이상이면 수당을 못 받는다.
		//아니면 수당을 받는다.
		
		
		
		
		
	} 
	if( late >=9 ) {
		System.out.println("이번달 수당 못받음");
	} else {
		System.out.println("이번달 수당 받음");
	}
	
	
}
}
