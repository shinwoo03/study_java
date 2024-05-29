package account2;

public class MinusAccount extends Account {
	int limit; //마이너스 한도 설정
	
	//생성자 오버로딩(overloading)
	MinusAccount(String owner, String accountNo, int limit){
		super(owner, accountNo);
		this.limit = limit;
	}
	MinusAccount(String owner, String accountNo, int balance ,int limit){
		this(owner, accountNo, limit);
		this.balance = balance;
	}
	
	//마이너스 한도 내에서는 출금 가능
	//super의 메소드를 override.
	int withdraw(int money) throws Exception{
		if( balance+limit < money ) throw new Exception("잔고부족으로 출금불가!");
		balance -= money;
		return money;
	}
	
	
	
	
	
	
}
