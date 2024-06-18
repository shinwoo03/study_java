package multi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		//서버용소켓
		ServerSocket server = null;
		//클라이언트용 소켓
		Socket client = null;
		
		try {
			server = new ServerSocket(8000);//서버준비
			System.out.println("서버준비됨");
			
			
			while( true ) {
				//클라이언트의 연결요청을 받아서 1:1연결할 소켓만들기
				client = server.accept();
				System.out.printf("클라이언트[%s] 연결완료 \n"
										, client.getInetAddress().toString() );
				
				//클라이언트로부터 받은 메시지를 다수의 클라이언트에게 송신
				ClientThread send = new ClientThread(client);
				send.start();
			}
			
		} catch (IOException e) {
		} 
		
		
	}
	
}