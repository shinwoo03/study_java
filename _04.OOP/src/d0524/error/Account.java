package d0524.error;

public class Account {
	//필드 : 계좌번호, 예금주, 잔액
	
	//메소드 : 입금한다 (입금한 금액만큼 잔액을 증가시키기)
	//		: 출금한다 (입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	
//	실습 
//	1. 은행계좌 클래스 선언하기
//	   필드: 계좌번호, 예금주, 잔액
	private String accountNo, owner;
	private int balance;
	
//	this: 클래스 자기자신
//	      생성자/메소드의 파라미터 변수명가 필드명와 같다면
//	      필드를 구분하기 위해 필드앞에 this 키워드를 붙인다
//		  생성자에서 다른 생성자를 호출시
//	              this 키워드를 붙인다
//	              생성자호출문 부터 선언한다
	
	
//	생성자 
	Account(String owner, String accountNo){
		this.owner = owner;
		this.accountNo = accountNo;
	}
	
	Account(String owner, String accountNo, int balance) throws Exception{
		this(owner, accountNo);
		
		if(balance < 0) {
			throw new Exception ( owner + "통장 개설 불가!!");
		}
//		this.owner = owner;
//		this.accountNo = accountNo;
		
		
		this.balance = balance;
		
	}
	
	String getOwner() {
		return owner;
	}
	String getAccountNo() {
		return accountNo;
	}
	int getBalance() {
		return balance;
	}
	
//	   메소드: 입금한다(입금한 금액만큼 잔액을 증가시키기)
	void deposit(int money) {
		balance += money;
	}
//	   출금한다(입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	int withdraw(int money) throws Exception {
		//음수를 입력받으면 오류를 발생시키자
		if( money < 0 ) { 
			throw new Exception("출금액을 음수로 입력불가!");
		}
		//통잔 잔고보다 출금액이 많으면 출금은 안됨
		if( balance < money ) return 0;
		balance -= money;
		return money;
	}
}
