package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {
	Socket client;
	
	public ReceiveThread(Socket client) {
		this.client = client;
	}


	@Override
	public void run() {
		//클라이언트로부터 수신한 메시지를 읽어들이기
		try {
			BufferedReader reader 
				= new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			
			while( true ) {
				String receive = reader.readLine();
				if( receive==null ) break;  //수신메시지 없으면 stop
				System.out.println( receive );
			}
			
		} catch (IOException e) {
		} finally {
			try{ client.close(); }catch(Exception e) {}
		}
	}

	
}