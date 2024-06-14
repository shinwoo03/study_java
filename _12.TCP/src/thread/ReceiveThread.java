package thread;

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
		//소켓을 통해 받은 메시지를 콘솔에 출력
		BufferedReader reader = null;
		try {
			reader = new BufferedReader ( new InputStreamReader( client.getInputStream() ) );
			
			while(true) {
				String line = reader.readLine();
				if( line==null) break;
				System.out.println("수신> " + line);
			}
			
		} catch (IOException e) {
		} finally {
			try{ reader.close(); }catch(Exception e) {}
			try{ client.close(); }catch(Exception e) {}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
