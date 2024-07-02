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
		
		
		Bank lee = new Bank ();
		lee.bankName = "이해진";
		lee.bankNumber = "1000-001-123-79";
		lee.total = 50000;
		//통장정보 확인
		bankInfo(lee);
		
		//이해진씨가 3만원 입금
		lee.addMoney(30000);
		bankInfo(lee);
		
		//한신우 10만원 출금
		int request = 100000;
		int output = account.minusMoeney(request);
		bankInfo(account, request, output);
		
		
	}
	
	
	static void bankInfo(Bank overall, int request, int hand) {
		System.out.println("예금주 : " + overall.bankName);
		System.out.println("계좌번호 : " + overall.bankNumber);
		System.out.println("출금요청액 : " + request + " 출금된 금액 : " + hand);
		System.out.println("현재 잔액 : " + overall.total);
	}
	
	static void bankInfo(Bank overall) {
		System.out.println("예금주 : " + overall.bankName);
		System.out.println("계좌번호 : " + overall.bankNumber);
		System.out.println("현재 잔액 : " + overall.total);
	}
	
	
	
}
