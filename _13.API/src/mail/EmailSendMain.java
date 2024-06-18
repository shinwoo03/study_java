package mail;

import java.util.Scanner;

public class EmailSendMain {
	public static void main(String[] args) {
		//메일 수신자 지정
		Scanner scan = new Scanner(System.in);
		System.out.print("메일수신자명: ");
		String name = scan.next();
		
		System.out.print("메일주소: ");
		String email = scan.next();
		scan.close();
		
		EmailSender sender = new EmailSender();
//		sender.sendMail(name, email);
		sender.sendHtmlMail(name, email);
		
	}
}