package message;

public class SMSSender extends MessageSender {
	String phone;
	SMSSender(String title, String content, String senderName, String phone){
		super(title, content, senderName);
		this.phone = phone;
	}
	
	void sendMessage(String receiver) {
		System.out.println("----SMS 발송----");
		System.out.println("통신사 접속");
		System.out.println("제목 : " + title);
		System.out.println("보낸사람 : " + senderName + "[" + phone + "]");
		System.out.println("받는이 : " + receiver);
		System.out.println("SMS 내용 : " + content);
		System.out.println("------------------");
		
	}
	
}
