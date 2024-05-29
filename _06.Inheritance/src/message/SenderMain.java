package message;

public class SenderMain {
	public static void main(String[] args) {
		EmailSender email =
		 new EmailSender("생일을 축하합니다", "10% 할인쿠폰이 발급되었습니다.", "고객센터", "admin@hrd.go.kr");
		email.sendMessage("hong@naver.com");
		
		SMSSender sms = 
				new SMSSender("생일을 축하합니다", "10% 할인쿠폰이 발급되었습니다.", "고객센터","02-1234-5678");
		sms.sendMessage("010-9852-6321");
		
		
		
	}
	
	
	
}
