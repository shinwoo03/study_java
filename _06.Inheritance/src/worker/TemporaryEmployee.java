package worker;

public class TemporaryEmployee extends Employee{
//	사번 이름 급여(일당) 근로형태 근무일수
	int workDays;
	TemporaryEmployee( String name, String workType
			, int pay){
		super( name, workType, pay);
	}
	
	void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	
	//	월급여를 계산한다:일당 * 근무일수 
	int getMonthPay() {
		return pay * workDays;
	}
}