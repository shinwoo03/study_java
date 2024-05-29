package account2;

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
	CheckCardAccount(){
		System.out.println("CheckCardAccount생성자");
	}
	CheckCardAccount(String owner, String accountNo, String cardNo){
//		this.owner = owner;
//		this.accountNo = accountNo; -> Account로 묵고
		super(owner, accountNo);	//-> super로 묶음.
		this.cardNo = cardNo;
	}
	
	CheckCardAccount(String owner, String accountNo, String cardNo, int balance){
		this(owner, accountNo, cardNo);
		this.balance = balance;
	}
	
	CheckCardAccount( int balance, String owner, String accountNo, String cardNo){
		super(owner, accountNo, balance);
		this.cardNo = cardNo;
	}
	
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