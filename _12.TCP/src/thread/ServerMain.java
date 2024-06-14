package thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket(8000);
			System.out.println( "[서버]" );
			
			client = server.accept();
			System.out.println("클라이언트와 연결 됌");
			
			//클라이언트로부터 수신만 하는 쓰레드
			ReceiveThread receive = new ReceiveThread(client);
			
			//클라이언트에게 송신만 하는 쓰레드
			SendThread send = new SendThread(client);
			
			receive.start();
			send.start();
			
		} catch (IOException e) {
		} finally {
//			try{client.close();}catch(Exception e) {}
//			try{server.close();}catch(Exception e) {}
		}
		
		
		
		
		
		
	}
}
