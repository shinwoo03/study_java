
public class Bank {
	//필드 : 계좌번호, 예금주, 잔액
	
	//메소드 : 입금한다 (입금한 금액만큼 잔액을 증가시키기)
	//		: 출금한다 (입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	
	int total;
	String bankName, bankNumber;
	
	//입금한다.
	void addMoney (int money) {
		total += money;
	}
	//출금하고 반환한다.
	int minusMoeney (int money) {
		//통장 잔고보다 출금액이 많으면 출금은 안됨
		if ( total < money ) return 0;
		total -= money;
		return money;
	}
	
}
