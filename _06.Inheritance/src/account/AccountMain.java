package account;

public class AccountMain {
	public static void main(String[] args) {
		//홍길동은 기본통장 개설
		Account hong = new Account();
		hong.owner = "홍길동";
		hong.accountNo = "111-22-333";
		//5만원 입금
		hong.deposit( 50000 );
		
		//박명수는 체크카드 통장 개설
		CheckCardAccount park = new CheckCardAccount();
		park.owner = "박문수";
		park.accountNo = "222-33-444";
		park.cardNo = "2222-3333-4444";
		park.deposit ( 50000 );
		
		try {
			//3만원 구매후 결제
			int paid = park.pay(30000, "2222-3333-4444");
				System.out.println("잔고" + park.balance);
				System.out.println("영수증 결제금액 : " + paid);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
