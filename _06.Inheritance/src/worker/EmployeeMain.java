package worker;

import java.text.DecimalFormat;

public class EmployeeMain {
	public static void main(String[] args) {
		//정규직 사원 홍길동, 연봉2800만원, 보너스 300%
		RegularEmployee hong = 
				new RegularEmployee("홍길동","정규직",28000000, 300);
		
		//비정규직 사원 박명수, 연봉 3200만원
		ContractEmployee park = 
				new ContractEmployee("박명수","비정규직", 32000000, 24);
		
		//일용직 사원 심청, 일당 10만원
		TemporaryEmployee sim = 
				new TemporaryEmployee("심청", "일용직", 100000);
		sim.setWorkDays(15);
		// 1,500,000
		
		
		
		employeeInfo(hong);
		employeeInfo(park);
		employeeInfo(sim);
		
		
		
	}

	static void employeeInfo (Employee worker) {
		
		DecimalFormat df = new DecimalFormat("###,###,###,000");
		System.out.println("사번: " + worker.employeeNo);
		System.out.println("사원명: " + worker.name);
		System.out.println("근로형태: "+ worker.workType);
		System.out.println("월급여: " + df.format( worker.getMonthPay() )  );
		
		if( worker instanceof RegularEmployee ) {
			//Employee --> RegularEmployee 데이터타입 변환 : DownCasting
			RegularEmployee regular = (RegularEmployee) worker;
			System.out.println("보너스(%) : " + regular.bonus);
			
		}else if (worker instanceof ContractEmployee) {
			ContractEmployee contract = (ContractEmployee) worker;
			System.out.println("계약기간(개월) : " + contract.period);
			
		}else if (worker instanceof TemporaryEmployee) {
			TemporaryEmployee temp = (TemporaryEmployee)worker;
			System.out.println("일당 : " + temp.pay);
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	
	
}
