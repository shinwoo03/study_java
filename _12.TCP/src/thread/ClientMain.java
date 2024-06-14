package thread;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[] args) {
		
		Socket client = null;
		
		try {
			client = new Socket("192.168.0.27",8000);
			System.out.println("서버에 연결 됌");
			
			Thread receive = new ReceiveThread( client );
			Thread send = new SendThread( client );
			receive.start();
			send.start();
			
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
		
		
	}

}
