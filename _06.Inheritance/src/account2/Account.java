package account2;

public class Account {
	String owner, accountNo;
	int balance;
	
	Account(){
		System.out.println("Account생성자");
	}
	Account(String owner, String accountNo){
		this.accountNo = accountNo;
		this.owner = owner;
	}
	
	Account(String owner, String accountNo, int balace){
		this(owner, accountNo);
		this.balance = balance;
	}
	
	
	void deposit(int money) {
		balance += money;
	}
	
	int withdraw(int money) throws Exception{
		if( balance < money ) throw new Exception("잔고부족으로 출금불가!");
		balance -= money;
		return money;
	}
	
}