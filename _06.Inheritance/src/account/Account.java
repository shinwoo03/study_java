package account;

public class Account {
	String owner, accountNo;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int withdraw(int money) throws Exception{
		if( balance < money ) throw new Exception("잔고부족으로 출금불가!");
		balance -= money;
		return money;
	}
	
}