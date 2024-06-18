package multi;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		//대화자명 지정
//		Scanner scan = new Scanner(System.in);
		System.out.print("대화자명: ");
		String name = "체다네여름";
		
		try {
			Socket client = new Socket( "192.168.0.7", 8000 );
			
			//클라이언트는 송신과 수신을 동시처리
			SendThread send = new SendThread(client, name);
			ReceiveThread receive = new ReceiveThread(client);
			send.start();
			receive.start();
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
		
		
	}
}