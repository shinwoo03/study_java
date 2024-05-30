package worker;

public class RegularEmployee extends Employee {
//	사번 이름 급여(연봉) 근로형태
	int bonus;
	RegularEmployee( String name, String workType, int pay, int bonus ) {
		super( name, workType, pay);
		this.bonus = bonus;
	}
	
	
//	월급여를 계산한다.
	//(연봉)/12 * (1+0.5)
	int getMonthPay() {
		return(int)( pay / 12 * (1+bonus*0.001));
		
	}

}
