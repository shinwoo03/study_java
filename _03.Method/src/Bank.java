
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
	//출금한다.
	int minusMoeney (int money) {
		total -= money;
		return money;
	}
	
}
