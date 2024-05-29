package account;

public class CheckCardAccount extends Account {
//	String owner, accountNo;
//	int balance;
	String cardNo; //--
	
//	void deposit(int money) {
//		balance += money;
//	}
//	
//	int withdraw(int money) throws Exception{
//		if( money > balance ) throw new Exception("잔고부족 출금불가!");
//		balance -= money;
//		return money;
//	}
	
	//결제하기 --
	int pay(int money, String cardNo) throws Exception {
		if( ! cardNo.equals( this.cardNo ) )
			throw new Exception("결제불가 카드!");
		return withdraw(money);
//		if( money > balance ) 
//				throw new Exception("잔고부족 결제불가!");
//		balance -= money;
//		return money; //결제금액 알려주기
	}
}