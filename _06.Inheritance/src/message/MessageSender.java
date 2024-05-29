package message;

abstract public class MessageSender {
	String title, content, senderName;
	//제목, 내용, 발송자명
	//메시지를 발송한다
	
	MessageSender(String title, String content, String senderName){
		this.title = title;
		this.content = content;
		this.senderName = senderName;
	}
	
	
	abstract void sendMessage(String receiver) ;
	

}
