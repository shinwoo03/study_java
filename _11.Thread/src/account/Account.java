package account;

public class Account {
	String owner, accountNo;
	int balance;
	
	public Account(String owner, String accountNo) {
		this.owner = owner;
		this.accountNo = accountNo;
	}
	
	Account(String owner, String accountNo, int balance){
		this(owner, accountNo);
		this.balance = balance;
	}	
	void input (int money) {
		balance += money;
	}
	
	int output(int money) {
		if(balance < money) return 0;
		balance -= money;
		return money;
	}
		
		
	
}
