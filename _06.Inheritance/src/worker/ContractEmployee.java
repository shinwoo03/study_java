package worker;

public class ContractEmployee extends Employee {
//	사번 이름 급여(연봉) 근로형태
	int period;
	ContractEmployee( String name, String workType, int pay, int period){
		super( name, workType, pay);
		this.period = period;
	}
	
	
	//월급여를 계산한다.
	int getMonthPay() {
		return pay / 12;
	}
}
