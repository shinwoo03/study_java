package account2;

public class AccountMain {
	static void info(Account who) {
		//who 의 데이터타입을 확인
		
		if ( who instanceof CheckCardAccount ) {
			System.out.println("마이너스통장------- ");
		}else if ( who instanceof MinusAccount ) {
			System.out.println("마이너스통장------- ");
		}else {
			System.out.println("일반통장-------");
			
		}
		
		
		System.out.println("일반통장-------");
		System.out.println("예금주 : " + who.owner);
		System.out.println("계좌번호 : " + who.accountNo);
		System.out.println("잔고 : " + who.balance);
		if( who instanceof CheckCardAccount ) {
			//Account 타입을 -> CheckCardAccount : DownCasting 부모로부터 서브로 형변화
			CheckCardAccount check = (CheckCardAccount)who;
			System.out.println("카드번호 : " + check.cardNo);
			
		}else if ( who instanceof MinusAccount ) {
			//Account 타입을 -> MinusAccount : DownCasting 
			MinusAccount minus = (MinusAccount)who;
			System.out.println("마이너스한도 : " + minus.limit);
		}
		System.out.println();
		int no1 = 10;
		long no2 = (long)no1;
	}
	static void info(CheckCardAccount who) {
		System.out.println("체크카드통장------- ");
		System.out.println("예금주 : " + who.owner);
		System.out.println("계좌번호 : " + who.accountNo);
		System.out.println("잔고 : " + who.balance);
		System.out.println("카드번호 : " + who.cardNo);
		System.out.println();
	}
	static void info(MinusAccount who) {
		System.out.println("마이너스통장------- ");
		System.out.println("예금주 : " + who.owner);
		System.out.println("계좌번호 : " + who.accountNo);
		System.out.println("잔고 : " + who.balance);
		System.out.println("마이너스한도 : " + who.limit);
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
//		final  int  no = 10; //변수 -> 상수
//		no = 20;
		
		Account hong 
		= new Account("홍길동", "111-22-333");
		info(hong);
		
		
		Account park
			= new CheckCardAccount("박문수", "222-33-444"
							, "2222-3333-4444", 50000);
		info(park);
		
		Account sim = 
		new MinusAccount("심청", "333-22-4444", 1000000);
		info(sim);
		sim.deposit(100000);
		System.out.println("잔고: " + sim.balance);
		try {
			int money = sim.withdraw(500000);
			System.out.println("출금된금액: " + money);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("잔고: " + sim.balance);
			
		}
		
		try {
			int money = sim.withdraw( 800000 );
			System.out.println("출금된금액: " + money);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("잔고: " + sim.balance);
		}
		
	}
}