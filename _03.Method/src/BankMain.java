//통장정보출력 : 예금주, 계좌번호, 잔액을 출력
//5만원 입금한 후 출력
//3만원 출금한 후 출력


public class BankMain {
	public static void main(String[] args) {
		
//은행계좌 객체 생성하기
		Bank account = new Bank ();
		
		account.bankName = "한신우";
		account.bankNumber = "0000-001-354-78";
//		System.out.println("예금주 : " + account.bankName);
//		System.out.println("계좌번호 : " + account.bankNumber);
		
		
		account.addMoney(50000);
		bankInfo(account);
		System.out.println();
		
		int out = account.minusMoeney(30000);
		System.out.println("출금 금액 : " + out);
		bankInfo(account);
	}
	
	
	
	static void bankInfo(Bank overall) {
		System.out.println("예금주 : " + overall.bankName);
		System.out.println("계좌번호 : " + overall.bankNumber);
		System.out.println("현재 잔액 : " + overall.total);
	}
	
	
	
}
