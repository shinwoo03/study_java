package message;

public class EmailSender extends MessageSender {
	
	String emailAddress;
	
	EmailSender(String title, String content, String senderName, String emailAddress){
		super(title, content, senderName);
		this.emailAddress = emailAddress;
	}
	
	void sendMessage(String receiver) {
	System.out.println("----이메일 발송 ----");
	System.out.println("이메일 서버에 접속");
	System.out.println("제목 : " + title);
	System.out.println("보낸사람 : " + senderName + "[" + emailAddress + "]");
	System.out.println("받는이 : " + receiver);
	System.out.println("내용 : " + content);
	System.out.println("------------------");
		
	}

}
